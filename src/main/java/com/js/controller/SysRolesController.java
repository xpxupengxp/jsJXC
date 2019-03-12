package com.js.controller;

import com.alibaba.druid.util.StringUtils;
import com.js.entity.SysRolePermission;
import com.js.entity.SysRoles;
import com.js.service.SysRolesService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class SysRolesController {

    @Autowired
    private SysRolesService sysRolesService;


    /**
     * 添加
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增角色")
    public ApiResponse insert(@RequestBody SysRoles sysRoles) {
        return sysRolesService.insert(sysRoles);
    }

    /**
     * 修改
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @OperationLogger(actType="修改角色")
    public ApiResponse update(@RequestBody SysRoles sysRoles) {
        return sysRolesService.update(sysRoles);
    }



    /**
     * 删除
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @OperationLogger(actType="删除角色")
    public ApiResponse delete(@RequestBody SysRoles sysRoles) {
        return sysRolesService.delete(sysRoles.getIds());
    }


    /**
     * 通过主键查询
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysRoles sysRoles) {
        return ApiResponse.ok().setData(sysRolesService.findById(sysRoles.getId()));
    }


    /**
     * 分页查询
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody SysRoles sysRoles, PageUtil pageUtil) {
        if(sysRoles.getPage() != 0 && sysRoles.getRows() != 0){
            pageUtil.setPage(sysRoles.getPage());
            pageUtil.setRows(sysRoles.getRows());
        }
        if(!StringUtils.isEmpty(sysRoles.getOrderBy()) && !StringUtils.isEmpty(sysRoles.getOrder())){
            pageUtil.setOrderBy(sysRoles.getOrderBy());
            pageUtil.setOrder(sysRoles.getOrder());
        }
        return sysRolesService.findPageList(sysRoles,pageUtil);

    }


    /**
     * 不分页查询
     * @param sysRoles
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysRoles sysRoles) {
        return sysRolesService.findList(sysRoles);

    }


//    /**
//     * 启用/停用角色
//     * @param sysRoles
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody SysRoles sysRoles) {
//        sysRolsService.switchStatus(sysRoles);
//        return ApiResponse.ok();
//    }


    /**
     * 通过roleId设置权限
     * @param sysRolePermission
     * @return
     */
    @RequestMapping(value = "/setPerms",method = RequestMethod.POST)
    @OperationLogger(actType="设置角色权限")
    public ApiResponse setPerms(@RequestBody SysRolePermission sysRolePermission) {
        return ApiResponse.ok().setData(sysRolesService.setPerms(sysRolePermission));
    }

}
