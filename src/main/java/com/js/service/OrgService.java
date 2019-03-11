package com.js.service;

import com.js.entity.Org;
import com.js.entity.SysEmployee;
import com.js.entity.SysUsers;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface OrgService {

    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(Org org);

    //通过主键查询
    Org findById(Integer orgId);

    //分页查询
    ApiResponse findPageList(Org org, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(Org org);

    //修改
    ApiResponse update(Org org);

    //根据组织id获取员工
    SysUsers findUserByOrgId(Integer orgId);

    //启用/停用组织
    void switchStatus(Org org);
}
