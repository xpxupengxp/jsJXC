package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.Warehouse;
import com.js.entity.warehouse.WarehouseUser;
import com.js.service.warehouse.WarehouseService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    /**
     * 添加
     * @param warehouse
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加仓库")
    public ApiResponse insert(@RequestBody Warehouse warehouse) {
        return warehouseService.insert(warehouse);
    }

    /**
     * 修改
     * @param warehouse
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改仓库")
    public ApiResponse update(@RequestBody Warehouse warehouse) {
        return warehouseService.update(warehouse);
    }



    /**
     * 删除
     * @param warehouse
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除仓库")
    public ApiResponse delete(@RequestBody Warehouse warehouse) {
        return warehouseService.delete(warehouse.getWhIds());
    }


    /**
     * 通过主键查询
     * @param warehouse
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody Warehouse warehouse) {
        return ApiResponse.ok().setData(warehouseService.findById(warehouse.getWhId()));
    }


    /**
     * 分页查询
     * @param warehouse
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody Warehouse warehouse, PageUtil pageUtil) {
        if(warehouse.getPage() != 0 && warehouse.getRows() != 0){
            pageUtil.setPage(warehouse.getPage());
            pageUtil.setRows(warehouse.getRows());
        }
        if(!StringUtils.isEmpty(warehouse.getOrderBy()) && !StringUtils.isEmpty(warehouse.getOrder())){
            pageUtil.setOrderBy(warehouse.getOrderBy());
            pageUtil.setOrder(warehouse.getOrder());
        }
        return warehouseService.findPageList(warehouse,pageUtil);

    }



    /**
     * 添加库管员
     * @param warehouseUser
     * @description 选择一个仓库，勾选多个库管员
     * @return
     */
    @RequestMapping(value = "/insertWarehouseUser",method = RequestMethod.POST)
    public ApiResponse insertWarehouseUser(@RequestBody WarehouseUser warehouseUser) {
        return ApiResponse.ok().setData(warehouseService.insertWarehouseUser(warehouseUser));
    }


    /**
     * 删除库管员
     * @param warehouseUser
     * @return
     */
    @RequestMapping(value = "/deleteWarehouseUser",method = RequestMethod.POST)
    public ApiResponse deleteWarehouseUser(@RequestBody WarehouseUser warehouseUser) {
        return ApiResponse.ok().setData(warehouseService.deleteWarehouseUser(warehouseUser));
    }
}
