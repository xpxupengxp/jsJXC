package com.js.service.impl;

import com.js.dao.SysRolePermissionMapper;
import com.js.dao.SysRolesMapper;
import com.js.entity.SysRolePermission;
import com.js.entity.SysRoles;
import com.js.service.SysRolesService;
import com.js.util.ApiResponse;
import com.js.util.CheckUtil;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRolesServiceImpl implements SysRolesService {

    @Autowired
    private SysRolesMapper sysRolesMapper;

    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = sysRolesMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = sysRolesMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(SysRoles sysRoles) {
        if(CheckUtil.isEmptyBatch(sysRoles.getName())) {
            return ApiResponse.error(405).setMsg("角色名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysRoles.getOrg())) {
            return ApiResponse.error(405).setMsg("所在组织不能为空！");
        }
        if(sysRolesMapper.insert(sysRoles) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysRoles findById(Integer id) {
        return sysRolesMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(SysRoles sysRoles, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysRolesMapper.findPageListCount(sysRoles));
        }
        List<SysRoles> pageList = sysRolesMapper.findPageList(sysRoles, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(SysRoles sysRoles) {
        return ApiResponse.ok().setData(sysRolesMapper.findList(sysRoles));
    }

    @Override
    public ApiResponse update(SysRoles sysRoles) {
        if(CheckUtil.isEmptyBatch(sysRoles.getName())) {
            return ApiResponse.error(405).setMsg("角色名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysRoles.getOrg())) {
            return ApiResponse.error(405).setMsg("所在组织不能为空！");
        }
        if(sysRolesMapper.update(sysRoles) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse getUsers(Integer id) {
        return ApiResponse.ok().setData(sysRolesMapper.getUsersByRoleId(id));
    }

    @Override
    public ApiResponse getPerms(Integer id) {
        return ApiResponse.ok().setData(sysRolesMapper.getPermsByRoleId(id));
    }

    @Override
    public void switchStatus(SysRoles sysRoles) {
        if(sysRoles.getStatus() == 0){
            sysRoles.setStatus(1);
            sysRolesMapper.update(sysRoles);
        }else {
            sysRoles.setStatus(0);
            sysRolesMapper.update(sysRoles);
        }
    }

    @Override
    public ApiResponse setPerms(SysRolePermission sysRolePermission) {
        if(sysRolePermission.getPerms() == null) {
            return ApiResponse.error(405).setMsg("设置失败！");
        }
        int j = 0;
        Integer[] perms = sysRolePermission.getPerms();
        sysRolePermissionMapper.deleteByRoleId(sysRolePermission.getRoleId());
        for (int i = 0;i < perms.length;i++) {
            sysRolePermission.setPermsId(perms[i]);
            sysRolePermissionMapper.insert(sysRolePermission);
            j++;
        }
        if(j == perms.length) {
            return ApiResponse.ok().setMsg("设置成功！");
        }
        return ApiResponse.error(405).setMsg("设置失败！");
    }
}
