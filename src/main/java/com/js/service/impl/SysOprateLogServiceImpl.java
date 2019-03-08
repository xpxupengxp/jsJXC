package com.js.service.impl;

import com.js.dao.SysOprateLogMapper;
import com.js.entity.SysOprateLog;
import com.js.entity.SysUsers;
import com.js.service.SysOprateLogService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOprateLogServiceImpl implements SysOprateLogService {

    @Autowired
    private SysOprateLogMapper sysOprateLogMapper;

    @Override
    public ApiResponse insert(SysOprateLog sysOprateLog) {
        int i = sysOprateLogMapper.insert(sysOprateLog);
        if(i !=0){
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public SysOprateLog findById(Long id) {
        return sysOprateLogMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(SysOprateLog sysOprateLog, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(sysOprateLogMapper.findPageListCount(sysOprateLog));
        }
        List<SysOprateLog> pageList = sysOprateLogMapper.findPageList(sysOprateLog, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }
}
