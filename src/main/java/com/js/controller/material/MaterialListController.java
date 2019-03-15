package com.js.controller.material;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.material.MaterialList;
import com.js.service.material.MaterialListService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 物料清单Controller
 */
@RestController
@RequestMapping("/materialList")
public class MaterialListController {

    @Autowired
    private MaterialListService materialListService;

    /**
     * 新增
     * @param list
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody List<MaterialList> list) {
        return materialListService.insert(list);
    }

    /**
     * 删除
     * @param materialList
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public ApiResponse delete(@RequestBody MaterialList materialList) {
        return materialListService.delete(materialList.getIds());
    }

    /**
     * 修改
     * @param list
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody List<MaterialList> list) {
        return materialListService.update(list);
    }

    /**
     * 根据id查询
     * @param materialList
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialList materialList) {
        return ApiResponse.ok().setData(materialListService.findById(materialList.getmId()));
    }

    /**
     * 分页查询
     * @param materialList
     * @param pageUtil
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody MaterialList materialList, PageUtil pageUtil) {
        if(materialList.getPage() != 0 && materialList.getRows() != 0){
            pageUtil.setPage(materialList.getPage());
            pageUtil.setRows(materialList.getRows());
        }
        if(!StringUtils.isEmpty(materialList.getOrderBy()) && !StringUtils.isEmpty(materialList.getOrder())){
            pageUtil.setOrderBy(materialList.getOrderBy());
            pageUtil.setOrder(materialList.getOrder());
        }
        return materialListService.findPageList(materialList,pageUtil);
    }

    /**
     * 查询所有
     * @param materialList
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody MaterialList materialList) {
        return materialListService.findList();
    }

}
