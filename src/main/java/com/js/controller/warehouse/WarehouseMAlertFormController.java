package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WarehouseMAlertForm;
import com.js.service.warehouse.WarehouseMAlertFormService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/warehouseMAlertForm")
public class WarehouseMAlertFormController {

    @Autowired
    private WarehouseMAlertFormService warehouseMAlertFormService;


    /**
     * 添加
     * @param warehouseMAlertForm
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加报警参数形式")
    public ApiResponse insert(@RequestBody WarehouseMAlertForm warehouseMAlertForm) {
        return warehouseMAlertFormService.insert(warehouseMAlertForm);
    }

    /**
     * 修改
     * @param warehouseMAlertForm
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改报警参数形式")
    public ApiResponse update(@RequestBody WarehouseMAlertForm warehouseMAlertForm) {
        return warehouseMAlertFormService.update(warehouseMAlertForm);
    }



    /**
     * 删除
     * @param warehouseMAlertForm
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除报警参数形式")
    public ApiResponse delete(@RequestBody WarehouseMAlertForm warehouseMAlertForm) {
        return warehouseMAlertFormService.delete(warehouseMAlertForm.getIds());
    }


    /**
     * 通过主键查询
     * @param warehouseMAlertForm
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody WarehouseMAlertForm warehouseMAlertForm) {
        return ApiResponse.ok().setData(warehouseMAlertFormService.findById(warehouseMAlertForm.getId()));
    }


    /**
     * 分页查询
     * @param warehouseMAlertForm
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody WarehouseMAlertForm warehouseMAlertForm, PageUtil pageUtil) {
        if(warehouseMAlertForm.getPage() != 0 && warehouseMAlertForm.getRows() != 0){
            pageUtil.setPage(warehouseMAlertForm.getPage());
            pageUtil.setRows(warehouseMAlertForm.getRows());
        }
        if(!StringUtils.isEmpty(warehouseMAlertForm.getOrderBy()) && !StringUtils.isEmpty(warehouseMAlertForm.getOrder())){
            pageUtil.setOrderBy(warehouseMAlertForm.getOrderBy());
            pageUtil.setOrder(warehouseMAlertForm.getOrder());
        }
        return warehouseMAlertFormService.findPageList(warehouseMAlertForm,pageUtil);

    }
}
