package com.js.service.material.impl;

import com.js.dao.material.MaterialFactoryInformationMapper;
import com.js.entity.material.MaterialFactoryInformation;
import com.js.service.material.MaterialFactoryInformationService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 物料出厂信息ServiceImpl
 */
@Service
public class MaterialFactoryInformationServiceImpl implements MaterialFactoryInformationService {

    @Autowired
    private MaterialFactoryInformationMapper materialFactoryInformationMapper;

    @Override
    public ApiResponse findById(Long mReadId) {
        return ApiResponse.ok().setData(materialFactoryInformationMapper.findById(mReadId));
    }

    @Override
    public ApiResponse insert(MaterialFactoryInformation materialFactoryInformation) {
        if (materialFactoryInformationMapper.insert(materialFactoryInformation) > 0) {
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse update(MaterialFactoryInformation materialFactoryInformation) {
        if(materialFactoryInformationMapper.update(materialFactoryInformation) > 0) {
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse deleteByMRealId(Long mReadId) {
        if (materialFactoryInformationMapper.deleteByMRealId(mReadId) > 0) {
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }
}
