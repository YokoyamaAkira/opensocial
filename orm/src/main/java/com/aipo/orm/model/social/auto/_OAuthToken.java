package com.aipo.orm.model.social.auto;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _OAuthToken was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _OAuthToken extends CayenneDataObject {

    public static final String ACCESS_TOKEN_PROPERTY = "accessToken";
    public static final String ID_PROPERTY = "id";
    public static final String SESSION_HANDLE_PROPERTY = "sessionHandle";
    public static final String TOKEN_EXPIRE_MILIS_PROPERTY = "tokenExpireMilis";
    public static final String TOKEN_SECRET_PROPERTY = "tokenSecret";

    public static final String ID_PK_COLUMN = "ID";

    public void setAccessToken(String accessToken) {
        writeProperty("accessToken", accessToken);
    }
    public String getAccessToken() {
        return (String)readProperty("accessToken");
    }

    public void setId(Integer id) {
        writeProperty("id", id);
    }
    public Integer getId() {
        return (Integer)readProperty("id");
    }

    public void setSessionHandle(String sessionHandle) {
        writeProperty("sessionHandle", sessionHandle);
    }
    public String getSessionHandle() {
        return (String)readProperty("sessionHandle");
    }

    public void setTokenExpireMilis(Integer tokenExpireMilis) {
        writeProperty("tokenExpireMilis", tokenExpireMilis);
    }
    public Integer getTokenExpireMilis() {
        return (Integer)readProperty("tokenExpireMilis");
    }

    public void setTokenSecret(String tokenSecret) {
        writeProperty("tokenSecret", tokenSecret);
    }
    public String getTokenSecret() {
        return (String)readProperty("tokenSecret");
    }

}
