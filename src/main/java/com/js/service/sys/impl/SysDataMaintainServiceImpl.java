package com.js.service.sys.impl;

import com.js.dao.sys.SysDataMaintainMapper;
import com.js.entity.sys.SysDataMaintain;
import com.js.service.sys.SysDataMaintainService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysDataMaintainServiceImpl implements SysDataMaintainService {

    @Autowired
    private SysDataMaintainMapper sysDataMaintainMapper;

    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = sysDataMaintainMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = sysDataMaintainMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(SysDataMaintain sysDataMaintain) {
        if(sysDataMaintainMapper.insert(sysDataMaintain) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysDataMaintain findById(Long id) {
        return sysDataMaintainMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(SysDataMaintain sysDataMaintain, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysDataMaintainMapper.findPageListCount(sysDataMaintain));
        }
        List<SysDataMaintain> pageList = sysDataMaintainMapper.findPageList(sysDataMaintain, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList(SysDataMaintain sysDataMaintain) {
        return ApiResponse.ok().setData(sysDataMaintainMapper.findList(sysDataMaintain));
    }

    @Override
    public ApiResponse update(SysDataMaintain sysDataMaintain) {
        if(sysDataMaintainMapper.update(sysDataMaintain) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
