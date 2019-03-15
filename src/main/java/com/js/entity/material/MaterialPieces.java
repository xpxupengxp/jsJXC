package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 *物料笔数
 */
public class MaterialPieces implements Serializable {
    private Long mRealId;//物料实物ID

    private Long mId;//物料ID

    private String mBatch;//物料批次

    private Long mCategoryId;//物料类别

    private String mSource;//来源

    private String mPackage;//包装

    private Integer mStoreId;//存放仓库ID

    private Integer mStoreAreaId;//仓库存放位置ID

    private Date mInStoreTime;//入库时间

    private String mInStoreStaff;//入库人员

    private String memo;//备注

    private Byte isSplited;//拆分标志

    private static final long serialVersionUID = 1L;

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）


    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getmBatch() {
        return mBatch;
    }

    public void setmBatch(String mBatch) {
        this.mBatch = mBatch == null ? null : mBatch.trim();
    }

    public Long getmCategoryId() {
        return mCategoryId;
    }

    public void setmCategoryId(Long mCategoryId) {
        this.mCategoryId = mCategoryId;
    }

    public String getmSource() {
        return mSource;
    }

    public void setmSource(String mSource) {
        this.mSource = mSource == null ? null : mSource.trim();
    }

    public String getmPackage() {
        return mPackage;
    }

    public void setmPackage(String mPackage) {
        this.mPackage = mPackage == null ? null : mPackage.trim();
    }

    public Integer getmStoreId() {
        return mStoreId;
    }

    public void setmStoreId(Integer mStoreId) {
        this.mStoreId = mStoreId;
    }

    public Integer getmStoreAreaId() {
        return mStoreAreaId;
    }

    public void setmStoreAreaId(Integer mStoreAreaId) {
        this.mStoreAreaId = mStoreAreaId;
    }

    public Date getmInStoreTime() {
        return mInStoreTime;
    }

    public void setmInStoreTime(Date mInStoreTime) {
        this.mInStoreTime = mInStoreTime;
    }

    public String getmInStoreStaff() {
        return mInStoreStaff;
    }

    public void setmInStoreStaff(String mInStoreStaff) {
        this.mInStoreStaff = mInStoreStaff == null ? null : mInStoreStaff.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Byte getIsSplited() {
        return isSplited;
    }

    public void setIsSplited(Byte isSplited) {
        this.isSplited = isSplited;
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
}