package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 仓库类（js_warehouse）
 */
public class Warehouse implements Serializable {
    private Integer whId;//仓库编号

    private String whName;//仓库名称

    private String whAddress;//仓库地址

    private BigDecimal whCapacity;//仓库容量

    private String whCode;//仓库编码

    private String whDesc;//仓库描述

    private String whSite;//仓库地点

    private Integer whTypeId;//仓库类型ID

    private BigDecimal whWarnVal;//预警值

    private String orgName;//所属机构

    private static final long serialVersionUID = 1L;




    private Integer[] whIds;//仓库编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Integer[] getWhIds() {
        return whIds;
    }

    public void setWhIds(Integer[] whIds) {
        this.whIds = whIds;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

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

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public String getWhName() {
        return whName;
    }

    public void setWhName(String whName) {
        this.whName = whName == null ? null : whName.trim();
    }

    public String getWhAddress() {
        return whAddress;
    }

    public void setWhAddress(String whAddress) {
        this.whAddress = whAddress == null ? null : whAddress.trim();
    }

    public BigDecimal getWhCapacity() {
        return whCapacity;
    }

    public void setWhCapacity(BigDecimal whCapacity) {
        this.whCapacity = whCapacity;
    }

    public String getWhCode() {
        return whCode;
    }

    public void setWhCode(String whCode) {
        this.whCode = whCode == null ? null : whCode.trim();
    }

    public String getWhDesc() {
        return whDesc;
    }

    public void setWhDesc(String whDesc) {
        this.whDesc = whDesc == null ? null : whDesc.trim();
    }

    public String getWhSite() {
        return whSite;
    }

    public void setWhSite(String whSite) {
        this.whSite = whSite == null ? null : whSite.trim();
    }

    public Integer getWhTypeId() {
        return whTypeId;
    }

    public void setWhTypeId(Integer whTypeId) {
        this.whTypeId = whTypeId;
    }

    public BigDecimal getWhWarnVal() {
        return whWarnVal;
    }

    public void setWhWarnVal(BigDecimal whWarnVal) {
        this.whWarnVal = whWarnVal;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }
}