package com.aipo.orm.model.portlet.auto;

import java.util.Date;
import java.util.List;

import org.apache.cayenne.CayenneDataObject;

import com.aipo.orm.model.portlet.EipTExtTimecardSystemMap;

/**
 * Class _EipTExtTimecardSystem was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EipTExtTimecardSystem extends CayenneDataObject {

    public static final String CHANGE_HOUR_PROPERTY = "changeHour";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String END_HOUR_PROPERTY = "endHour";
    public static final String END_MINUTE_PROPERTY = "endMinute";
    public static final String OUTGOING_ADD_FLAG_PROPERTY = "outgoingAddFlag";
    public static final String RESTTIME_IN_PROPERTY = "resttimeIn";
    public static final String RESTTIME_OUT_PROPERTY = "resttimeOut";
    public static final String START_HOUR_PROPERTY = "startHour";
    public static final String START_MINUTE_PROPERTY = "startMinute";
    public static final String SYSTEM_NAME_PROPERTY = "systemName";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String WORKTIME_IN_PROPERTY = "worktimeIn";
    public static final String WORKTIME_OUT_PROPERTY = "worktimeOut";
    public static final String EIP_TEXT_TIMECARD_SYSTEM_MAPS_PROPERTY = "eipTExtTimecardSystemMaps";

    public static final String SYSTEM_ID_PK_COLUMN = "SYSTEM_ID";

    public void setChangeHour(Integer changeHour) {
        writeProperty("changeHour", changeHour);
    }
    public Integer getChangeHour() {
        return (Integer)readProperty("changeHour");
    }

    public void setCreateDate(Date createDate) {
        writeProperty("createDate", createDate);
    }
    public Date getCreateDate() {
        return (Date)readProperty("createDate");
    }

    public void setEndHour(Integer endHour) {
        writeProperty("endHour", endHour);
    }
    public Integer getEndHour() {
        return (Integer)readProperty("endHour");
    }

    public void setEndMinute(Integer endMinute) {
        writeProperty("endMinute", endMinute);
    }
    public Integer getEndMinute() {
        return (Integer)readProperty("endMinute");
    }

    public void setOutgoingAddFlag(String outgoingAddFlag) {
        writeProperty("outgoingAddFlag", outgoingAddFlag);
    }
    public String getOutgoingAddFlag() {
        return (String)readProperty("outgoingAddFlag");
    }

    public void setResttimeIn(Integer resttimeIn) {
        writeProperty("resttimeIn", resttimeIn);
    }
    public Integer getResttimeIn() {
        return (Integer)readProperty("resttimeIn");
    }

    public void setResttimeOut(Integer resttimeOut) {
        writeProperty("resttimeOut", resttimeOut);
    }
    public Integer getResttimeOut() {
        return (Integer)readProperty("resttimeOut");
    }

    public void setStartHour(Integer startHour) {
        writeProperty("startHour", startHour);
    }
    public Integer getStartHour() {
        return (Integer)readProperty("startHour");
    }

    public void setStartMinute(Integer startMinute) {
        writeProperty("startMinute", startMinute);
    }
    public Integer getStartMinute() {
        return (Integer)readProperty("startMinute");
    }

    public void setSystemName(String systemName) {
        writeProperty("systemName", systemName);
    }
    public String getSystemName() {
        return (String)readProperty("systemName");
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

    public void setWorktimeIn(Integer worktimeIn) {
        writeProperty("worktimeIn", worktimeIn);
    }
    public Integer getWorktimeIn() {
        return (Integer)readProperty("worktimeIn");
    }

    public void setWorktimeOut(Integer worktimeOut) {
        writeProperty("worktimeOut", worktimeOut);
    }
    public Integer getWorktimeOut() {
        return (Integer)readProperty("worktimeOut");
    }

    public void addToEipTExtTimecardSystemMaps(EipTExtTimecardSystemMap obj) {
        addToManyTarget("eipTExtTimecardSystemMaps", obj, true);
    }
    public void removeFromEipTExtTimecardSystemMaps(EipTExtTimecardSystemMap obj) {
        removeToManyTarget("eipTExtTimecardSystemMaps", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<EipTExtTimecardSystemMap> getEipTExtTimecardSystemMaps() {
        return (List<EipTExtTimecardSystemMap>)readProperty("eipTExtTimecardSystemMaps");
    }


}