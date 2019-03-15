package com.js.service.material.impl;

import com.js.dao.material.MaterialVolumePriceMapper;
import com.js.entity.material.MaterialVolumePrice;
import com.js.service.material.MaterialListService;
import com.js.service.material.MaterialPiecesService;
import com.js.service.material.MaterialVolumePriceService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 物料量价ServiceImpl
 */
@Service
public class MaterialVolumePriceServiceImpl implements MaterialVolumePriceService {

    @Autowired
    private MaterialListService materialListService;
    @Autowired
    private MaterialVolumePriceMapper materialVolumePriceMapper;
    @Autowired
    private MaterialPiecesService materialPiecesService;

    @Override
    public ApiResponse findById(Long mRealId) {
        return ApiResponse.ok().setData(materialVolumePriceMapper.findById(mRealId));
    }

    @Override
    public ApiResponse insert(MaterialVolumePrice materialVolumePrice) {
        if(materialVolumePrice.getmNumber() == null) {
            materialVolumePrice.setmNumber(new BigDecimal(0));
        }
        if (materialVolumePriceMapper.insert(materialVolumePrice) > 0) {
            //添加物料清单总数数量
            materialListService.mTotalStatistics(materialPiecesService.findById(materialVolumePrice.getmRealId()).getmId(), materialVolumePrice.getmNumber(),"add");
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse update(MaterialVolumePrice materialVolumePrice) {
        Long mRealId = materialVolumePrice.getmRealId();
        BigDecimal number = materialVolumePriceMapper.findById(mRealId).getmNumber();
        if(materialVolumePriceMapper.update(materialVolumePrice) > 0) {
            if(materialVolumePrice.getmNumber() != null) {
                //减少物料清单总数数量
                materialListService.mTotalStatistics(materialPiecesService.findById(mRealId).getmId(), materialVolumePrice.getmNumber().subtract(number),"add");
            }
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public ApiResponse deleteByMRealId(Long mReadId) {
        BigDecimal number = materialVolumePriceMapper.findById(mReadId).getmNumber();
        if (materialVolumePriceMapper.deleteByMRealId(mReadId) > 0) {
            //减少物料清单总数数量
            materialListService.mTotalStatistics(materialPiecesService.findById(mReadId).getmId(), number,"del");
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }
}
