package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 盘点记录类（js_take_stock）
 */
public class TakeStock implements Serializable {
    private Long tsId;//编号

    private BigDecimal whId;//仓库编号

    private String mId;//物料编号

    private BigDecimal kcCount;//原库存数

    private String tsPcode;//批次号

    private BigDecimal tsUId;//盘点人员

    private String tsDesc;//盘点备注

    private Date tsTime;//盘点时间

    private String auditor;//审核人

    private Integer auditProcessId;//审核流程ID

    private static final long serialVersionUID = 1L;


    private Long[] tsIds;//编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）


    public Long[] getTsIds() {
        return tsIds;
    }

    public void setTsIds(Long[] tsIds) {
        this.tsIds = tsIds;
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

    public Long getTsId() {
        return tsId;
    }

    public void setTsId(Long tsId) {
        this.tsId = tsId;
    }

    public BigDecimal getWhId() {
        return whId;
    }

    public void setWhId(BigDecimal whId) {
        this.whId = whId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId == null ? null : mId.trim();
    }

    public BigDecimal getKcCount() {
        return kcCount;
    }

    public void setKcCount(BigDecimal kcCount) {
        this.kcCount = kcCount;
    }

    public String getTsPcode() {
        return tsPcode;
    }

    public void setTsPcode(String tsPcode) {
        this.tsPcode = tsPcode == null ? null : tsPcode.trim();
    }

    public BigDecimal getTsUId() {
        return tsUId;
    }

    public void setTsUId(BigDecimal tsUId) {
        this.tsUId = tsUId;
    }

    public String getTsDesc() {
        return tsDesc;
    }

    public void setTsDesc(String tsDesc) {
        this.tsDesc = tsDesc == null ? null : tsDesc.trim();
    }

    public Date getTsTime() {
        return tsTime;
    }

    public void setTsTime(Date tsTime) {
        this.tsTime = tsTime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Integer getAuditProcessId() {
        return auditProcessId;
    }

    public void setAuditProcessId(Integer auditProcessId) {
        this.auditProcessId = auditProcessId;
    }
}