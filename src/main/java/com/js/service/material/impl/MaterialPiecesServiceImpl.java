package com.js.service.material.impl;

import com.js.dao.material.MaterialPiecesMapper;
import com.js.entity.material.MaterialPieces;
import com.js.service.material.*;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *物料笔数ServiceImpl
 */
@Service
public class MaterialPiecesServiceImpl implements MaterialPiecesService {

    @Autowired
    private MaterialPiecesMapper materialPiecesMapper;
    @Autowired
    private MaterialFactoryInformationService materialFactoryInformationService;
    @Autowired
    private MaterialQualityService materialQualityService;
    @Autowired
    private MaterialPackagingDisposalService materialPackagingDisposalService;
    @Autowired
    private MaterialVolumePriceService materialVolumePriceService;

    @Override
    public ApiResponse insert(MaterialPieces materialPieces) {
        if(materialPiecesMapper.insert(materialPieces) > 0) {
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse update(MaterialPieces materialPieces) {
        if(materialPiecesMapper.update(materialPieces) > 0) {
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse deleteByMRealId(Long mRealId) {
        materialFactoryInformationService.deleteByMRealId(mRealId);
        materialQualityService.deleteByMRealId(mRealId);
        materialPackagingDisposalService.deleteByMRealId(mRealId);
        materialVolumePriceService.deleteByMRealId(mRealId);
        if(materialPiecesMapper.deleteByMRealId(mRealId) > 0) {
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse deleteByMId(Long mId) {
        List<MaterialPieces> list = materialPiecesMapper.findByMId(mId);
        for (MaterialPieces materialPieces:list) {
            materialFactoryInformationService.deleteByMRealId(materialPieces.getmRealId());
            materialQualityService.deleteByMRealId(materialPieces.getmRealId());
            materialPackagingDisposalService.deleteByMRealId(materialPieces.getmRealId());
            materialVolumePriceService.deleteByMRealId(materialPieces.getmRealId());
        }
        if(materialPiecesMapper.deleteByMId(mId) > 0) {
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public MaterialPieces findById(Long id) {
        return materialPiecesMapper.findById(id);
    }

    @Override
    public ApiResponse findByMId(Long mId) {
        return ApiResponse.ok().setData(materialPiecesMapper.findByMId(mId));
    }

    @Override
    public ApiResponse findList() {
        return ApiResponse.ok().setData(materialPiecesMapper.findList(null));
    }

    @Override
    public ApiResponse findPageList(MaterialPieces materialPieces, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(materialPiecesMapper.findPageListCount(materialPieces));
        }
        List<MaterialPieces> pageList = materialPiecesMapper.findPageList(materialPieces, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

}
