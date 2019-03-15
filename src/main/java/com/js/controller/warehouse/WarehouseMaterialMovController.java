package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseMaterialMov;
import com.js.service.warehouse.WarehouseMaterialMovService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouseMaterialMov")
public class WarehouseMaterialMovController {
    @Autowired
    private WarehouseMaterialMovService warehouseMaterialMovService;

    /**
     * 通过主键查询
     * @param warehouseMaterialMov
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody WarehouseMaterialMov warehouseMaterialMov) {
        return ApiResponse.ok().setData(warehouseMaterialMovService.findById(warehouseMaterialMov.getId()));
    }


    /**
     * 分页查询
     * @param warehouseMaterialMov
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody WarehouseMaterialMov warehouseMaterialMov, PageUtil pageUtil) {
        if(warehouseMaterialMov.getPage() != 0 && warehouseMaterialMov.getRows() != 0){
            pageUtil.setPage(warehouseMaterialMov.getPage());
            pageUtil.setRows(warehouseMaterialMov.getRows());
        }
        if(!StringUtils.isEmpty(warehouseMaterialMov.getOrderBy()) && !StringUtils.isEmpty(warehouseMaterialMov.getOrder())){
            pageUtil.setOrderBy(warehouseMaterialMov.getOrderBy());
            pageUtil.setOrder(warehouseMaterialMov.getOrder());
        }
        return warehouseMaterialMovService.findPageList(warehouseMaterialMov,pageUtil);

    }
}
