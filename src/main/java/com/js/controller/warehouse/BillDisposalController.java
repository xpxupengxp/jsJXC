package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.warehouse.BillDisposal;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.service.warehouse.BillDisposalService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billDisposal")
public class BillDisposalController {

    @Autowired
    private BillDisposalService billDisposalService;

    /**
     * 添加
     * @param billDisposalDetail
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加单据")
    public ApiResponse insert(@RequestBody BillDisposalDetail billDisposalDetail) {
        return billDisposalService.insert(billDisposalDetail);
    }

    /**
     * 修改
     * @param billDisposalDetail
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改单据")
    public ApiResponse update(@RequestBody BillDisposalDetail billDisposalDetail) {
        return billDisposalService.update(billDisposalDetail);
    }



    /**
     * 删除
     * @param billDisposal
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除单据")
    public ApiResponse delete(@RequestBody BillDisposal billDisposal) {
        return billDisposalService.delete(billDisposal.getIds());
    }


    /**
     * 通过主键查询
     * @param billDisposal
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody BillDisposal billDisposal) {
        return ApiResponse.ok().setData(billDisposalService.findById(billDisposal.getcId()));
    }


    /**
     * 分页查询
     * @param billDisposal
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody BillDisposal billDisposal, PageUtil pageUtil) {
        if(billDisposal.getPage() != 0 && billDisposal.getRows() != 0){
            pageUtil.setPage(billDisposal.getPage());
            pageUtil.setRows(billDisposal.getRows());
        }
        if(!StringUtils.isEmpty(billDisposal.getOrderBy()) && !StringUtils.isEmpty(billDisposal.getOrder())){
            pageUtil.setOrderBy(billDisposal.getOrderBy());
            pageUtil.setOrder(billDisposal.getOrder());
        }
        return billDisposalService.findPageList(billDisposal,pageUtil);

    }

}
