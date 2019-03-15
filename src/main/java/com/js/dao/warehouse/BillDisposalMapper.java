package com.js.dao.warehouse;

import com.js.entity.warehouse.BillDisposal;
import com.js.util.GenericDao;

public interface BillDisposalMapper extends GenericDao<BillDisposal> {
    int delete(Integer id);

}