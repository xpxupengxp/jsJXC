package com.js.service.material;

import com.js.entity.material.MaterialVolumePrice;
import com.js.util.ApiResponse;

/**
 * 物料量价Service
 */
public interface MaterialVolumePriceService {

    //新增
    ApiResponse insert(MaterialVolumePrice materialVolumePrice);

    //修改
    ApiResponse update(MaterialVolumePrice materialVolumePrice);

    //根据笔数id查找
    ApiResponse findById(Long id);

    //根据笔数id删除
    ApiResponse deleteByMRealId(Long mRealId);

}
