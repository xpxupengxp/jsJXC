package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseType;
import com.js.service.warehouse.WarehouseTypeService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouseType")
public class WarehouseTypeController {

    @Autowired
    private WarehouseTypeService warehouseTypeService;


    /**
     * 添加
     * @param warehouseType
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加仓库类型")
    public ApiResponse insert(@RequestBody WarehouseType warehouseType) {
        return warehouseTypeService.insert(warehouseType);
    }

    /**
     * 修改
     * @param warehouseType
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改仓库类型")
    public ApiResponse update(@RequestBody WarehouseType warehouseType) {
        return warehouseTypeService.update(warehouseType);
    }



    /**
     * 删除
     * @param warehouseType
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除仓库类型")
    public ApiResponse delete(@RequestBody WarehouseType warehouseType) {
        return warehouseTypeService.delete(warehouseType.getIds());
    }


    /**
     * 通过主键查询
     * @param warehouseType
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody WarehouseType warehouseType) {
        return ApiResponse.ok().setData(warehouseTypeService.findById(warehouseType.getId()));
    }


    /**
     * 分页查询
     * @param warehouseType
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody WarehouseType warehouseType, PageUtil pageUtil) {
        if(warehouseType.getPage() != 0 && warehouseType.getRows() != 0){
            pageUtil.setPage(warehouseType.getPage());
            pageUtil.setRows(warehouseType.getRows());
        }
        if(!StringUtils.isEmpty(warehouseType.getOrderBy()) && !StringUtils.isEmpty(warehouseType.getOrder())){
            pageUtil.setOrderBy(warehouseType.getOrderBy());
            pageUtil.setOrder(warehouseType.getOrder());
        }
        return warehouseTypeService.findPageList(warehouseType,pageUtil);

    }
}
