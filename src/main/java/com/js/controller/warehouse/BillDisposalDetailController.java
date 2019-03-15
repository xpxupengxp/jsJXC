package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.service.warehouse.BillDisposalDetailService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billDisposalDetail")
public class BillDisposalDetailController {

//    @Autowired
////    private BillDisposalDetailService billDisposalDetailService;
////
////    /**
////     * 添加
////     * @param billDisposalDetail
////     * @return
////     */
////    @RequestMapping(value = "/insert",method = RequestMethod.POST)
////    @OperationLogger(actType="添加单据明细")
////    public ApiResponse insert(@RequestBody BillDisposalDetail billDisposalDetail) {
////        return billDisposalDetailService.insert(billDisposalDetail);
////    }
////
////    /**
////     * 修改
////     * @param billDisposalDetail
////     * @return
////     */
////    @RequestMapping(value = "/update",method = RequestMethod.POST)
////    @OperationLogger(actType="修改单据明细")
////    public ApiResponse update(@RequestBody BillDisposalDetail billDisposalDetail) {
////        return billDisposalDetailService.update(billDisposalDetail);
////    }
////
////
////
////    /**
////     * 删除
////     * @param billDisposalDetail
////     * @return
////     */
////    @RequestMapping(value = "/delete",method = RequestMethod.POST)
////    @OperationLogger(actType="删除单据明细")
////    public ApiResponse delete(@RequestBody BillDisposalDetail billDisposalDetail) {
////        return billDisposalDetailService.delete(billDisposalDetail.getDetailIds());
////    }
////
////
////    /**
////     * 通过主键查询
////     * @param billDisposalDetail
////     * @return
////     */
////    @RequestMapping(value = "/findById",method = RequestMethod.POST)
////    public ApiResponse findById(@RequestBody BillDisposalDetail billDisposalDetail) {
////        return ApiResponse.ok().setData(billDisposalDetailService.findById(billDisposalDetail.getDetailId()));
////    }
////
////
////    /**
////     * 分页查询
////     * @param billDisposalDetail
////     * @return
////     */
////    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
////    public ApiResponse pageList(@RequestBody BillDisposalDetail billDisposalDetail, PageUtil pageUtil) {
////        if(billDisposalDetail.getPage() != 0 && billDisposalDetail.getRows() != 0){
////            pageUtil.setPage(billDisposalDetail.getPage());
////            pageUtil.setRows(billDisposalDetail.getRows());
////        }
////        if(!StringUtils.isEmpty(billDisposalDetail.getOrderBy()) && !StringUtils.isEmpty(billDisposalDetail.getOrder())){
////            pageUtil.setOrderBy(billDisposalDetail.getOrderBy());
////            pageUtil.setOrder(billDisposalDetail.getOrder());
////        }
////        return billDisposalDetailService.findPageList(billDisposalDetail,pageUtil);
////
////    }
}
