package com.js.controller.material;

import com.js.entity.material.MaterialFactoryInformation;
import com.js.entity.material.MaterialQuality;
import com.js.service.material.MaterialQualityService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materialQuality")
public class MaterialQualityController {

    @Autowired
    private MaterialQualityService materialQualityService;

    /**
     * 新增
     * @param materialQuality
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody MaterialQuality materialQuality) {
        return materialQualityService.insert(materialQuality);
    }

    /**
     * 修改
     * @param materialQuality
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody MaterialQuality materialQuality) {
        return materialQualityService.update(materialQuality);
    }

    /**
     * 根据id查找
     * @param materialQuality
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialQuality materialQuality) {
        return materialQualityService.findById(materialQuality.getmRealId());
    }

    /**
     * 删除
     * @param materialQuality
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ApiResponse delete(@RequestBody MaterialQuality materialQuality) {
        return materialQualityService.deleteByMRealId(materialQuality.getmRealId());
    }

}
