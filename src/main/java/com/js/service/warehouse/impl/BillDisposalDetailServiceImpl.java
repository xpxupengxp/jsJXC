package com.js.service.warehouse.impl;

import com.js.dao.warehouse.BillDisposalDetailMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.service.warehouse.BillDisposalDetailService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDisposalDetailServiceImpl implements BillDisposalDetailService {

    @Autowired
    private BillDisposalDetailMapper billDisposalDetailMapper;

    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = billDisposalDetailMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = billDisposalDetailMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(BillDisposalDetail billDisposalDetail) {
        if(billDisposalDetailMapper.insert(billDisposalDetail) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public BillDisposalDetail findById(Integer id) {
        return billDisposalDetailMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(BillDisposalDetail billDisposalDetail, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(billDisposalDetailMapper.findPageListCount(billDisposalDetail));
        }
        List<BillDisposalDetail> pageList = billDisposalDetailMapper.findPageList(billDisposalDetail, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(BillDisposalDetail billDisposalDetail) {
        if(billDisposalDetailMapper.update(billDisposalDetail) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
