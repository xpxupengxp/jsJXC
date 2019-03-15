package com.js.service.material;


import com.js.entity.material.MaterialList;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

import java.math.BigDecimal;
import java.util.List;

/**
 * 物料清单Service
 */
public interface MaterialListService {

    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(List<MaterialList> list);

    //通过主键查询
    MaterialList findById(Long id);

    //分页查询
    ApiResponse findPageList(MaterialList materialList, PageUtil pageUtil);

    //不分页查询
    ApiResponse findList();

    //修改
    ApiResponse update(List<MaterialList> list);

    //物料总数统计  type:1."add" 2."del"
    BigDecimal mTotalStatistics(Long mId,BigDecimal num,String type);

}
