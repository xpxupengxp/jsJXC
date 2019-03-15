package com.js.entity.warehouse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 单据处理类（js_bill_disposal）
 */
public class BillDisposal implements Serializable {
    private Integer id;//编号

    private String billName;//单据名称

    private String billNo;//单据号

    private String billType;//单据类型

    private BigDecimal totalPrice;//合计金额

    private Integer userId;//经办人

    private Date actionTime;//经办时间

    private Integer cId;//商家ID

    private String cuName;//联系人姓名

    private String cuMobile;//联系人电话

    private String transAddress;//交货地点

    private String billDesc;//单据备注

    private Integer auditProcessId;//审核流程ID

    private static final long serialVersionUID = 1L;



    private Integer[] ids;//编号数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName == null ? null : billName.trim();
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName == null ? null : cuName.trim();
    }

    public String getCuMobile() {
        return cuMobile;
    }

    public void setCuMobile(String cuMobile) {
        this.cuMobile = cuMobile == null ? null : cuMobile.trim();
    }

    public String getTransAddress() {
        return transAddress;
    }

    public void setTransAddress(String transAddress) {
        this.transAddress = transAddress == null ? null : transAddress.trim();
    }

    public String getBillDesc() {
        return billDesc;
    }

    public void setBillDesc(String billDesc) {
        this.billDesc = billDesc == null ? null : billDesc.trim();
    }

    public Integer getAuditProcessId() {
        return auditProcessId;
    }

    public void setAuditProcessId(Integer auditProcessId) {
        this.auditProcessId = auditProcessId;
    }
}