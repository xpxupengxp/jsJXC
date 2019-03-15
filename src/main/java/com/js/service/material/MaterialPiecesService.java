package com.js.service.material;

import com.js.entity.material.MaterialPieces;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

/**
 *物料笔数Service
 */
public interface MaterialPiecesService {

    //根据id查询
    MaterialPieces findById(Long id);

    //根据物料id查询
    ApiResponse findByMId(Long mId);

    //查询所有
    ApiResponse findList();

    //分页查询
    ApiResponse findPageList(MaterialPieces materialPieces, PageUtil pageUtil);

    //新增
    ApiResponse insert(MaterialPieces materialPieces);

    //修改
    ApiResponse update(MaterialPieces materialPieces);

    //删除
    ApiResponse deleteByMRealId(Long mRealId);

    //根据mid删除笔数
    ApiResponse deleteByMId(Long mId);

}
