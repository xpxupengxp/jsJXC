package com.js.controller.warehouse;

import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseUser;
import com.js.service.warehouse.WarehouseUserService;
import com.js.util.ApiResponse;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/warehouseUser")
public class WarehouseUserController {

    @Autowired
    private WarehouseUserService warehouseUserService;


    /**
     * 添加
     * @param warehouseUser
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加仓库用户")
    public ApiResponse insert(@RequestBody WarehouseUser warehouseUser) {
        return warehouseUserService.insert(warehouseUser);
    }


    /**
     * 删除
     * @param warehouseUser
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除仓库用户")
    public ApiResponse delete(@RequestBody WarehouseUser warehouseUser) {
        return warehouseUserService.delete(warehouseUser.getWhuIds());
    }
}
