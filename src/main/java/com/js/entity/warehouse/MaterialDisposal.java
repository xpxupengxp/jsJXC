package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 物料处置类（m_material_disposal）
 */
public class MaterialDisposal implements Serializable {
    private Long mRealId;//物料笔数编号

    private String mDisposalType;//处置类型

    private BigDecimal mNum;//物料数量

    private String mStaff;//经办人

    private Date mDisposalDate;//经办日期

    private Long checkProcessId;//审核流程ID

    private String mDisposalResult;//处置结果

    private String specialCode;//持殊编码

    private String isFilished;//是否完成

    private static final long serialVersionUID = 1L;



    private Long[] mRealIds;//物料笔数编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Long[] getmRealIds() {
        return mRealIds;
    }

    public void setmRealIds(Long[] mRealIds) {
        this.mRealIds = mRealIds;
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

    public Long getmRealId() {
        return mRealId;
    }

    public void setmRealId(Long mRealId) {
        this.mRealId = mRealId;
    }

    public String getmDisposalType() {
        return mDisposalType;
    }

    public void setmDisposalType(String mDisposalType) {
        this.mDisposalType = mDisposalType == null ? null : mDisposalType.trim();
    }

    public BigDecimal getmNum() {
        return mNum;
    }

    public void setmNum(BigDecimal mNum) {
        this.mNum = mNum;
    }

    public String getmStaff() {
        return mStaff;
    }

    public void setmStaff(String mStaff) {
        this.mStaff = mStaff == null ? null : mStaff.trim();
    }

    public Date getmDisposalDate() {
        return mDisposalDate;
    }

    public void setmDisposalDate(Date mDisposalDate) {
        this.mDisposalDate = mDisposalDate;
    }

    public Long getCheckProcessId() {
        return checkProcessId;
    }

    public void setCheckProcessId(Long checkProcessId) {
        this.checkProcessId = checkProcessId;
    }

    public String getmDisposalResult() {
        return mDisposalResult;
    }

    public void setmDisposalResult(String mDisposalResult) {
        this.mDisposalResult = mDisposalResult == null ? null : mDisposalResult.trim();
    }

    public String getSpecialCode() {
        return specialCode;
    }

    public void setSpecialCode(String specialCode) {
        this.specialCode = specialCode == null ? null : specialCode.trim();
    }

    public String getIsFilished() {
        return isFilished;
    }

    public void setIsFilished(String isFilished) {
        this.isFilished = isFilished == null ? null : isFilished.trim();
    }
}