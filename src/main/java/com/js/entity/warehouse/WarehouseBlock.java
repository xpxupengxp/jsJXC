package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 仓库分区类（js_warehouse_block）
 */
public class WarehouseBlock implements Serializable {
    private Integer wbId;//分区编号

    private String wbName;//分区名称

    private String wbCode;//分区编码

    private Integer wbArea;//分区编号

    private Integer wbRow;//所属行数

    private Integer wbCol;//所属列数

    private Integer wbParentId;//所属对象

    private String wbFloor;//所属楼层

    private BigDecimal whId;//所属仓库ID

    private String wbDesc;//描述

    private static final long serialVersionUID = 1L;



    private Integer[] wbIds;//分区编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Integer[] getWbIds() {
        return wbIds;
    }

    public void setWbIds(Integer[] wbIds) {
        this.wbIds = wbIds;
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

    public Integer getWbId() {
        return wbId;
    }

    public void setWbId(Integer wbId) {
        this.wbId = wbId;
    }

    public String getWbName() {
        return wbName;
    }

    public void setWbName(String wbName) {
        this.wbName = wbName == null ? null : wbName.trim();
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode == null ? null : wbCode.trim();
    }

    public Integer getWbArea() {
        return wbArea;
    }

    public void setWbArea(Integer wbArea) {
        this.wbArea = wbArea;
    }

    public Integer getWbRow() {
        return wbRow;
    }

    public void setWbRow(Integer wbRow) {
        this.wbRow = wbRow;
    }

    public Integer getWbCol() {
        return wbCol;
    }

    public void setWbCol(Integer wbCol) {
        this.wbCol = wbCol;
    }

    public Integer getWbParentId() {
        return wbParentId;
    }

    public void setWbParentId(Integer wbParentId) {
        this.wbParentId = wbParentId;
    }

    public String getWbFloor() {
        return wbFloor;
    }

    public void setWbFloor(String wbFloor) {
        this.wbFloor = wbFloor == null ? null : wbFloor.trim();
    }

    public BigDecimal getWhId() {
        return whId;
    }

    public void setWhId(BigDecimal whId) {
        this.whId = whId;
    }

    public String getWbDesc() {
        return wbDesc;
    }

    public void setWbDesc(String wbDesc) {
        this.wbDesc = wbDesc == null ? null : wbDesc.trim();
    }
}