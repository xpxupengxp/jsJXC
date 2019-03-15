package com.js.service.material;

import com.js.entity.material.MaterialPackagingDisposal;
import com.js.util.ApiResponse;

/**
 *包装处置Service
 */
public interface MaterialPackagingDisposalService {

    //新增
    ApiResponse insert(MaterialPackagingDisposal materialPackagingDisposal);

    //修改
    ApiResponse update(MaterialPackagingDisposal materialPackagingDisposal);

    //根据笔数id查找
    ApiResponse findById(Long id);

    //根据笔数id删除
    ApiResponse deleteByMRealId(Long mRealId);

}
