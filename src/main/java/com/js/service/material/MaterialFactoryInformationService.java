package com.js.service.material;

import com.js.entity.material.MaterialFactoryInformation;
import com.js.util.ApiResponse;

/**
 * 物料出厂信息Service
 */
public interface MaterialFactoryInformationService {

    ApiResponse findById(Long mReadId);

    ApiResponse insert(MaterialFactoryInformation materialFactoryInformation);

    ApiResponse update(MaterialFactoryInformation materialFactoryInformation);

    ApiResponse deleteByMRealId(Long mReadId);

}
