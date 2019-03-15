package com.js.service.sys.impl;

import com.js.dao.sys.SysEmployeeMapper;
import com.js.dao.sys.SysUsersMapper;
import com.js.entity.sys.Org;
import com.js.entity.sys.SysEmployee;
import com.js.entity.sys.SysUsers;
import com.js.service.sys.SysEmployeeService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysEmployeeServiceImpl implements SysEmployeeService {

    @Autowired
    private SysEmployeeMapper sysEmployeeMapper;

    @Autowired
    private SysUsersMapper sysUsersMapper;

    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = sysEmployeeMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = sysEmployeeMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(SysEmployee sysEmployee) {
//        // 参数非空验证
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserCode())) {
//            return ApiResponse.error(405).setMsg("员工编号不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserName())) {
//            return ApiResponse.error(405).setMsg("员工姓名不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserMobile())) {
//            return ApiResponse.error(405).setMsg("手机号不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserAddress())) {
//            return ApiResponse.error(405).setMsg("地址不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserQq())) {
//            return ApiResponse.error(405).setMsg("QQ不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserEmail())) {
//            return ApiResponse.error(405).setMsg("邮箱不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserSex())) {
//            return ApiResponse.error(405).setMsg("性别不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getBirthday())) {
//            return ApiResponse.error(405).setMsg("生日不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getIdCard())) {
//            return ApiResponse.error(405).setMsg("员工卡号不能为空！");
//        }
//
//        //参数正则验证
//        if(!CheckUtil.checkMobile(sysEmployee.getUserTelephone())){
//            return ApiResponse.error(405).setMsg("请输入正确的手机号！");
//        }
//        if (!CheckUtil.checkEmail(sysEmployee.getUserEmail())) {
//            return ApiResponse.error(405).setMsg("请输入正确的邮箱！");
//        }
        if(sysEmployeeMapper.insert(sysEmployee) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysEmployee findById(Integer userId) {
        return sysEmployeeMapper.findById(userId);
    }

    @Override
    public ApiResponse findPageList(SysEmployee sysEmployee, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysEmployeeMapper.findPageListCount(sysEmployee));
        }
        List<SysEmployee> pageList = sysEmployeeMapper.findPageList(sysEmployee, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(SysEmployee sysEmployee) {
        List<SysEmployee> list = sysEmployeeMapper.findList(sysEmployee);
        return ApiResponse.ok().setData(list);
    }

    @Override
    public ApiResponse update(SysEmployee sysEmployee) {
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserCode())) {
//            return ApiResponse.error(405).setMsg("用户编号不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getUserTelephone())) {
//            return ApiResponse.error(405).setMsg("电话不能为空！");
//        }
//        if(CheckUtil.isEmptyBatch(sysEmployee.getIdCard())) {
//            return ApiResponse.error(405).setMsg("员工卡号不能为空！");
//        }
//        if(!CheckUtil.checkMobile(sysEmployee.getUserTelephone())) {
//            return ApiResponse.error(405).setMsg("请输入正确的电话号码！");
//        }
//        if (!CheckUtil.isEmptyBatch(sysEmployee.getUserEmail()) && !CheckUtil.checkEmail(sysEmployee.getUserEmail())) {
//            return ApiResponse.error(405).setMsg("邮箱不正确！");
//        }
        if(sysEmployeeMapper.update(sysEmployee) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public Org findOrgByUserId(Integer userId) {
        return sysEmployeeMapper.findOrgByUserId(userId);
    }

    @Override
    public SysUsers findUserByUserId(Integer userId) {
        return sysEmployeeMapper.findUserByUserId(userId);
    }

    @Override
    public void switchStatus(SysEmployee sysEmployee) {
        if(sysEmployee.getStatus() == 0){
            sysEmployee.setStatus(1);
            sysEmployeeMapper.update(sysEmployee);
        }else {
            sysEmployee.setStatus(0);
            sysEmployeeMapper.update(sysEmployee);
        }
    }

    @Override
    public ApiResponse generateAccount(Integer userId, boolean accType) {
        if(accType){
            SysUsers sysUsers = new SysUsers();
            sysUsers.setUserId(userId);
            sysUsers.setNickname("张三");
            sysUsers.setPassword("000000");
            sysUsers.setUserImg("js/img");
            sysUsers.setTokenCode("888888");
            sysUsers.setStatus(1);
            if(sysUsersMapper.insert(sysUsers) > 0){
                return ApiResponse.ok().setMsg("生成用户账号成功！");
            }
            return ApiResponse.error(405).setMsg("生成用户账号失败！");
        }
        return ApiResponse.ok().setData(userId);
    }
}
