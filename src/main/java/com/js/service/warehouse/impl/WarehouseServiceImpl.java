package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseMapper;
import com.js.dao.warehouse.WarehouseUserMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.Warehouse;
import com.js.entity.warehouse.WarehouseUser;
import com.js.service.warehouse.WarehouseService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseMapper warehouseMapper;

    @Autowired
    private WarehouseUserMapper warehouseUserMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(Warehouse warehouse) {
        if(warehouseMapper.insert(warehouse) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public Warehouse findById(Integer id) {
        return warehouseMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(Warehouse warehouse, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseMapper.findPageListCount(warehouse));
        }
        List<Warehouse> pageList = warehouseMapper.findPageList(warehouse, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(Warehouse warehouse) {
        if(warehouseMapper.update(warehouse) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse insertWarehouseUser(WarehouseUser warehouseUser) {
        if(warehouseUser.getWarehouseUsers() == null) {
            return ApiResponse.error(405).setMsg("添加库管员失败！");
        }
        int j = 0;
        Integer[] warehouseUsers = warehouseUser.getWarehouseUsers();
        //先通过仓库id删除仓库用户表中的数据
        warehouseUserMapper.deleteByWhId(warehouseUser.getWhId());
        for (int i = 0;i < warehouseUsers.length;i++) {
            warehouseUser.setUserId(warehouseUsers[i]);
            warehouseUser.setWhuDesc("库管员");
            warehouseUserMapper.insert(warehouseUser);
            j++;
        }
        if(j == warehouseUsers.length) {
            return ApiResponse.ok().setMsg("添加库管员成功！");
        }
        return ApiResponse.error(405).setMsg("添加库管员失败！");
    }

    @Override
    public ApiResponse deleteWarehouseUser(WarehouseUser warehouseUser) {
        //通过仓库id删除仓库用户表中的数据
        if(warehouseUserMapper.deleteByWhId(warehouseUser.getWhId()) > 0){
            return ApiResponse.ok().setMsg("删除库管员成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除库管员失败！");
    }
}
