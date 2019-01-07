/*
 * Aipo is a groupware program developed by Aimluck,Inc.
 * Copyright (C) 2004-2011 Aimluck,Inc.
 * http://www.aipo.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aipo.social.opensocial.spi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;

import javax.servlet.http.HttpServletResponse;

import org.apache.shindig.auth.SecurityToken;
import org.apache.shindig.common.util.ImmediateFuture;
import org.apache.shindig.protocol.ProtocolException;
import org.apache.shindig.protocol.RestfulCollection;
import org.apache.shindig.social.core.model.NameImpl;
import org.apache.shindig.social.core.model.PersonImpl;
import org.apache.shindig.social.opensocial.model.Name;
import org.apache.shindig.social.opensocial.model.Person;
import org.apache.shindig.social.opensocial.spi.CollectionOptions;
import org.apache.shindig.social.opensocial.spi.GroupId;
import org.apache.shindig.social.opensocial.spi.PersonService;
import org.apache.shindig.social.opensocial.spi.UserId;

import com.aipo.orm.model.security.TurbineUser;
import com.aipo.orm.service.TurbineUserDbService;
import com.aipo.orm.service.request.SearchOptions;
import com.aipo.orm.service.request.SearchOptions.FilterOperation;
import com.aipo.orm.service.request.SearchOptions.SortOrder;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * 
 */
public class AipoPersonService extends AbstractService implements PersonService {

  private final TurbineUserDbService turbineUserDbService;

  /**
   * 
   */
  @Inject
  public AipoPersonService(TurbineUserDbService turbineUserSercice) {
    this.turbineUserDbService = turbineUserSercice;
  }

  /**
   * 
   * @param userIds
   * @param groupId
   * @param collectionOptions
   * @param fields
   * @param token
   * @return
   * @throws ProtocolException
   */
  public Future<RestfulCollection<Person>> getPeople(Set<UserId> userIds,
      GroupId groupId, CollectionOptions collectionOptions, Set<String> fields,
      SecurityToken token) throws ProtocolException {

    // TODO: FIELDS

    setUp(token);

    // Search
    SearchOptions options =
      SearchOptions.build().withRange(
        collectionOptions.getMax(),
        collectionOptions.getFirst()).withFilter(
        collectionOptions.getFilter(),
        collectionOptions.getFilterOperation() == null
          ? FilterOperation.equals
          : FilterOperation.valueOf(collectionOptions
            .getFilterOperation()
            .toString()),
        collectionOptions.getFilterValue()).withSort(
        collectionOptions.getSortBy(),
        collectionOptions.getSortOrder() == null
          ? SortOrder.ascending
          : SortOrder.valueOf(collectionOptions.getSortOrder().toString()));

    List<TurbineUser> list = null;
    int totalResults = 0;
    switch (groupId.getType()) {
      case all:
      case friends:
        // /people/{guid}/@all
        // /people/{guid}/@friends
        // {guid} が閲覧できるすべてのユーザーを取得
        // @all = @friends
        list = turbineUserDbService.find(options);
        totalResults = turbineUserDbService.getCount(options);
        break;
      case groupId:
        // /people/{guid}/{groupId}
        // /people/{guid}/{groupId}
        // {guid} が閲覧できるすべてのユーザーで {groupId} グループに所属しているものを取得
        list =
          turbineUserDbService.findByGroupname(groupId.getGroupId(), options);
        totalResults =
          turbineUserDbService.getCountByGroupname(
            groupId.getGroupId(),
            options);
        break;
      case deleted:
        // /people/{guid}/@deleted
        // {guid} が閲覧できる無効なユーザーを取得
        list = Lists.newArrayList();
        break;
      case self:
        // {guid} 自身のユーザー情報を取得
        list = Lists.newArrayList();
        totalResults = 1;
        break;
      default:
        throw new ProtocolException(
          HttpServletResponse.SC_BAD_REQUEST,
          "Group ID not recognized");
    }

    List<Person> result = new ArrayList<Person>(list.size());
    for (TurbineUser user : list) {
      result.add(assignPerson(user, fields, token));
    }

    RestfulCollection<Person> restCollection =
      new RestfulCollection<Person>(
        result,
        collectionOptions.getFirst(),
        totalResults,
        collectionOptions.getMax());
    return ImmediateFuture.newInstance(restCollection);

  }

  /**
   * 
   * @param id
   * @param fields
   * @param token
   * @return
   * @throws ProtocolException
   */
  public Future<Person> getPerson(UserId id, Set<String> fields,
      SecurityToken token) throws ProtocolException {

    // TODO: FIELDS

    setUp(token);

    String userId = getUserId(id, token);
    TurbineUser user = turbineUserDbService.findByUsername(userId);

    Person person = null;
    if (user != null) {
      person = assignPerson(user, fields, token);
    }

    return ImmediateFuture.newInstance(person);
  }

  protected Person assignPerson(TurbineUser user, Set<String> fields,
      SecurityToken token) {
    String userId =
      new StringBuilder(getOrgId(token) + ":" + user.getLoginName()).toString();
    String displayName =
      new StringBuilder(user.getLastName()).append(" ").append(
        user.getFirstName()).toString();
    Name name = new NameImpl();
    name.setFamilyName(user.getLastName());
    name.setGivenName(user.getFirstName());
    Person person = new PersonImpl(userId, displayName, name);
    return person;
  }

}
