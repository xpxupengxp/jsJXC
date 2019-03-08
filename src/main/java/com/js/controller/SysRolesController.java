package com.js.controller;

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
    private SysRolesService sysRolsService;


    /**
     * 添加
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增角色")
    public ApiResponse insert(@RequestBody SysRoles sysRols) {
        return sysRolsService.insert(sysRols);
    }

    /**
     * 修改
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @OperationLogger(actType="修改角色")
    public ApiResponse update(@RequestBody SysRoles sysRols) {
        return sysRolsService.update(sysRols);
    }



    /**
     * 删除
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @OperationLogger(actType="删除角色")
    public ApiResponse delete(@RequestBody SysRoles sysRols) {
        return sysRolsService.delete(sysRols.getId());
    }


    /**
     * 通过主键查询
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysRoles sysRols) {
        return ApiResponse.ok().setData(sysRolsService.findById(sysRols.getId()));
    }


    /**
     * 分页查询
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody SysRoles sysRols, PageUtil pageUtil) {
        if(sysRols.getPage() != 0 && sysRols.getRows() != 0){
            pageUtil.setPage(sysRols.getPage());
            pageUtil.setRows(sysRols.getRows());
        }
        return sysRolsService.findPageList(sysRols,pageUtil);

    }


    /**
     * 不分页查询
     * @param sysRols
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysRoles sysRols) {
        return sysRolsService.findList(sysRols);

    }


//    /**
//     * 启用/停用角色
//     * @param sysRols
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody SysRoles sysRols) {
//        sysRolsService.switchStatus(sysRols);
//        return ApiResponse.ok();
//    }


    /**
     * 添加权限
     * @param sysRolePermission
     * @return
     */
    @RequestMapping(value = "/setPerms",method = RequestMethod.POST)
    @OperationLogger(actType="设置角色权限")
    public ApiResponse setPerms(@RequestBody SysRolePermission sysRolePermission) {
        return ApiResponse.ok().setData(sysRolsService.setPerms(sysRolePermission));
    }

}
