package com.js.controller.material;

import com.js.entity.material.MaterialPackagingDisposal;
import com.js.service.material.MaterialPackagingDisposalService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *包装处置controller
 */
@RestController
@RequestMapping("/materialPackagingDisposal")
public class MaterialPackagingDisposalController {

    @Autowired
    private MaterialPackagingDisposalService materialPackagingDisposalService;

    /**
     * 新增
     * @param materialPackagingDisposal
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody MaterialPackagingDisposal materialPackagingDisposal) {
        return materialPackagingDisposalService.insert(materialPackagingDisposal);
    }

    /**
     * 修改
     * @param materialPackagingDisposal
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody MaterialPackagingDisposal materialPackagingDisposal) {
        return materialPackagingDisposalService.update(materialPackagingDisposal);
    }

    /**
     * 根据id查找
     * @param materialPackagingDisposal
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialPackagingDisposal materialPackagingDisposal) {
        return materialPackagingDisposalService.findById(materialPackagingDisposal.getmRealId());
    }

    /**
     * 删除
     * @param materialPackagingDisposal
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ApiResponse delete(@RequestBody MaterialPackagingDisposal materialPackagingDisposal) {
        return materialPackagingDisposalService.deleteByMRealId(materialPackagingDisposal.getmRealId());
    }

}
