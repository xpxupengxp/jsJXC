package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.TakeStock;
import com.js.service.warehouse.TakeStockService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/takeStock")
public class TakeStockController {

    @Autowired
    private TakeStockService takeStockService;

    /**
     * 添加
     * @param takeStock
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加盘点记录")
    public ApiResponse insert(@RequestBody TakeStock takeStock) {
        return takeStockService.insert(takeStock);
    }

    /**
     * 修改
     * @param takeStock
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改盘点记录")
    public ApiResponse update(@RequestBody TakeStock takeStock) {
        return takeStockService.update(takeStock);
    }



    /**
     * 删除
     * @param takeStock
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除盘点记录")
    public ApiResponse delete(@RequestBody TakeStock takeStock) {
        return takeStockService.delete(takeStock.getTsIds());
    }


    /**
     * 通过主键查询
     * @param takeStock
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody TakeStock takeStock) {
        return ApiResponse.ok().setData(takeStockService.findById(takeStock.getTsId()));
    }


    /**
     * 分页查询
     * @param takeStock
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody TakeStock takeStock, PageUtil pageUtil) {
        if(takeStock.getPage() != 0 && takeStock.getRows() != 0){
            pageUtil.setPage(takeStock.getPage());
            pageUtil.setRows(takeStock.getRows());
        }
        if(!StringUtils.isEmpty(takeStock.getOrderBy()) && !StringUtils.isEmpty(takeStock.getOrder())){
            pageUtil.setOrderBy(takeStock.getOrderBy());
            pageUtil.setOrder(takeStock.getOrder());
        }
        return takeStockService.findPageList(takeStock,pageUtil);

    }
}
