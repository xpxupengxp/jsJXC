package com.js.entity.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统数据维护类（js_sys_data_maintain）
 */
public class SysDataMaintain implements Serializable {
    private Long id;//编号

    private Long[] ids;//编号数组

    private String objectId;//对象编号

    private Long actUId;//创建人

    private Date inserttime;//创建时间

    private Integer deleted;//删除标志

    private String enable;//允许标志

    private Integer hided;//隐藏标志

    private String remark;//备注

    private String ip;//创建IP

    private String op;//权限标志

    private static final long serialVersionUID = 1L;


    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

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

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public Long getActUId() {
        return actUId;
    }

    public void setActUId(Long actUId) {
        this.actUId = actUId;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public Integer getHided() {
        return hided;
    }

    public void setHided(Integer hided) {
        this.hided = hided;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op == null ? null : op.trim();
    }

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }
}