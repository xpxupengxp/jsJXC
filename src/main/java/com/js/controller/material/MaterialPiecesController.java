package com.js.controller.material;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.material.MaterialPieces;
import com.js.service.material.MaterialPiecesService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *物料笔数Controller
 */
@RestController
@RequestMapping("/materialPieces")
public class MaterialPiecesController {

    @Autowired
    private MaterialPiecesService materialPiecesService;

    /**
     * 新增
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public ApiResponse insert(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.insert(materialPieces);
    };

    /**
     * 修改
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public ApiResponse update(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.update(materialPieces);
    };

    /**
     * 根据id删除
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/deleteByMRealId",method = RequestMethod.POST)
    public ApiResponse deleteByMRealId(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.deleteByMRealId(materialPieces.getmRealId());
    };

    /**
     * 根据物料id删除所有笔数
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/deleteByMId",method = RequestMethod.POST)
    public ApiResponse deleteByMId(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.deleteByMId(materialPieces.getmId());
    };

    /**
     * 根据id查笔数
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody MaterialPieces materialPieces) {
        return ApiResponse.ok().setData(materialPiecesService.findById(materialPieces.getmRealId()));
    }

    /**
     * 根据物料id查所有笔数
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/findByMId",method = RequestMethod.POST)
    public ApiResponse findByMId(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.findByMId(materialPieces.getmId());
    }

    /**
     * 查询所有
     * @param materialPieces
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody MaterialPieces materialPieces) {
        return materialPiecesService.findList();
    }

    /**
     * 分页查询
     * @param materialList
     * @param pageUtil
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody MaterialPieces materialList, PageUtil pageUtil) {
        if(materialList.getPage() != 0 && materialList.getRows() != 0){
            pageUtil.setPage(materialList.getPage());
            pageUtil.setRows(materialList.getRows());
        }
        if(!StringUtils.isEmpty(materialList.getOrderBy()) && !StringUtils.isEmpty(materialList.getOrder())){
            pageUtil.setOrderBy(materialList.getOrderBy());
            pageUtil.setOrder(materialList.getOrder());
        }
        return materialPiecesService.findPageList(materialList,pageUtil);
    }

}
