package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 差异物料类（js_old_sys_permission）
 */
public class MaterialsDifference implements Serializable {
    private Long mRealId;//物料笔数编号

    private BigDecimal differenceNum;//差异数量

    private BigDecimal systemNum;//系统数量

    private BigDecimal realNum;//实际数量

    private String operator;//经办人

    private Date operateDate;//经办时间

    private String result;//处理结果

    private String memo;//备注

    private Integer auditProcessId;//审核流程ID

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

    public BigDecimal getDifferenceNum() {
        return differenceNum;
    }

    public void setDifferenceNum(BigDecimal differenceNum) {
        this.differenceNum = differenceNum;
    }

    public BigDecimal getSystemNum() {
        return systemNum;
    }

    public void setSystemNum(BigDecimal systemNum) {
        this.systemNum = systemNum;
    }

    public BigDecimal getRealNum() {
        return realNum;
    }

    public void setRealNum(BigDecimal realNum) {
        this.realNum = realNum;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getAuditProcessId() {
        return auditProcessId;
    }

    public void setAuditProcessId(Integer auditProcessId) {
        this.auditProcessId = auditProcessId;
    }
}