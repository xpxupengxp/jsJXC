package com.js.dao;

import com.js.entity.SysDataMaintain;
import com.js.util.GenericDao;

public interface SysDataMaintainMapper extends GenericDao<SysDataMaintain> {

    /**
     * 通过主键删除(物理删除)
     * @param id
     * @return
     */
    int delete(Long id);

    int deleteByIds(Long[] ids);
}