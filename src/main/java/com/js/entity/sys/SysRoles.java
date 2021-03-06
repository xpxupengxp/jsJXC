package com.js.entity.sys;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统角色类（js_sys_roles）
 */
public class SysRoles implements Serializable {
    private Integer id;//编号

    private Integer[] ids;//编号数组

    private String name;//角色名称

    private String rolsDesc;//描述

    private String org;//所在组织

    private String system;//所在系统

    private String objectId;//对象编号

    private Integer status;//状态（0:禁用，1:正常）

    private List<OldSysPermission> permissionList = new ArrayList<>();//权限集合

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<OldSysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<OldSysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRolsDesc() {
        return rolsDesc;
    }

    public void setRolsDesc(String rolsDesc) {
        this.rolsDesc = rolsDesc == null ? null : rolsDesc.trim();
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org == null ? null : org.trim();
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system == null ? null : system.trim();
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }
}