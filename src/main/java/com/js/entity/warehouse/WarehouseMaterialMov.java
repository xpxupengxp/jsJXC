package com.js.entity.warehouse;

import java.io.Serializable;
import java.util.Date;

/**
 * 物料移动记录类（js_warehouse_material_mov）
 */
public class WarehouseMaterialMov implements Serializable {
    private Long id;//编号

    private Long mId;//物料ID

    private Integer befWhId;//移动前仓库ID

    private Integer aftWhId;//移动后仓库ID

    private Integer preWhBlockId;//移动前分区ID

    private Integer aftBlockId;//移动后分区ID

    private Long userId;//入库人员

    private Date movDate;//移动时间

    private String movReason;//移动原因

    private String movType;//移动类型

    private String movTarget;//目标去向

    private Integer auditProcessId;//审核流程ID

    private Long inStoreId;//入库单ID

    private static final long serialVersionUID = 1L;

    private Long[] ids;//编号数组

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

    public Long getmId() {
        return mId;
    }

    public void setmId(Long mId) {
        this.mId = mId;
    }

    public Integer getBefWhId() {
        return befWhId;
    }

    public void setBefWhId(Integer befWhId) {
        this.befWhId = befWhId;
    }

    public Integer getAftWhId() {
        return aftWhId;
    }

    public void setAftWhId(Integer aftWhId) {
        this.aftWhId = aftWhId;
    }

    public Integer getPreWhBlockId() {
        return preWhBlockId;
    }

    public void setPreWhBlockId(Integer preWhBlockId) {
        this.preWhBlockId = preWhBlockId;
    }

    public Integer getAftBlockId() {
        return aftBlockId;
    }

    public void setAftBlockId(Integer aftBlockId) {
        this.aftBlockId = aftBlockId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getMovDate() {
        return movDate;
    }

    public void setMovDate(Date movDate) {
        this.movDate = movDate;
    }

    public String getMovReason() {
        return movReason;
    }

    public void setMovReason(String movReason) {
        this.movReason = movReason == null ? null : movReason.trim();
    }

    public String getMovType() {
        return movType;
    }

    public void setMovType(String movType) {
        this.movType = movType == null ? null : movType.trim();
    }

    public String getMovTarget() {
        return movTarget;
    }

    public void setMovTarget(String movTarget) {
        this.movTarget = movTarget == null ? null : movTarget.trim();
    }

    public Integer getAuditProcessId() {
        return auditProcessId;
    }

    public void setAuditProcessId(Integer auditProcessId) {
        this.auditProcessId = auditProcessId;
    }

    public Long getInStoreId() {
        return inStoreId;
    }

    public void setInStoreId(Long inStoreId) {
        this.inStoreId = inStoreId;
    }
}