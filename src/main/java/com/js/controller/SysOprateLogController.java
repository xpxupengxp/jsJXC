package com.js.controller;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.SysOprateLog;
import com.js.service.SysOprateLogService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oprateLog")
public class SysOprateLogController {

    @Autowired
    private SysOprateLogService sysOprateLogService;


    /**
     * 添加
     * @param sysOprateLog
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody SysOprateLog sysOprateLog) {
        return sysOprateLogService.insert(sysOprateLog);
    }



    /**
     * 通过主键查询
     * @param sysOprateLog
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysOprateLog sysOprateLog) {
        return ApiResponse.ok().setData(sysOprateLogService.findById(sysOprateLog.getId()));
    }


    /**
     * 分页查询
     * @param sysOprateLog
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysOprateLog sysOprateLog, PageUtil pageUtil) {
        if(sysOprateLog.getPage() != 0 && sysOprateLog.getRows() != 0){
            pageUtil.setPage(sysOprateLog.getPage());
            pageUtil.setRows(sysOprateLog.getRows());
        }
        if(!StringUtils.isEmpty(sysOprateLog.getOrderBy()) && !StringUtils.isEmpty(sysOprateLog.getOrder())){
            pageUtil.setOrderBy(sysOprateLog.getOrderBy());
            pageUtil.setOrder(sysOprateLog.getOrder());
        }
        return sysOprateLogService.findPageList(sysOprateLog,pageUtil);

    }


}
