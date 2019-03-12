package com.js.controller;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.Org;
import com.js.service.OrgService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/org")
public class OrgController {

    @Autowired
    private OrgService orgService;

    /**
     * 添加
     * @param org
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增组织机构")
    public ApiResponse insert(@RequestBody Org org) {
        return orgService.insert(org);
    }

    /**
     * 修改
     * @param org
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改组织机构")
    public ApiResponse update(@RequestBody Org org) {
        return orgService.update(org);
    }



    /**
     * 删除
     * @param org
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除组织机构")
    public ApiResponse delete(@RequestBody Org org) {
        return orgService.delete(org.getOrgIds());
    }


    /**
     * 通过主键查询
     * @param org
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody Org org) {
        return ApiResponse.ok().setData(orgService.findById(org.getOrgId()));
    }


    /**
     * 分页查询
     * @param org
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody Org org, PageUtil pageUtil) {
        if(org.getPage() != 0 && org.getRows() != 0){
            pageUtil.setPage(org.getPage());
            pageUtil.setRows(org.getRows());
        }
        if(!StringUtils.isEmpty(org.getOrderBy()) && !StringUtils.isEmpty(org.getOrder())){
            pageUtil.setOrderBy(org.getOrderBy());
            pageUtil.setOrder(org.getOrder());
        }
        return orgService.findPageList(org,pageUtil);

    }

    /**
     * 不分页查询
     * @param org
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody Org org) {
        return orgService.findList(org);

    }

//    /**
//     * 启用/停用组织
//     * @param org
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody Org org) {
//        orgService.switchStatus(org);
//        return ApiResponse.ok();
//    }
}
