package com.js.service.material.impl;

import com.js.dao.material.MaterialListMapper;
import com.js.entity.material.MaterialList;
import com.js.service.material.MaterialListService;
import com.js.service.material.MaterialPiecesService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 物料清单ServiceImpl
 */
@Service
public class MaterialListServiceImpl implements MaterialListService {

    @Autowired
    private MaterialListMapper materialListMapper;
    @Autowired
    private MaterialPiecesService materialPiecesService;

    @Override
    public ApiResponse insert(List<MaterialList> list) {
        List<MaterialList> newList = new ArrayList<>();
        BigDecimal bigDecimal = new BigDecimal(0);
        for (MaterialList materialList:list) {
            materialList.setmTotal(bigDecimal);
            newList.add(materialList);
        }
        int i = materialListMapper.insertList(newList);
        if(i > 0) {
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public ApiResponse delete(Long[] ids) {
        if(materialListMapper.deleteList(ids) > 0) {
            for (int j=0;j < ids.length;j++) {
                materialPiecesService.deleteByMId(ids[j]);
            }
            return ApiResponse.ok().setMsg("删除成功！");
        }
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse update(List<MaterialList> list) {
        int i = materialListMapper.updateList(list);
        if(i > 0) {
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }

    @Override
    public MaterialList findById(Long id) {
        return materialListMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(MaterialList materialList, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(materialListMapper.findPageListCount(materialList));
        }
        List<MaterialList> pageList = materialListMapper.findPageList(materialList, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse findList() {
        List<MaterialList> list = materialListMapper.findList(null);
        return ApiResponse.ok().setData(list);
    }

    /**
     * @param mId 物料id
     * @param num 添加/修改/删除的数值
     * @param type 类型 1."add" 2."del"
     * @return
     */
    @Override
    public synchronized BigDecimal mTotalStatistics(Long mId, BigDecimal num, String type) {
        MaterialList materialList = findById(mId);
        if(materialList == null) {
            return null;
        }
        BigDecimal oldNum = materialList.getmTotal();
        BigDecimal newNum = new BigDecimal(0);
        if (type.equals("add")) {
            newNum = oldNum.add(num);
        }else if (type.equals("del")) {
            newNum = oldNum.subtract(num);
        }
        if(materialListMapper.mTotalStatistics(newNum,mId) > 0) {
            return newNum;
        }
        return null;
    }
}
