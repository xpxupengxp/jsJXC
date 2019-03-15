package com.js.dao.material;

import com.js.entity.material.MaterialPieces;
import com.js.util.GenericDao;

import java.util.List;

/**
 *物料笔数Dao
 */
public interface MaterialPiecesMapper extends GenericDao<MaterialPieces> {

    //根据mId删除物料笔数
    int deleteByMId(Long mId);

    //根据笔数id删除
    int deleteByMRealId(Long mRealId);

    //根据mId查所有物料笔数
    List<MaterialPieces> findByMId(Long mId);
}