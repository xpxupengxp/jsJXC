package com.js.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 操作记录类（js_sys_oprate_Log）
 */
public class SysOprateLog implements Serializable {
    private Long id;//编号

    private String objectId;//对象编号

    private Long actUId;//操作人员

    private Date updatetime;//更新时间

    private String actType;//操作类型

    private String ip;//访问IP

    private static final long serialVersionUID = 1L;


    private int page;//当前页码

    private int rows;//每页条数

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

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType == null ? null : actType.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}