package com.js.service.material;

import com.js.entity.material.MaterialQuality;
import com.js.util.ApiResponse;

public interface MaterialQualityService {

    //新增
    ApiResponse insert(MaterialQuality materialQuality);

    //修改
    ApiResponse update(MaterialQuality materialQuality);

    //根据笔数id查找
    ApiResponse findById(Long id);

    //根据笔数id删除
    ApiResponse deleteByMRealId(Long mRealId);

}
