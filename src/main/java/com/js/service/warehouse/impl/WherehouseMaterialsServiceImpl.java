package com.js.service.warehouse.impl;

import com.js.dao.warehouse.WherehouseMaterialsMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.WherehouseMaterials;
import com.js.service.warehouse.WherehouseMaterialsService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WherehouseMaterialsServiceImpl implements WherehouseMaterialsService {

    @Autowired
    private WherehouseMaterialsMapper wherehouseMaterialsMapper;

    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = wherehouseMaterialsMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = wherehouseMaterialsMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(WherehouseMaterials wherehouseMaterials) {
        if(wherehouseMaterialsMapper.insert(wherehouseMaterials) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public WherehouseMaterials findById(Integer id) {
        return wherehouseMaterialsMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(WherehouseMaterials wherehouseMaterials, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(wherehouseMaterialsMapper.findPageListCount(wherehouseMaterials));
        }
        List<WherehouseMaterials> pageList = wherehouseMaterialsMapper.findPageList(wherehouseMaterials, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(WherehouseMaterials wherehouseMaterials) {
        if(wherehouseMaterialsMapper.update(wherehouseMaterials) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
