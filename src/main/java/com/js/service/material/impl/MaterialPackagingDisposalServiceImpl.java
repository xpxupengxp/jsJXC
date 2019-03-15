package com.js.service.material.impl;

import com.js.dao.material.MaterialPackagingDisposalMapper;
import com.js.entity.material.MaterialPackagingDisposal;
import com.js.service.material.MaterialPackagingDisposalService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *包装处置ServiceImpl
 */
@Service
public class MaterialPackagingDisposalServiceImpl implements MaterialPackagingDisposalService {

    @Autowired
    private MaterialPackagingDisposalMapper materialPackagingDisposalMapper;

    @Override
    public ApiResponse findById(Long mReadId) {
        return ApiResponse.ok().setData(materialPackagingDisposalMapper.findById(mReadId));
    }

    @Override
    public ApiResponse insert(MaterialPackagingDisposal materialPackagingDisposal) {
        if (materialPackagingDisposalMapper.insert(materialPackagingDisposal) > 0) {
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse update(MaterialPackagingDisposal materialPackagingDisposal) {
        if(materialPackagingDisposalMapper.update(materialPackagingDisposal) > 0) {
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse deleteByMRealId(Long mReadId) {
        if (materialPackagingDisposalMapper.deleteByMRealId(mReadId) > 0) {
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }
}
