package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 仓库用户映射类（js_warehouse_user）
 */
public class WarehouseUser implements Serializable {
    private Integer whuId;//编号

    private Integer userId;//用户ID

    private Integer whId;//仓库ID

    private String whuDesc;//关联描述（默认：库存员）

    private static final long serialVersionUID = 1L;


    private Integer[] whuIds;//编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    private Integer[] WarehouseUsers;//库管员id数组


    public Integer[] getWarehouseUsers() {
        return WarehouseUsers;
    }

    public void setWarehouseUsers(Integer[] warehouseUsers) {
        WarehouseUsers = warehouseUsers;
    }


    public Integer[] getWhuIds() {
        return whuIds;
    }

    public void setWhuIds(Integer[] whuIds) {
        this.whuIds = whuIds;
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

    public Integer getWhuId() {
        return whuId;
    }

    public void setWhuId(Integer whuId) {
        this.whuId = whuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getWhId() {
        return whId;
    }

    public void setWhId(Integer whId) {
        this.whId = whId;
    }

    public String getWhuDesc() {
        return whuDesc;
    }

    public void setWhuDesc(String whuDesc) {
        this.whuDesc = whuDesc == null ? null : whuDesc.trim();
    }
}