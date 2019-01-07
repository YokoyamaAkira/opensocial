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
 * This program is distributed i    n the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aipo.social.core.model;

import com.aipo.social.opensocial.model.Group;

/**
 * @see org.apache.shindig. social.core.model.GroupImpl
 */
public class ALGroupImpl extends org.apache.shindig.social.core.model.GroupImpl
    implements Group {

  private String type;

  /**
   * @return
   */
  @Override
  public String getType() {
    return type;
  }

  /**
   * @param type
   */
  @Override
  public void setType(String type) {
    this.type = type;
  }

}
