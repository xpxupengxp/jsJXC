package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WherehouseOutcoming implements Serializable {
    private Long id;//出库编号

    private Integer wId;//仓库编号

    private Long mRealId;//物料笔数编号

    private Date outDate;//出库时间

    private String storeKeeper;//库管员

    private BigDecimal mNumber;//出库数量

    private String memo;//出库说明

    private static final long serialVersionUID = 1L;



    private Long[] ids;//物料笔数编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）


    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getStoreKeeper() {
        return storeKeeper;
    }

    public void setStoreKeeper(String storeKeeper) {
        this.storeKeeper = storeKeeper == null ? null : storeKeeper.trim();
    }

    public BigDecimal getmNumber() {
        return mNumber;
    }

    public void setmNumber(BigDecimal mNumber) {
        this.mNumber = mNumber;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}