package com.aipo.orm.model.portlet.auto;

import org.apache.cayenne.CayenneDataObject;

import com.aipo.orm.model.portlet.EipMMailAccount;
import com.aipo.orm.model.portlet.EipTMailFolder;

/**
 * Class _EipTMailFilter was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _EipTMailFilter extends CayenneDataObject {

    public static final String FILTER_NAME_PROPERTY = "filterName";
    public static final String FILTER_STRING_PROPERTY = "filterString";
    public static final String FILTER_TYPE_PROPERTY = "filterType";
    public static final String SORT_ORDER_PROPERTY = "sortOrder";
    public static final String EIP_MMAIL_ACCOUNT_PROPERTY = "eipMMailAccount";
    public static final String EIP_TMAIL_FOLDER_PROPERTY = "eipTMailFolder";

    public static final String FILTER_ID_PK_COLUMN = "FILTER_ID";

    public void setFilterName(String filterName) {
        writeProperty("filterName", filterName);
    }
    public String getFilterName() {
        return (String)readProperty("filterName");
    }

    public void setFilterString(String filterString) {
        writeProperty("filterString", filterString);
    }
    public String getFilterString() {
        return (String)readProperty("filterString");
    }

    public void setFilterType(String filterType) {
        writeProperty("filterType", filterType);
    }
    public String getFilterType() {
        return (String)readProperty("filterType");
    }

    public void setSortOrder(Integer sortOrder) {
        writeProperty("sortOrder", sortOrder);
    }
    public Integer getSortOrder() {
        return (Integer)readProperty("sortOrder");
    }

    public void setEipMMailAccount(EipMMailAccount eipMMailAccount) {
        setToOneTarget("eipMMailAccount", eipMMailAccount, true);
    }

    public EipMMailAccount getEipMMailAccount() {
        return (EipMMailAccount)readProperty("eipMMailAccount");
    }


    public void setEipTMailFolder(EipTMailFolder eipTMailFolder) {
        setToOneTarget("eipTMailFolder", eipTMailFolder, true);
    }

    public EipTMailFolder getEipTMailFolder() {
        return (EipTMailFolder)readProperty("eipTMailFolder");
    }


}
