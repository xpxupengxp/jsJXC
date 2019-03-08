package com.js.entity;

import java.io.Serializable;

/**
 * 用户权限关联类（js_sys_user_permission）
 */
public class SysUserPermission implements Serializable {
    private Integer id;//编号

    private Integer userId;//用户ID

    private Integer permsId;//权限ID

    private String memo;//备注

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPermsId() {
        return permsId;
    }

    public void setPermsId(Integer permsId) {
        this.permsId = permsId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}