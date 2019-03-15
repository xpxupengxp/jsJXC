package com.js.controller.material;

import com.js.entity.material.MaterialFactoryInformation;
import com.js.service.material.MaterialFactoryInformationService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 物料出厂信息controller
 */
@RestController
@RequestMapping("/materialFactoryInformation")
public class MaterialFactoryInformationController {

    @Autowired
    private MaterialFactoryInformationService materialFactoryInformationService;

    /**
     * 新增
     * @param materialFactoryInformation
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody MaterialFactoryInformation materialFactoryInformation) {
        return materialFactoryInformationService.insert(materialFactoryInformation);
    }

    /**
     * 修改
     * @param materialFactoryInformation
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody MaterialFactoryInformation materialFactoryInformation) {
        return materialFactoryInformationService.update(materialFactoryInformation);
    }

    /**
     * 根据id查找
     * @param materialFactoryInformation
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialFactoryInformation materialFactoryInformation) {
        return materialFactoryInformationService.findById(materialFactoryInformation.getmRealId());
    }

    /**
     * 删除
     * @param materialFactoryInformation
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ApiResponse delete(@RequestBody MaterialFactoryInformation materialFactoryInformation) {
        return materialFactoryInformationService.deleteByMRealId(materialFactoryInformation.getmRealId());
    }

}
