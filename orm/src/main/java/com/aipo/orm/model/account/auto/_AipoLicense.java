package com.aipo.orm.model.account.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _AipoLicense was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AipoLicense extends CayenneDataObject {

    public static final String LICENSE_PROPERTY = "license";
    public static final String LIMIT_USERS_PROPERTY = "limitUsers";

    public static final String LICENSE_ID_PK_COLUMN = "LICENSE_ID";

    public void setLicense(String license) {
        writeProperty("license", license);
    }
    public String getLicense() {
        return (String)readProperty("license");
    }

    public void setLimitUsers(Integer limitUsers) {
        writeProperty("limitUsers", limitUsers);
    }
    public Integer getLimitUsers() {
        return (Integer)readProperty("limitUsers");
    }

}
