package com.js.controller;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.SysUserPermission;
import com.js.entity.SysUserRoles;
import com.js.entity.SysUsers;
import com.js.service.SysUsersService;
import com.js.util.ApiResponse;
import com.js.util.FileUtil;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/user")
public class SysUsersController {

    @Autowired
    private SysUsersService sysUsersService;


    /**
     * 添加
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增用户")
    public ApiResponse insert(@RequestBody SysUsers sysUsers) {
        return sysUsersService.insert(sysUsers);
    }

    /**
     * 修改
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改用户")
    public ApiResponse update(@RequestBody SysUsers sysUsers) {
        return sysUsersService.update(sysUsers);
    }



    /**
     * 删除
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除用户")
    public ApiResponse delete(@RequestBody SysUsers sysUsers) {
        return sysUsersService.delete(sysUsers.getIds());
    }


    /**
     * 通过主键查询
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysUsers sysUsers) {
        return ApiResponse.ok().setData(sysUsersService.findById(sysUsers.getId()));
    }


    /**
     * 分页查询
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody SysUsers sysUsers,PageUtil pageUtil) {
        if(sysUsers.getPage() != 0 && sysUsers.getRows() != 0){
            pageUtil.setPage(sysUsers.getPage());
            pageUtil.setRows(sysUsers.getRows());
        }
        if(!StringUtils.isEmpty(sysUsers.getOrderBy()) && !StringUtils.isEmpty(sysUsers.getOrder())){
            pageUtil.setOrderBy(sysUsers.getOrderBy());
            pageUtil.setOrder(sysUsers.getOrder());
        }
        return sysUsersService.findPageList(sysUsers,pageUtil);

    }


    /**
     * 不分页查询
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysUsers sysUsers) {
        return sysUsersService.findList(sysUsers);

    }


    /**
     * 通过id获取角色
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/getRolesById",method = RequestMethod.POST)
    public ApiResponse getRolesById(@RequestBody SysUsers sysUsers) {
        return ApiResponse.ok().setData(sysUsersService.getRolesById(sysUsers.getId()));
    }

    /**
     * 通过id获取权限
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/getPermsById",method = RequestMethod.POST)
    public ApiResponse getPermsById(@RequestBody SysUsers sysUsers) {
        return ApiResponse.ok().setData(sysUsersService.getPermsById(sysUsers.getId()));
    }


//    /**
//     * 启用/停用用户
//     * @param sysUsers
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody SysUsers sysUsers) {
//        sysUsersService.switchStatus(sysUsers);
//        return ApiResponse.ok();
//    }

    /**
     * 通过userId设置密码
     * @param sysUsers
     * @return
     */
    @RequestMapping(value = "/setPWD",method = RequestMethod.POST)
    @OperationLogger(actType="设置用户密码")
    public ApiResponse setPassword(@RequestBody SysUsers sysUsers) {
        return ApiResponse.ok().setData(sysUsersService.setPassword(sysUsers));
    }


    /**
     * 通过userId设置角色
     * @param sysUserRoles
     * @return
     */
    @RequestMapping(value = "/setRoles",method = RequestMethod.POST)
    @OperationLogger(actType="设置用户角色")
    public ApiResponse setRoles(@RequestBody SysUserRoles sysUserRoles) {
        return ApiResponse.ok().setData(sysUsersService.setRoles(sysUserRoles));
    }


    /**
     * 通过userId设置权限
     * @param sysUserPermission
     * @return
     */
    @RequestMapping(value = "/setPerms",method = RequestMethod.POST)
    @OperationLogger(actType="设置用户权限")
    public ApiResponse setPerms(@RequestBody SysUserPermission sysUserPermission) {
        return ApiResponse.ok().setData(sysUsersService.setPerms(sysUserPermission));
    }


    @RequestMapping("/list")
    public String list() {
        return "userList";
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(SysUsers sysUsers) {
        sysUsersService.insert(sysUsers);
        return "";
    }
}
