package com.js.entity;

import java.io.Serializable;

/**
 * 角色权限关联类（js_sys_role_permission）
 */
public class SysRolePermission implements Serializable {
    private Integer id;//编号

    private Integer roleId;//角色ID

    private Integer permsId;//权限ID

    private String objectId;//对象编号

    private Integer[] perms;//权限数组

    private static final long serialVersionUID = 1L;

    public Integer[] getPerms() {
        return perms;
    }

    public void setPerms(Integer[] perms) {
        this.perms = perms;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermsId() {
        return permsId;
    }

    public void setPermsId(Integer permsId) {
        this.permsId = permsId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}