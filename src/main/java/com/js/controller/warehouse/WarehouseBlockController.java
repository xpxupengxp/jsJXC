package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseBlock;
import com.js.service.warehouse.WarehouseBlockService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouseBlock")
public class WarehouseBlockController {

    @Autowired
    private WarehouseBlockService warehouseBlockService;

    /**
     * 添加
     * @param warehouseBlock
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加仓库分区")
    public ApiResponse insert(@RequestBody WarehouseBlock warehouseBlock) {
        return warehouseBlockService.insert(warehouseBlock);
    }

    /**
     * 修改
     * @param warehouseBlock
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改仓库分区")
    public ApiResponse update(@RequestBody WarehouseBlock warehouseBlock) {
        return warehouseBlockService.update(warehouseBlock);
    }



    /**
     * 删除
     * @param warehouseBlock
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除仓库分区")
    public ApiResponse delete(@RequestBody WarehouseBlock warehouseBlock) {
        return warehouseBlockService.delete(warehouseBlock.getWbIds());
    }


    /**
     * 通过主键查询
     * @param warehouseBlock
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody WarehouseBlock warehouseBlock) {
        return ApiResponse.ok().setData(warehouseBlockService.findById(warehouseBlock.getWbId()));
    }


    /**
     * 分页查询
     * @param warehouseBlock
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody WarehouseBlock warehouseBlock, PageUtil pageUtil) {
        if(warehouseBlock.getPage() != 0 && warehouseBlock.getRows() != 0){
            pageUtil.setPage(warehouseBlock.getPage());
            pageUtil.setRows(warehouseBlock.getRows());
        }
        if(!StringUtils.isEmpty(warehouseBlock.getOrderBy()) && !StringUtils.isEmpty(warehouseBlock.getOrder())){
            pageUtil.setOrderBy(warehouseBlock.getOrderBy());
            pageUtil.setOrder(warehouseBlock.getOrder());
        }
        return warehouseBlockService.findPageList(warehouseBlock,pageUtil);

    }


}
