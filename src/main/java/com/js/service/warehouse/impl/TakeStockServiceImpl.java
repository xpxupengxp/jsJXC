package com.js.service.warehouse.impl;

import com.js.dao.warehouse.TakeStockMapper;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.entity.warehouse.TakeStock;
import com.js.service.warehouse.TakeStockService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakeStockServiceImpl implements TakeStockService {

    @Autowired
    private TakeStockMapper takeStockMapper;

    @Override
    public ApiResponse delete(Long[] ids) {
        int i = 0;
        if(ids.length == 1) {
            i = takeStockMapper.delete(ids[0]);
        }else if(ids.length > 1) {
            i = takeStockMapper.deleteByIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(TakeStock takeStock) {
        if(takeStockMapper.insert(takeStock) > 0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public TakeStock findById(Long id) {
        return takeStockMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(TakeStock takeStock, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(takeStockMapper.findPageListCount(takeStock));
        }
        List<TakeStock> pageList = takeStockMapper.findPageList(takeStock, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(TakeStock takeStock) {
        if(takeStockMapper.update(takeStock) > 0){
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
