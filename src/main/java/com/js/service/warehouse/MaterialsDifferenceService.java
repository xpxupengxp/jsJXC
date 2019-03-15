package com.js.service.warehouse;

import com.js.entity.warehouse.MaterialsDifference;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface MaterialsDifferenceService {
    //删除
    ApiResponse delete(Long[] ids);

    //添加
    ApiResponse insert(MaterialsDifference materialsDifference);

    //通过主键查询
    MaterialsDifference findById(Long id);

    //分页查询
    ApiResponse findPageList(MaterialsDifference materialsDifference, PageUtil pageUtil);

    //修改
    ApiResponse update(MaterialsDifference materialsDifference);
}
