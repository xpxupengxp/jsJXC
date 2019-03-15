package com.js.entity.warehouse;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 单据明细类(js_bill_disposal_detail)
 */
public class BillDisposalDetail extends BillDisposal {
    private Integer detailId;//单据明细ID

    private Long mId;//物料ID

    private String sbPcode;//物料批次号

    private BigDecimal mNum;//数量

    private BigDecimal mPrice;//单价

    private String mUnits;//单位

    private BigDecimal mSubtotal;//小计

    private String sbDetailDesc;//明细备注

    private Integer mInType;//物料入库类型

    private Integer checkState;//检验状态

    private Integer checkLevel;//检验等级

    private Date checkTime;//检验时间

    private BigDecimal checkUId;//检验人员ID

    private BigDecimal whId;//仓库编号

    private BigDecimal whbId;//仓库分区ID

    private Integer sbId;//单据ID

    private Integer auditProcessId;//审核流程ID

    private String isEffective;//是否有效



    private Integer[] detailIds;//单据明细ID数组

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）


    public Integer[] getDetailIds() {
        return detailIds;
    }

    public void setDetailIds(Integer[] detailIds) {
        this.detailIds = detailIds;
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

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public String getSbPcode() {
        return sbPcode;
    }

    public void setSbPcode(String sbPcode) {
        this.sbPcode = sbPcode == null ? null : sbPcode.trim();
    }

    public BigDecimal getmNum() {
        return mNum;
    }

    public void setmNum(BigDecimal mNum) {
        this.mNum = mNum;
    }

    public BigDecimal getmPrice() {
        return mPrice;
    }

    public void setmPrice(BigDecimal mPrice) {
        this.mPrice = mPrice;
    }

    public String getmUnits() {
        return mUnits;
    }

    public void setmUnits(String mUnits) {
        this.mUnits = mUnits == null ? null : mUnits.trim();
    }

    public BigDecimal getmSubtotal() {
        return mSubtotal;
    }

    public void setmSubtotal(BigDecimal mSubtotal) {
        this.mSubtotal = mSubtotal;
    }

    public String getSbDetailDesc() {
        return sbDetailDesc;
    }

    public void setSbDetailDesc(String sbDetailDesc) {
        this.sbDetailDesc = sbDetailDesc == null ? null : sbDetailDesc.trim();
    }

    public Integer getmInType() {
        return mInType;
    }

    public void setmInType(Integer mInType) {
        this.mInType = mInType;
    }

    public Integer getCheckState() {
        return checkState;
    }

    public void setCheckState(Integer checkState) {
        this.checkState = checkState;
    }

    public Integer getCheckLevel() {
        return checkLevel;
    }

    public void setCheckLevel(Integer checkLevel) {
        this.checkLevel = checkLevel;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public BigDecimal getCheckUId() {
        return checkUId;
    }

    public void setCheckUId(BigDecimal checkUId) {
        this.checkUId = checkUId;
    }

    public BigDecimal getWhId() {
        return whId;
    }

    public void setWhId(BigDecimal whId) {
        this.whId = whId;
    }

    public BigDecimal getWhbId() {
        return whbId;
    }

    public void setWhbId(BigDecimal whbId) {
        this.whbId = whbId;
    }

    public Integer getSbId() {
        return sbId;
    }

    public void setSbId(Integer sbId) {
        this.sbId = sbId;
    }

    public Integer getAuditProcessId() {
        return auditProcessId;
    }

    public void setAuditProcessId(Integer auditProcessId) {
        this.auditProcessId = auditProcessId;
    }

    public String getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(String isEffective) {
        this.isEffective = isEffective == null ? null : isEffective.trim();
    }
}