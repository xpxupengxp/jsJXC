package com.js.service.warehouse;

import com.js.entity.warehouse.BillDisposalDetail;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface BillDisposalDetailService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(BillDisposalDetail billDisposalDetail);

    //通过主键查询
    BillDisposalDetail findById(Integer id);

    //分页查询
    ApiResponse findPageList(BillDisposalDetail billDisposalDetail, PageUtil pageUtil);

    //修改
    ApiResponse update(BillDisposalDetail billDisposalDetail);
}
