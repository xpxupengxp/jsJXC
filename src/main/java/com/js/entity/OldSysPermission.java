package com.js.entity;

import java.io.Serializable;

/**
 * 系统权限类（js_old_sys_permission）
 */
public class OldSysPermission implements Serializable {
    private Integer permsId;//权限编号

    private String permsDesc;//权限描述

    private String permsImg;//权限图标

    private String permsLevel;//菜单级别

    private String permsName;//权限名称

    private String permsNameCn;//中文权限名

    private Integer permsParentid;//父权限ID

    private String permsType;//权限类型

    private String permsUrl;//URL地址

    private String sequence;//排序值

    private String objectId;//对象编号

    private Integer status;//状态（0:禁用，1:正常）

    private static final long serialVersionUID = 1L;

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）


    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Integer getPermsId() {
        return permsId;
    }

    public void setPermsId(Integer permsId) {
        this.permsId = permsId;
    }

    public String getPermsDesc() {
        return permsDesc;
    }

    public void setPermsDesc(String permsDesc) {
        this.permsDesc = permsDesc == null ? null : permsDesc.trim();
    }

    public String getPermsImg() {
        return permsImg;
    }

    public void setPermsImg(String permsImg) {
        this.permsImg = permsImg == null ? null : permsImg.trim();
    }

    public String getPermsLevel() {
        return permsLevel;
    }

    public void setPermsLevel(String permsLevel) {
        this.permsLevel = permsLevel == null ? null : permsLevel.trim();
    }

    public String getPermsName() {
        return permsName;
    }

    public void setPermsName(String permsName) {
        this.permsName = permsName == null ? null : permsName.trim();
    }

    public String getPermsNameCn() {
        return permsNameCn;
    }

    public void setPermsNameCn(String permsNameCn) {
        this.permsNameCn = permsNameCn == null ? null : permsNameCn.trim();
    }

    public Integer getPermsParentid() {
        return permsParentid;
    }

    public void setPermsParentid(Integer permsParentid) {
        this.permsParentid = permsParentid;
    }

    public String getPermsType() {
        return permsType;
    }

    public void setPermsType(String permsType) {
        this.permsType = permsType == null ? null : permsType.trim();
    }

    public String getPermsUrl() {
        return permsUrl;
    }

    public void setPermsUrl(String permsUrl) {
        this.permsUrl = permsUrl == null ? null : permsUrl.trim();
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence == null ? null : sequence.trim();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}