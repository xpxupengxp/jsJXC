package com.js.util;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<S> {
    <T extends S> List<T> findPageList(@Param("param") T var1, @Param("start") int var2, @Param("pageSize") int var3);

    <T extends S> List<T> findPageList(@Param("param") T var1, @Param("page") PageUtil var2);

    <T extends S> int findPageListCount(@Param("param") T var1);

    S findById(Serializable var1);

    int insert(S var1);

    int update(S var1);

    <T extends S> List<T> findList(T var1);

    int deleteByIds(Integer[] ids);
}
