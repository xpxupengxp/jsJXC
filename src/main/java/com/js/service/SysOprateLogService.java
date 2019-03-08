package com.js.service;

import com.js.entity.SysOprateLog;
import com.js.entity.SysUsers;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;

import java.util.List;

public interface SysOprateLogService {

    //添加
    ApiResponse insert(SysOprateLog sysOprateLog);

    //通过主键查询
    SysOprateLog findById(Long id);

    //分页查询
    ApiResponse findPageList(SysOprateLog sysOprateLog, PageUtil pageUtil);
}
