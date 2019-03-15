package com.js.controller.warehouse;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.sys.OldSysPermission;
import com.js.entity.warehouse.MaterialsDifference;
import com.js.service.warehouse.MaterialsDifferenceService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materialsDifference")
public class MaterialsDifferenceController {

    @Autowired
    private MaterialsDifferenceService materialsDifferenceService;

    /**
     * 添加
     * @param materialsDifference
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加差异物料")
    public ApiResponse insert(@RequestBody MaterialsDifference materialsDifference) {
        return materialsDifferenceService.insert(materialsDifference);
    }

    /**
     * 修改
     * @param materialsDifference
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改差异物料")
    public ApiResponse update(@RequestBody MaterialsDifference materialsDifference) {
        return materialsDifferenceService.update(materialsDifference);
    }



    /**
     * 删除
     * @param materialsDifference
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除差异物料")
    public ApiResponse delete(@RequestBody MaterialsDifference materialsDifference) {
        return materialsDifferenceService.delete(materialsDifference.getmRealIds());
    }


    /**
     * 通过主键查询
     * @param materialsDifference
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialsDifference materialsDifference) {
        return ApiResponse.ok().setData(materialsDifferenceService.findById(materialsDifference.getmRealId()));
    }


    /**
     * 分页查询
     * @param materialsDifference
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody MaterialsDifference materialsDifference, PageUtil pageUtil) {
        if(materialsDifference.getPage() != 0 && materialsDifference.getRows() != 0){
            pageUtil.setPage(materialsDifference.getPage());
            pageUtil.setRows(materialsDifference.getRows());
        }
        if(!StringUtils.isEmpty(materialsDifference.getOrderBy()) && !StringUtils.isEmpty(materialsDifference.getOrder())){
            pageUtil.setOrderBy(materialsDifference.getOrderBy());
            pageUtil.setOrder(materialsDifference.getOrder());
        }
        return materialsDifferenceService.findPageList(materialsDifference,pageUtil);

    }
}
