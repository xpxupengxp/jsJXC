package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseMaterialMovMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseMaterialMov;
import com.js.service.warehouse.WarehouseMaterialMovService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseMaterialMovServiceImpl implements WarehouseMaterialMovService {

    @Autowired
    private WarehouseMaterialMovMapper warehouseMaterialMovMapper;


    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseMaterialMovMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseMaterialMovMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WarehouseMaterialMov warehouseMaterialMov) {
        if(warehouseMaterialMovMapper.insert(warehouseMaterialMov) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseMaterialMov findById(Long id) {
        return warehouseMaterialMovMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseMaterialMov warehouseMaterialMov, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseMaterialMovMapper.findPageListCount(warehouseMaterialMov));
        }
        List<WarehouseMaterialMov> pageList = warehouseMaterialMovMapper.findPageList(warehouseMaterialMov, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseMaterialMov warehouseMaterialMov) {
        if(warehouseMaterialMovMapper.update(warehouseMaterialMov) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
