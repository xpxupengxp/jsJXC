package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.WherehouseOutcoming;
import com.js.service.warehouse.WherehouseOutcomingService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wherehouseOutcoming")
public class WherehouseOutcomingController {

    @Autowired
    private WherehouseOutcomingService wherehouseOutcomingService;



    /**
     * 通过主键查询
     * @param wherehouseOutcoming
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody WherehouseOutcoming wherehouseOutcoming) {
        return ApiResponse.ok().setData(wherehouseOutcomingService.findById(wherehouseOutcoming.getId()));
    }


    /**
     * 分页查询
     * @param wherehouseOutcoming
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody WherehouseOutcoming wherehouseOutcoming, PageUtil pageUtil) {
        if(wherehouseOutcoming.getPage() != 0 && wherehouseOutcoming.getRows() != 0){
            pageUtil.setPage(wherehouseOutcoming.getPage());
            pageUtil.setRows(wherehouseOutcoming.getRows());
        }
        if(!StringUtils.isEmpty(wherehouseOutcoming.getOrderBy()) && !StringUtils.isEmpty(wherehouseOutcoming.getOrder())){
            pageUtil.setOrderBy(wherehouseOutcoming.getOrderBy());
            pageUtil.setOrder(wherehouseOutcoming.getOrder());
        }
        return wherehouseOutcomingService.findPageList(wherehouseOutcoming,pageUtil);

    }
}
