package com.js.service;

import com.js.entity.Org;
import com.js.entity.SysEmployee;
import com.js.entity.SysUsers;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

import java.util.List;

public interface SysEmployeeService {

    //删除
    ApiResponse delete(Integer id);

    //添加
    ApiResponse insert(SysEmployee sysEmployee);

    //通过主键查询
    SysEmployee findById(Integer userId);

    //分页查询
    ApiResponse findPageList(SysEmployee sysEmployee, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList(SysEmployee sysEmployee);

    //修改
    ApiResponse update(SysEmployee sysEmployee);

    //根据员工id获取组织
    Org findOrgByUserId(Integer userId);

    //根据员工id获取用户
    SysUsers findUserByUserId(Integer userId);

    //启用/停用员工
    void switchStatus(SysEmployee sysEmployee);

    //给user表生成账号
    ApiResponse generateAccount(Integer userId, boolean accType);

}
