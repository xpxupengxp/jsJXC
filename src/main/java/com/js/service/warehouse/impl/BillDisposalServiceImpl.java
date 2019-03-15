package com.js.service.warehouse.impl;

import com.js.dao.warehouse.BillDisposalDetailMapper;
import com.js.dao.warehouse.BillDisposalMapper;
import com.js.entity.warehouse.BillDisposal;
import com.js.entity.warehouse.BillDisposalDetail;
import com.js.service.warehouse.BillDisposalService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillDisposalServiceImpl implements BillDisposalService {

    @Autowired
    private BillDisposalMapper billDisposalMapper;

    @Autowired
    private BillDisposalDetailMapper billDisposalDetailMapper;


    @Override
    public ApiResponse delete(Integer[] ids) {
        int i = 0;
        if(ids.length == 1) {
            //单删单据表数据
            i = billDisposalMapper.delete(ids[0]);
            //单删单据详细表数据
            billDisposalDetailMapper.deleteBySbId(ids[0]);
        }else if(ids.length > 1) {
            //批量删单据表数据
            i = billDisposalMapper.deleteByIds(ids);
            //批量删单据表数据
            billDisposalDetailMapper.deleteBySbIds(ids);
        }
        if(i > 0){
            return ApiResponse.ok().setMsg("删除成功！");
        }
        //405代表操作失败
        return ApiResponse.error(405).setMsg("删除失败！");
    }

    @Override
    public ApiResponse insert(BillDisposalDetail billDisposalDetail) {
//        Assert.isTrue(!StringUtils.isTrimEmpty(billDisposalDetail.getBillName()), "单据名称不能为空！");
//        Assert.isTrue(!StringUtils.isTrimEmpty(billDisposalDetail.getBillNo()), "单据号不能为空！");
//        Assert.isTrue(!StringUtils.isTrimEmpty(billDisposalDetail.getBillType()), "单据类型不能为空！");

//        //校验示例：
//        String jobName = companyJobInfoDetail.getJobName();
//        Assert.isTrue(!StringUtils.isTrimEmpty(jobName), "职位名称不能为空");
//        // 职位类别相关
//        Long jobCategoryId = companyJobInfoDetail.getJobCategoryId();
//        Assert.notNull(jobCategoryId, "职位类别末级节点id不能为空");
//        String jobCategoryIdPath = companyJobInfoDetail.getJobCategoryIdPath();
//        Assert.isTrue(!StringUtils.isTrimEmpty(jobCategoryIdPath), "职位类别路径不能为空");

        //添加单据表
        if(billDisposalMapper.insert(billDisposalDetail) > 0){
            //添加单据表成功后返回的主键
            billDisposalDetail.setSbId(billDisposalDetail.getId());
            //添加单据详细表
            billDisposalDetailMapper.insert(billDisposalDetail);
            return ApiResponse.ok().setMsg("添加成功！");
        }
        return ApiResponse.error(405).setMsg("添加失败！");
    }

    @Override
    public BillDisposal findById(Integer id) {
        return billDisposalMapper.findById(id);
    }

    @Override
    public ApiResponse findPageList(BillDisposal billDisposal, PageUtil pageUtil) {
        if(null != pageUtil){
            pageUtil.setTotalRows(billDisposalMapper.findPageListCount(billDisposal));
        }
        List<BillDisposal> pageList = billDisposalMapper.findPageList(billDisposal, pageUtil);
        return ApiResponse.ok().setData(pageList).setPage(pageUtil);
    }

    @Override
    public ApiResponse update(BillDisposalDetail billDisposalDetail) {
        //修改单据表
        if(billDisposalMapper.update(billDisposalDetail) > 0){
            //修改单据详细表
            billDisposalDetailMapper.updateBySbId(billDisposalDetail.getId());
            return ApiResponse.ok().setMsg("修改成功！");
        }
        return ApiResponse.error(405).setMsg("修改失败！");
    }
}
