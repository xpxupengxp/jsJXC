package com.js.service.sys.impl;

import com.js.dao.sys.OldSysPermissionMapper;
import com.js.entity.sys.OldSysPermission;
import com.js.service.sys.OldSysPermissionService;
import com.js.util.ApiResponse;
import com.js.util.CheckUtil;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OldSysPermissionServiceImpl implements OldSysPermissionService {

    @Autowired
    private OldSysPermissionMapper oldSysPermissionMapper;

    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = oldSysPermissionMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = oldSysPermissionMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(OldSysPermission oldSysPermission) {
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsName())) {
            return ApiResponse.error(405).setMsg("权限名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsNameCn())) {
            return ApiResponse.error(405).setMsg("中文权限名不能为空！");
        }
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsUrl())) {
            return ApiResponse.error(405).setMsg("URL地址不能为空！");
        }
        int i = oldSysPermissionMapper.insert(oldSysPermission);
        if(i !=0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public OldSysPermission findById(Integer id) {
        return oldSysPermissionMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(OldSysPermission oldSysPermission, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(oldSysPermissionMapper.findPageListCount(oldSysPermission));
        }
        List<OldSysPermission> pageList = oldSysPermissionMapper.findPageList(oldSysPermission, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(OldSysPermission oldSysPermission) {
        List<OldSysPermission> list = oldSysPermissionMapper.findList(oldSysPermission);
        return ApiResponse.ok().setData(list);
    }

    @Override
    public ApiResponse update(OldSysPermission oldSysPermission) {
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsName())) {
            return ApiResponse.error(405).setMsg("权限名称不能为空！");
        }
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsNameCn())) {
            return ApiResponse.error(405).setMsg("中文权限名不能为空！");
        }
        if(CheckUtil.isEmptyBatch(oldSysPermission.getPermsUrl())) {
            return ApiResponse.error(405).setMsg("URL地址不能为空！");
        }
        int i = oldSysPermissionMapper.update(oldSysPermission);
        if(i !=0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse getRoles(Integer permsId) {
        return ApiResponse.ok().setData(oldSysPermissionMapper.getRoles(permsId));
    }

    @Override
    public ApiResponse getUsers(Integer permsId) {
        return ApiResponse.ok().setData(oldSysPermissionMapper.getUsers(permsId));
    }

    @Override
    public void switchStatus(OldSysPermission oldSysPermission) {
        if(oldSysPermission.getStatus() == 0){
            oldSysPermission.setStatus(1);
            oldSysPermissionMapper.update(oldSysPermission);
        }else {
            oldSysPermission.setStatus(0);
            oldSysPermissionMapper.update(oldSysPermission);
        }
    }
}
