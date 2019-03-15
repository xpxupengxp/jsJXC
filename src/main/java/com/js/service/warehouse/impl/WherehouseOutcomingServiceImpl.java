package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WherehouseOutcomingMapper;
import com.js.entity.warehouse.WherehouseOutcoming;
import com.js.service.warehouse.WherehouseOutcomingService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WherehouseOutcomingServiceImpl implements WherehouseOutcomingService {

    @Autowired
    private WherehouseOutcomingMapper wherehouseOutcomingMapper;


    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = wherehouseOutcomingMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = wherehouseOutcomingMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WherehouseOutcoming wherehouseOutcoming) {
        if(wherehouseOutcomingMapper.insert(wherehouseOutcoming) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WherehouseOutcoming findById(Long id) {
        return wherehouseOutcomingMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WherehouseOutcoming wherehouseOutcoming, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(wherehouseOutcomingMapper.findPageListCount(wherehouseOutcoming));
        }
        List<WherehouseOutcoming> pageList = wherehouseOutcomingMapper.findPageList(wherehouseOutcoming, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WherehouseOutcoming wherehouseOutcoming) {
        if(wherehouseOutcomingMapper.update(wherehouseOutcoming) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
