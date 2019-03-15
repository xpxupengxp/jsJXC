package com.js.dao.warehouse;

import com.js.entity.warehouse.BillDisposalDetail;
import com.js.util.GenericDao;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface BillDisposalDetailMapper extends GenericDao<BillDisposalDetail> {
    //通过主键删除
    int delete(Integer detailId);

    //通过单据ID删除
    int deleteBySbId(Integer sbId);

    //通过单据ID数组批量删除
    int deleteBySbIds(Integer[] sbIds);

    //通过单据ID修改
    int updateBySbId(Integer sbId);

    //通过单据ID集合批量查询
    List<BillDisposalDetail> findBySbIds(@Param("sbIds")List<Integer> sbIds);
}