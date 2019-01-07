package com.aipo.orm.model.portlet.auto;

import java.util.Date;

import org.apache.cayenne.CayenneDataObject;

/**
 * Class _EipMMailNotifyConf was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EipMMailNotifyConf extends CayenneDataObject {

    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String NOTIFY_FLG_PROPERTY = "notifyFlg";
    public static final String NOTIFY_TIME_PROPERTY = "notifyTime";
    public static final String NOTIFY_TYPE_PROPERTY = "notifyType";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";

    public static final String NOTIFY_ID_PK_COLUMN = "NOTIFY_ID";

    public void setCreateDate(Date createDate) {
        writeProperty("createDate", createDate);
    }
    public Date getCreateDate() {
        return (Date)readProperty("createDate");
    }

    public void setNotifyFlg(Integer notifyFlg) {
        writeProperty("notifyFlg", notifyFlg);
    }
    public Integer getNotifyFlg() {
        return (Integer)readProperty("notifyFlg");
    }

    public void setNotifyTime(Date notifyTime) {
        writeProperty("notifyTime", notifyTime);
    }
    public Date getNotifyTime() {
        return (Date)readProperty("notifyTime");
    }

    public void setNotifyType(Integer notifyType) {
        writeProperty("notifyType", notifyType);
    }
    public Integer getNotifyType() {
        return (Integer)readProperty("notifyType");
    }

    public void setUpdateDate(Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public Date getUpdateDate() {
        return (Date)readProperty("updateDate");
    }

    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }

}