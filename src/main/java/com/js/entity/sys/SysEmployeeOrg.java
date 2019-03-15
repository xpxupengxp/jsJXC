package com.js.entity.sys;

import java.io.Serializable;

/**
 * 员工组织关联类（js_sys_employee_org）
 */
public class SysEmployeeOrg implements Serializable {
    private Integer id;//编号

    private Integer userId;//用户ID

    private Integer orgId;//组织ID

    private String objectId;//对象编号

    private static final long serialVersionUID = 1L;

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

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId == null ? null : objectId.trim();
    }
}