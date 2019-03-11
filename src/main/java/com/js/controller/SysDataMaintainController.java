package com.js.controller;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.SysDataMaintain;
import com.js.service.SysDataMaintainService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dataMaintain")
public class SysDataMaintainController {

    @Autowired
    private SysDataMaintainService sysDataMaintainService;

    /**
     * 添加
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增系统数据")
    public ApiResponse insert(@RequestBody SysDataMaintain sysDataMaintain) {
        return sysDataMaintainService.insert(sysDataMaintain);
    }

    /**
     * 修改
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @OperationLogger(actType="修改系统数据")
    public ApiResponse update(@RequestBody SysDataMaintain sysDataMaintain) {
        return sysDataMaintainService.update(sysDataMaintain);
    }



    /**
     * 删除
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @OperationLogger(actType="删除系统数据")
    public ApiResponse delete(@RequestBody SysDataMaintain sysDataMaintain) {
        return sysDataMaintainService.delete(sysDataMaintain.getIds());
    }


    /**
     * 通过主键查询
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysDataMaintain sysDataMaintain) {
        return ApiResponse.ok().setData(sysDataMaintainService.findById(sysDataMaintain.getId()));
    }


    /**
     * 分页查询
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody SysDataMaintain sysDataMaintain, PageUtil pageUtil) {
        if(sysDataMaintain.getPage() != 0 && sysDataMaintain.getRows() != 0){
            pageUtil.setPage(sysDataMaintain.getPage());
            pageUtil.setRows(sysDataMaintain.getRows());
        }
        if(!StringUtils.isEmpty(sysDataMaintain.getOrderBy()) && !StringUtils.isEmpty(sysDataMaintain.getOrder())){
            pageUtil.setOrderBy(sysDataMaintain.getOrderBy());
            pageUtil.setOrder(sysDataMaintain.getOrder());
        }
        return sysDataMaintainService.findPageList(sysDataMaintain,pageUtil);

    }


    /**
     * 不分页查询
     * @param sysDataMaintain
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysDataMaintain sysDataMaintain) {
        return sysDataMaintainService.findList(sysDataMaintain);

    }

}
