package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseUserMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseUser;
import com.js.service.warehouse.WarehouseUserService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseUserServiceImpl implements WarehouseUserService {

    @Autowired
    private WarehouseUserMapper warehouseUserMapper;

//    @Override
//    public ApiResponse delete(Integer[] ids) {
//        int i = 0;
//        if(ids.length == 1) {
//            i = warehouseUserMapper.delete(ids[0]);
//        }else if(ids.length > 1) {
//            i = warehouseUserMapper.deleteByIds(ids);
//        }
//        if(i > 0){
//            return ApiResponse.ok().setMsg("删除成功！");
//        }
//        //405代表操作失败
//        return ApiResponse.error(405).setMsg("删除失败！");
//    }

    @Override
    public ApiResponse insert(WarehouseUser warehouseUser) {
        if(warehouseUserMapper.insert(warehouseUser) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseUser findById(Integer id) {
        return warehouseUserMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseUser warehouseUser, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseUserMapper.findPageListCount(warehouseUser));
        }
        List<WarehouseUser> pageList = warehouseUserMapper.findPageList(warehouseUser, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseUser warehouseUser) {
        if(warehouseUserMapper.update(warehouseUser) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
