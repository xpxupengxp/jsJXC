package com.js.service.warehouse.impl;

import com.js.dao.warehouse.MaterialsDifferenceMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.MaterialsDifference;
import com.js.service.warehouse.MaterialsDifferenceService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialsDifferenceServiceImpl implements MaterialsDifferenceService {

    @Autowired
    private MaterialsDifferenceMapper materialsDifferenceMapper;

    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = materialsDifferenceMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = materialsDifferenceMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(MaterialsDifference materialsDifference) {
        if(materialsDifferenceMapper.insert(materialsDifference) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public MaterialsDifference findById(Long id) {
        return materialsDifferenceMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(MaterialsDifference materialsDifference, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(materialsDifferenceMapper.findPageListCount(materialsDifference));
        }
        List<MaterialsDifference> pageList = materialsDifferenceMapper.findPageList(materialsDifference, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(MaterialsDifference materialsDifference) {
        if(materialsDifferenceMapper.update(materialsDifference) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
