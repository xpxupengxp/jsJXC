package com.js.service.warehouse.impl;

import com.js.dao.warehouse.MaterialsFaultyMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.MaterialsFaulty;
import com.js.service.warehouse.MaterialsFaultyService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialsFaultyServiceImpl implements MaterialsFaultyService {

    @Autowired
    private MaterialsFaultyMapper materialsFaultyMapper;

    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = materialsFaultyMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = materialsFaultyMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(MaterialsFaulty materialsFaulty) {
        if(materialsFaultyMapper.insert(materialsFaulty) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public MaterialsFaulty findById(Integer id) {
        return materialsFaultyMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(MaterialsFaulty materialsFaulty, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(materialsFaultyMapper.findPageListCount(materialsFaulty));
        }
        List<MaterialsFaulty> pageList = materialsFaultyMapper.findPageList(materialsFaulty, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(MaterialsFaulty materialsFaulty) {
        if(materialsFaultyMapper.update(materialsFaulty) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
