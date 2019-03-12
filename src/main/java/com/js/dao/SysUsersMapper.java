package com.js.dao;

import com.js.entity.SysRoles;
import com.js.entity.SysUsers;
import com.js.util.GenericDao;

import java.util.List;

public interface SysUsersMapper extends GenericDao<SysUsers> {

    //通过主键删除(物理删除)
    int delete(Integer id);

    //通过id获取角色
    List<SysRoles> getRolesById(Integer id);

    //通过id获取权限
    List<SysRoles> getPermsById(Integer id);

    //通过userId设置密码
    int setPassword(SysUsers sysUsers);

    //通过用户名查询
    SysUsers findByNickName(String nickName);
}