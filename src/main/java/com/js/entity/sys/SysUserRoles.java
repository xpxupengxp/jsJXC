package com.js.entity.sys;

import java.io.Serializable;

/**
 * 用户角色关联类（js_sys_user_roles）
 */
public class SysUserRoles implements Serializable {
    private Integer id;//编号

    private Integer userId;//用户ID

    private Integer roleId;//角色ID

    private String objectId;//对象编号

    private Integer[] roles;//角色数组

    private static final long serialVersionUID = 1L;

    public Integer[] getRoles() {
        return roles;
    }

    public void setRoles(Integer[] roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}