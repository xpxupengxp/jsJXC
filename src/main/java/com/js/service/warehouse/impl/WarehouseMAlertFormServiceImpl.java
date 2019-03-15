package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WarehouseMAlertFormMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WarehouseMAlertForm;
import com.js.service.warehouse.WarehouseMAlertFormService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseMAlertFormServiceImpl implements WarehouseMAlertFormService {

    @Autowired
    private WarehouseMAlertFormMapper warehouseMAlertFormMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = warehouseMAlertFormMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = warehouseMAlertFormMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WarehouseMAlertForm warehouseMAlertForm) {
        if(warehouseMAlertFormMapper.insert(warehouseMAlertForm) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WarehouseMAlertForm findById(Integer id) {
        return warehouseMAlertFormMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WarehouseMAlertForm warehouseMAlertForm, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(warehouseMAlertFormMapper.findPageListCount(warehouseMAlertForm));
        }
        List<WarehouseMAlertForm> pageList = warehouseMAlertFormMapper.findPageList(warehouseMAlertForm, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WarehouseMAlertForm warehouseMAlertForm) {
        if(warehouseMAlertFormMapper.update(warehouseMAlertForm) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
