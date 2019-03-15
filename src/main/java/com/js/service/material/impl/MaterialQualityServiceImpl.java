package com.js.service.material.impl;

import com.js.dao.material.MaterialQualityMapper;
import com.js.entity.material.MaterialQuality;
import com.js.service.material.MaterialQualityService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialQualityServiceImpl implements MaterialQualityService {

    @Autowired
    private MaterialQualityMapper materialQualityMapper;

    @Override
    public ApiResponse findById(Long mReadId) {
        return ApiResponse.ok().setData(materialQualityMapper.findById(mReadId));
    }

    @Override
    public ApiResponse insert(MaterialQuality materialQuality) {
        if (materialQualityMapper.insert(materialQuality) > 0) {
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse update(MaterialQuality materialQuality) {
        if(materialQualityMapper.update(materialQuality) > 0) {
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse deleteByMRealId(Long mReadId) {
        if (materialQualityMapper.deleteByMRealId(mReadId) > 0) {
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }
}
