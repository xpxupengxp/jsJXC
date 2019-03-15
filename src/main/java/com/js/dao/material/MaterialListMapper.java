package com.js.dao.material;

import com.js.entity.material.MaterialList;
import com.js.util.GenericDao;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 物料清单Dao
 */
public interface MaterialListMapper extends GenericDao<MaterialList> {

    //批量增加
    int insertList(List<MaterialList> list);

    //批量更新
    int updateList(List<MaterialList> list);

    //根据id删除
    int deleteById(Long mId);

    //批量删除
    int deleteList(Long[] ids);

    //总量统计
    int mTotalStatistics(@Param("mTotal") BigDecimal mTotal, @Param("mId") Long mId);
}