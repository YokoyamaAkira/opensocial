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

import org.apache.shindig.social.opensocial.oauth.OAuthDataStore;
import org.apache.shindig.social.opensocial.spi.AppDataService;
import org.apache.shindig.social.opensocial.spi.PersonService;

import com.aipo.social.opensocial.oauth.AipoOAuthDataStore;
import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.multibindings.Multibinder;
import com.google.inject.name.Names;

/**
 * 
 */
public class AipoSocialModule extends AbstractModule {

  /**
   * {@inheritDoc}
   * 
   * @see com.google.inject.AbstractModule#configure()
   */
  @Override
  protected void configure() {
    bind(ActivityService.class).to(AipoActivityService.class).in(
      Scopes.SINGLETON);
    // bind(AlbumService.class).to(JsonDbOpensocialService.class);
    // bind(MediaItemService.class).to(JsonDbOpensocialService.class);
    bind(AppDataService.class)
      .to(AipoAppDataService.class)
      .in(Scopes.SINGLETON);
    bind(PersonService.class).to(AipoPersonService.class).in(Scopes.SINGLETON);
    bind(GroupService.class).to(AipoGroupService.class).in(Scopes.SINGLETON);
    // bind(MessageService.class).to(JsonDbOpensocialService.class);
    bind(OAuthDataStore.class).to(AipoOAuthDataStore.class);

    Multibinder.newSetBinder(binder(), Object.class, Names
      .named("org.apache.shindig.handlers"));
  }
}
