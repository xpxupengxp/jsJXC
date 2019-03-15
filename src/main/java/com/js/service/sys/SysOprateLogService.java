package com.js.service.sys;

import com.js.entity.sys.SysOprateLog;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

public interface SysOprateLogService {

    //添加
    ApiResponse insert(SysOprateLog sysOprateLog);

    //通过主键查询
    SysOprateLog findById(Long id);

    //分页查询
    ApiResponse findPageList(SysOprateLog sysOprateLog, PageUtil pageUtil);
}
