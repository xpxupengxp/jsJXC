package com.js.entity;

import java.io.Serializable;

/**
 * 组织机构类（js_org）
 */
public class Org implements Serializable {
    private Integer orgId;//编号

    private String orgCode;//组织编码

    private String orgDesc;//组织描述

    private String orgName;//组织名称

    private Integer orgParentid;//所属组织

    private Integer orgSequence;//组织排序

    private Integer orgTypeId;//组织类型ID

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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode == null ? null : orgCode.trim();
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc == null ? null : orgDesc.trim();
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getOrgParentid() {
        return orgParentid;
    }

    public void setOrgParentid(Integer orgParentid) {
        this.orgParentid = orgParentid;
    }

    public Integer getOrgSequence() {
        return orgSequence;
    }

    public void setOrgSequence(Integer orgSequence) {
        this.orgSequence = orgSequence;
    }

    public Integer getOrgTypeId() {
        return orgTypeId;
    }

    public void setOrgTypeId(Integer orgTypeId) {
        this.orgTypeId = orgTypeId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}