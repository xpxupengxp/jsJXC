package com.js.service.impl;

import com.js.dao.OrgMapper;
import com.js.entity.Org;
import com.js.entity.SysUsers;
import com.js.service.OrgService;
import com.js.util.ApiResponse;
import com.js.util.CheckUtil;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    private OrgMapper orgMapper;

    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = orgMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = orgMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(Org org) {
        if(CheckUtil.isEmptyBatch(org.getOrgCode())) {
            return ApiResponse.error(405).setMsg("组织编码不能为空！");
        }
        if(CheckUtil.isEmptyBatch(org.getOrgName())) {
            return ApiResponse.error(405).setMsg("组织名称不能为空！");
        }
        int i = orgMapper.insert(org);
        if(i !=0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public Org findById(Integer orgId) {
        return orgMapper.findById(orgId);
    }

    @Override
    public ApiResponse findPageList(Org org, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(orgMapper.findPageListCount(org));
        }
        List<Org> pageList = orgMapper.findPageList(org, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(Org org) {
        List<Org> list = orgMapper.findList(org);
        return ApiResponse.ok().setData(list);
    }

    @Override
    public ApiResponse update(Org org) {
        if(CheckUtil.isEmptyBatch(org.getOrgCode())) {
            return ApiResponse.error(405).setMsg("组织编码不能为空！");
        }
        if(CheckUtil.isEmptyBatch(org.getOrgName())) {
            return ApiResponse.error(405).setMsg("组织名称不能为空！");
        }
        int i = orgMapper.update(org);
        if(i !=0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public SysUsers findUserByOrgId(Integer orgId) {
        return orgMapper.findUserByOrgId(orgId);
    }

    @Override
    public void switchStatus(Org org) {
        if(org.getStatus() == 0){
            org.setStatus(1);
            orgMapper.update(org);
        }else {
            org.setStatus(0);
            orgMapper.update(org);
        }
    }
}
