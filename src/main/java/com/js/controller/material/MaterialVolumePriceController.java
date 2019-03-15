package com.js.controller.material;

import com.js.entity.material.MaterialVolumePrice;
import com.js.service.material.MaterialVolumePriceService;
import com.js.util.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 物料量价controller
 */
@RestController
@RequestMapping("/materialVolumePrice")
public class MaterialVolumePriceController {

    @Autowired
    private MaterialVolumePriceService materialVolumePriceService;

    /**
     * 新增
     * @param materialVolumePrice
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody MaterialVolumePrice materialVolumePrice) {
        return materialVolumePriceService.insert(materialVolumePrice);
    }

    /**
     * 修改
     * @param materialVolumePrice
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody MaterialVolumePrice materialVolumePrice) {
        return materialVolumePriceService.update(materialVolumePrice);
    }

    /**
     * 根据id查找
     * @param materialVolumePrice
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialVolumePrice materialVolumePrice) {
        return materialVolumePriceService.findById(materialVolumePrice.getmRealId());
    }

    /**
     * 删除
     * @param materialVolumePrice
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ApiResponse delete(@RequestBody MaterialVolumePrice materialVolumePrice) {
        return materialVolumePriceService.deleteByMRealId(materialVolumePrice.getmRealId());
    }

}
