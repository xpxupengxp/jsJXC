package com.js.entity.material;

import java.io.Serializable;
import java.util.Date;

/**
 * 物料合并记录
 */
public class MaterialMergeRecord implements Serializable {
    private Long mRealId;//物料实物ID

    private String mBatch;//物料批次

    private Byte securityValue;//当前安全值

    private String mSource;//来源

    private String mPackage;//包装

    private Integer mStoreId;//存放仓库位置ID

    private Date mInStoreTime;//入库时间

    private String mInStoreStaff;//入库人员

    private Byte isAlert;//系统是否报警

    private String memo;//备注

    private Long mMergedId;//合并后ID

    private static final long serialVersionUID = 1L;

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public String getmBatch() {
        return mBatch;
    }

    public void setmBatch(String mBatch) {
        this.mBatch = mBatch == null ? null : mBatch.trim();
    }

    public Byte getSecurityValue() {
        return securityValue;
    }

    public void setSecurityValue(Byte securityValue) {
        this.securityValue = securityValue;
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

    public Byte getIsAlert() {
        return isAlert;
    }

    public void setIsAlert(Byte isAlert) {
        this.isAlert = isAlert;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Long getmMergedId() {
        return mMergedId;
    }

    public void setmMergedId(Long mMergedId) {
        this.mMergedId = mMergedId;
    }
}