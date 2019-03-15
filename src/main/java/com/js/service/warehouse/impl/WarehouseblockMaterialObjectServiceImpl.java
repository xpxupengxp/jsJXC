package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseblockMaterialObjectMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseblockMaterialObject;
import com.js.service.warehouse.WarehouseblockMaterialObjectService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseblockMaterialObjectServiceImpl implements WarehouseblockMaterialObjectService {

    @Autowired
    private WarehouseblockMaterialObjectMapper warehouseblockMaterialObjectMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseblockMaterialObjectMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseblockMaterialObjectMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WarehouseblockMaterialObject warehouseblockMaterialObject) {
        if(warehouseblockMaterialObjectMapper.insert(warehouseblockMaterialObject) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseblockMaterialObject findById(Integer id) {
        return warehouseblockMaterialObjectMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseblockMaterialObject warehouseblockMaterialObject, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseblockMaterialObjectMapper.findPageListCount(warehouseblockMaterialObject));
        }
        List<WarehouseblockMaterialObject> pageList = warehouseblockMaterialObjectMapper.findPageList(warehouseblockMaterialObject, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseblockMaterialObject warehouseblockMaterialObject) {
        if(warehouseblockMaterialObjectMapper.update(warehouseblockMaterialObject) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
