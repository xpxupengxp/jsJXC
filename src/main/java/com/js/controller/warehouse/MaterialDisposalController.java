package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.MaterialDisposal;
import com.js.service.warehouse.MaterialDisposalService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materialDisposal")
public class MaterialDisposalController {

    @Autowired
    private MaterialDisposalService materialDisposalService;


    /**
     * 添加
     * @param materialDisposal
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加物料处置")
    public ApiResponse insert(@RequestBody MaterialDisposal materialDisposal) {
        return materialDisposalService.insert(materialDisposal);
    }


    /**
     * 删除
     * @param materialDisposal
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除物料处置")
    public ApiResponse delete(@RequestBody MaterialDisposal materialDisposal) {
        return materialDisposalService.delete(materialDisposal.getmRealIds());
    }


    /**
     * 通过主键查询
     * @param materialDisposal
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialDisposal materialDisposal) {
        return ApiResponse.ok().setData(materialDisposalService.findById(materialDisposal.getmRealId()));
    }


    /**
     * 分页查询
     * @param materialDisposal
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody MaterialDisposal materialDisposal, PageUtil pageUtil) {
        if(materialDisposal.getPage() != 0 && materialDisposal.getRows() != 0){
            pageUtil.setPage(materialDisposal.getPage());
            pageUtil.setRows(materialDisposal.getRows());
        }
        if(!StringUtils.isEmpty(materialDisposal.getOrderBy()) && !StringUtils.isEmpty(materialDisposal.getOrder())){
            pageUtil.setOrderBy(materialDisposal.getOrderBy());
            pageUtil.setOrder(materialDisposal.getOrder());
        }
        return materialDisposalService.findPageList(materialDisposal,pageUtil);

    }
}
