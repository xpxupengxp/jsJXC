package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseTypeMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseType;
import com.js.service.warehouse.WarehouseTypeService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseTypeServiceImpl implements WarehouseTypeService {

    @Autowired
    private WarehouseTypeMapper warehouseTypeMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseTypeMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseTypeMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WarehouseType warehouseType) {
        if(warehouseTypeMapper.insert(warehouseType) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseType findById(Integer id) {
        return warehouseTypeMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseType warehouseType, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseTypeMapper.findPageListCount(warehouseType));
        }
        List<WarehouseType> pageList = warehouseTypeMapper.findPageList(warehouseType, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseType warehouseType) {
        if(warehouseTypeMapper.update(warehouseType) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
