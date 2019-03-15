package com.js.service.warehouse;

import com.js.entity.warehouse.BillDisposal;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface BillDisposalService {
    //删除
    ApiResponse delete(Integer[] ids);

    //添加
    ApiResponse insert(BillDisposalDetail billDisposalDetail);

    //通过主键查询
    BillDisposal findById(Integer id);

    //分页查询
    ApiResponse findPageList(BillDisposal billDisposal, PageUtil pageUtil);

    //修改
    ApiResponse update(BillDisposalDetail billDisposalDetail);
}
