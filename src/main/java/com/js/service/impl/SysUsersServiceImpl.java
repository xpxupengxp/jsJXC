package com.js.service.impl;

import com.js.dao.SysUserPermissionMapper;
import com.js.dao.SysUserRolesMapper;
import com.js.dao.SysUsersMapper;
import com.js.entity.SysUserPermission;
import com.js.entity.SysUserRoles;
import com.js.entity.SysUsers;
import com.js.service.SysUsersService;
import com.js.util.ApiResponse;
import com.js.util.CheckUtil;
import com.js.util.MD5Utils;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUsersServiceImpl implements SysUsersService {

    @Autowired
    private SysUsersMapper sysUsersMapper;

    @Autowired
    private SysUserRolesMapper sysUserRolesMapper;

    @Autowired
    private SysUserPermissionMapper sysUserPermissionMapper;



    @Override
    public ApiResponse delete(Integer id) {
        if(sysUsersMapper.delete(id) > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(SysUsers sysUsers) {
        if(CheckUtil.isEmptyBatch(sysUsers.getNickname())) {
            return ApiResponse.error(405).setMsg("昵称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysUsers.getPassword())) {
            return ApiResponse.error(405).setMsg("密码不能为空！");
        }
        if(sysUsersMapper.insert(sysUsers) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysUsers findById(Integer id) {
        return sysUsersMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(SysUsers sysUsers, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysUsersMapper.findPageListCount(sysUsers));
        }
        List<SysUsers> pageList = sysUsersMapper.findPageList(sysUsers, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(SysUsers sysUsers) {
        List<SysUsers> list = sysUsersMapper.findList(sysUsers);
        return ApiResponse.ok().setData(list);
    }

    @Override
    public ApiResponse update(SysUsers sysUsers) {
        if(CheckUtil.isEmptyBatch(sysUsers.getNickname())) {
            return ApiResponse.error(405).setMsg("昵称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysUsers.getPassword())) {
            return ApiResponse.error(405).setMsg("密码不能为空！");
        }
        if(sysUsersMapper.update(sysUsers) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse getRolesById(Integer id) {
        return ApiResponse.ok().setData(sysUsersMapper.getRolesById(id));
    }

    @Override
    public ApiResponse getPermsById(Integer id) {
        return ApiResponse.ok().setData(sysUsersMapper.getPermsById(id));
    }

    @Override
    public void switchStatus(SysUsers sysUsers) {
        if(sysUsers.getStatus() == 0){
            sysUsers.setStatus(1);
            sysUsersMapper.update(sysUsers);
        }else {
            sysUsers.setStatus(0);
            sysUsersMapper.update(sysUsers);
        }
    }

    @Override
    public ApiResponse setPassword(SysUsers sysUsers) {
        if(sysUsersMapper.setPassword(sysUsers) > 0){
            return ApiResponse.ok().setMsg("设置密码成功！");
        }
        return ApiResponse.error(405).setMsg("设置密码失败！");
    }

    @Override
    public ApiResponse setRoles(SysUserRoles sysUserRoles) {
        if(sysUserRoles.getRoles() == null) {
            return ApiResponse.error(405).setMsg("设置失败！");
        }
        int j = 0;
        Integer[] roles = sysUserRoles.getRoles();
        sysUserRolesMapper.deleteByUserId(sysUserRoles.getUserId());
        for (int i = 0;i < roles.length;i++) {
            sysUserRoles.setRoleId(roles[i]);
            sysUserRolesMapper.insert(sysUserRoles);
            j++;
        }
        if(j == roles.length){
            return ApiResponse.ok().setMsg("设置成功！");
        }
        return ApiResponse.error(405).setMsg("设置失败！");
    }

    @Override
    public ApiResponse setPerms(SysUserPermission sysUserPermission) {
        if(sysUserPermission.getPerms() == null) {
            return ApiResponse.error(405).setMsg("设置失败！");
        }
        int j = 0;
        Integer[] perms = sysUserPermission.getPerms();
        sysUserPermissionMapper.deleteByUserId(sysUserPermission.getUserId());
        for (int i = 0;i < perms.length;i++) {
            sysUserPermission.setPermsId(perms[i]);
            sysUserPermissionMapper.insert(sysUserPermission);
            j++;
        }
        if(j == perms.length){
            return ApiResponse.ok().setMsg("设置成功！");
        }
        return ApiResponse.error(405).setMsg("设置失败！");
    }
}
