package com.js.service.warehouse.impl;

import com.js.dao.warehouse.MaterialDisposalMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.MaterialDisposal;
import com.js.service.warehouse.MaterialDisposalService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialDisposalServiceImpl implements MaterialDisposalService {

    @Autowired
    private MaterialDisposalMapper materialDisposalMapper;


    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = materialDisposalMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = materialDisposalMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(MaterialDisposal materialDisposal) {
        if(materialDisposalMapper.insert(materialDisposal) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public MaterialDisposal findById(Long id) {
        return materialDisposalMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(MaterialDisposal materialDisposal, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(materialDisposalMapper.findPageListCount(materialDisposal));
        }
        List<MaterialDisposal> pageList = materialDisposalMapper.findPageList(materialDisposal, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(MaterialDisposal materialDisposal) {
        if(materialDisposalMapper.update(materialDisposal) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
