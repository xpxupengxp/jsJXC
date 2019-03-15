package com.js.service.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.MaterialDisposal;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface MaterialDisposalService {
    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(MaterialDisposal materialDisposal);

    //通过主键查询
    MaterialDisposal findById(Long id);

    //分页查询
    ApiResponse findPageList(MaterialDisposal materialDisposal, PageUtil pageUtil);

    //修改
    ApiResponse update(MaterialDisposal materialDisposal);
}
