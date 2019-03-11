package com.js.controller;

import com.js.entity.OldSysPermission;
import com.js.entity.SysUsers;
import com.js.service.OldSysPermissionService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/permission")
public class OldSysPermissionController {


    @Autowired
    private OldSysPermissionService oldSysPermissionService;


    /**
     * 添加
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="添加权限")
    public ApiResponse insert(@RequestBody OldSysPermission oldSysPermission) {
        return oldSysPermissionService.insert(oldSysPermission);
    }

    /**
     * 修改
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @OperationLogger(actType="修改权限")
    public ApiResponse update(@RequestBody OldSysPermission oldSysPermission) {
        return oldSysPermissionService.update(oldSysPermission);
    }



    /**
     * 删除
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @OperationLogger(actType="删除权限")
    public ApiResponse delete(@RequestBody OldSysPermission oldSysPermission) {
        return oldSysPermissionService.delete(oldSysPermission.getPermsIds());
    }


    /**
     * 通过主键查询
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody OldSysPermission oldSysPermission) {
        return ApiResponse.ok().setData(oldSysPermissionService.findById(oldSysPermission.getPermsId()));
    }


    /**
     * 分页查询
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody OldSysPermission oldSysPermission, PageUtil pageUtil) {
        if(oldSysPermission.getPage() != 0 && oldSysPermission.getRows() != 0){
            pageUtil.setPage(oldSysPermission.getPage());
            pageUtil.setRows(oldSysPermission.getRows());
        }
        return oldSysPermissionService.findPageList(oldSysPermission,pageUtil);

    }


    /**
     * 不分页查询
     * @param oldSysPermission
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody OldSysPermission oldSysPermission) {
        return oldSysPermissionService.findList(oldSysPermission);

    }


//    /**
//     * 启用/停用用户
//     * @param oldSysPermission
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody OldSysPermission oldSysPermission) {
//        oldSysPermissionService.switchStatus(oldSysPermission);
//        return ApiResponse.ok();
//    }
}
