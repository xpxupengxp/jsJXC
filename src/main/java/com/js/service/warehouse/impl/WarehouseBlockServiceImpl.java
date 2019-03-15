package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseBlockMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseBlock;
import com.js.service.warehouse.WarehouseBlockService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseBlockServiceImpl implements WarehouseBlockService {

    @Autowired
    private WarehouseBlockMapper warehouseBlockMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseBlockMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseBlockMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WarehouseBlock warehouseBlock) {
        if(warehouseBlockMapper.insert(warehouseBlock) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseBlock findById(Integer id) {
        return warehouseBlockMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseBlock warehouseBlock, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseBlockMapper.findPageListCount(warehouseBlock));
        }
        List<WarehouseBlock> pageList = warehouseBlockMapper.findPageList(warehouseBlock, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseBlock warehouseBlock) {
        if(warehouseBlockMapper.update(warehouseBlock) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
