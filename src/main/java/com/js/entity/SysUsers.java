package com.js.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统用户类（js_sys_users）
 */
public class SysUsers implements Serializable {
    private Integer id;//编号

    private Integer userId;//用户ID(账号)

    private String nickname;//昵称

    private String password;//密码

    private String userImg;//用户头像

    private String tokenCode;//登录识别码

    private String objectId;//对象编号

    private Integer status;//状态（0:禁用，1:正常）

    private List<SysRoles> rolesList = new ArrayList<>();//角色集合

    private List<SysRoles> permsList = new ArrayList<>();//权限集合

    private int page;//当前页码

    private int rows;//每页条数

    private String orderBy;//排序字段

    private String order;//排序（ASC、DESC）

    private static final long serialVersionUID = 1L;

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

    public List<SysRoles> getPermsList() {
        return permsList;
    }

    public void setPermsList(List<SysRoles> permsList) {
        this.permsList = permsList;
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

    public List<SysRoles> getRolesList() {
        return rolesList;
    }

    public void setRolesList(List<SysRoles> rolesList) {
        this.rolesList = rolesList;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public String getTokenCode() {
        return tokenCode;
    }

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}