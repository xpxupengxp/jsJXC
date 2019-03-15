package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 报损报废类（js_materials_faulty）
 */
public class MaterialsFaulty implements Serializable {
    private Long mId;//物料ID

    private BigDecimal faultyNum;//报损数量

    private String operator;//经办人

    private Date operateDate;//经办时间

    private String result;//处理结果

    private String memo;//备注

    private Integer auditProcessId;//审核流程ID

    private String isFilished;//是否完成

    private static final long serialVersionUID = 1L;


    private Long[] mIds;//物料ID数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）v

    public Long[] getmIds() {
        return mIds;
    }

    public void setmIds(Long[] mIds) {
        this.mIds = mIds;
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

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public BigDecimal getFaultyNum() {
        return faultyNum;
    }

    public void setFaultyNum(BigDecimal faultyNum) {
        this.faultyNum = faultyNum;
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

    public String getIsFilished() {
        return isFilished;
    }

    public void setIsFilished(String isFilished) {
        this.isFilished = isFilished == null ? null : isFilished.trim();
    }
}