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
    private SysRolesMapper sysRolsMapper;

    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public ApiResponse delete(Integer id) {
        int i = sysRolsMapper.delete(id);
        if(i != 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(SysRoles sysRols) {
        if(CheckUtil.isEmptyBatch(sysRols.getName())) {
            return ApiResponse.error(405).setMsg("角色名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysRols.getOrg())) {
            return ApiResponse.error(405).setMsg("所在组织不能为空！");
        }
        int i = sysRolsMapper.insert(sysRols);
        if(i !=0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysRoles findById(Integer id) {
        return sysRolsMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(SysRoles sysRols, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysRolsMapper.findPageListCount(sysRols));
        }
        List<SysRoles> pageList = sysRolsMapper.findPageList(sysRols, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(SysRoles sysRols) {
        return ApiResponse.ok().setData(sysRolsMapper.findList(sysRols));
    }

    @Override
    public ApiResponse update(SysRoles sysRols) {
        if(CheckUtil.isEmptyBatch(sysRols.getName())) {
            return ApiResponse.error(405).setMsg("角色名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(sysRols.getOrg())) {
            return ApiResponse.error(405).setMsg("所在组织不能为空！");
        }
        int i = sysRolsMapper.update(sysRols);
        if(i !=0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse getUsers(Integer id) {
        return ApiResponse.ok().setData(sysRolsMapper.getUsersByRoleId(id));
    }

    @Override
    public ApiResponse getPerms(Integer id) {
        return ApiResponse.ok().setData(sysRolsMapper.getPermsByRoleId(id));
    }

    @Override
    public void switchStatus(SysRoles sysRols) {
        if(sysRols.getStatus() == 0){
            sysRols.setStatus(1);
            sysRolsMapper.update(sysRols);
        }else {
            sysRols.setStatus(0);
            sysRolsMapper.update(sysRols);
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
            return ApiResponse.error(405).setMsg("设置成功！");
        }
        return ApiResponse.error(405).setMsg("设置失败！");
    }
}
