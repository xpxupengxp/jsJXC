package com.js.controller;


import com.js.entity.SysEmployee;
import com.js.service.SysEmployeeService;
import com.js.util.ApiResponse;
import com.js.util.PageUtil;
import com.js.util.logSave.OperationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class SysEmployeeController {

    @Autowired
    private SysEmployeeService sysEmployeeService;


    /**
     * 添加
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @OperationLogger(actType="新增员工")
    public ApiResponse insert(@RequestBody SysEmployee sysEmployee) {
        return sysEmployeeService.insert(sysEmployee);
    }

    /**
     * 修改
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @OperationLogger(actType="修改员工")
    public ApiResponse update(@RequestBody SysEmployee sysEmployee) {
        return sysEmployeeService.update(sysEmployee);
    }



    /**
     * 删除
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @OperationLogger(actType="删除员工")
    public ApiResponse delete(@RequestBody SysEmployee sysEmployee) {
        return sysEmployeeService.delete(sysEmployee.getUserIds());
    }


    /**
     * 通过主键查询
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/findById",method = RequestMethod.POST)
    public ApiResponse findById(@RequestBody SysEmployee sysEmployee) {
        return ApiResponse.ok().setData(sysEmployeeService.findById(sysEmployee.getUserId()));
    }


    /**
     * 分页查询
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.POST)
    public ApiResponse pageList(@RequestBody SysEmployee sysEmployee, PageUtil pageUtil) {
        if(sysEmployee.getPage() != 0 && sysEmployee.getRows() != 0){
            pageUtil.setPage(sysEmployee.getPage());
            pageUtil.setRows(sysEmployee.getRows());
        }
        if(sysEmployee.getOrderBy() != null && sysEmployee.getOrderBy() != ""){
            pageUtil.setOrderBy(sysEmployee.getOrderBy());
            pageUtil.setOrder(sysEmployee.getOrder());
        }
        return sysEmployeeService.findPageList(sysEmployee,pageUtil);
    }


    /**
     * 不分页查询
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public ApiResponse list(@RequestBody SysEmployee sysEmployee) {
        return sysEmployeeService.findList(sysEmployee);
    }

//    /**
//     * 启用/停用员工
//     * @param sysEmployee
//     * @return
//     */
//    @RequestMapping(value = "/switchStatus",method = RequestMethod.POST)
//    public ApiResponse switchStatus(@RequestBody SysEmployee sysEmployee) {
//        sysEmployeeService.switchStatus(sysEmployee);
//        return ApiResponse.ok();
//    }

    /**
     * 生成账号
     * @param sysEmployee
     * @return
     */
    @RequestMapping(value = "/generateAccount",method = RequestMethod.POST)
    public ApiResponse generateAccount(@RequestBody SysEmployee sysEmployee) {
        Integer userId = sysEmployee.getUserId();
        Boolean accType = sysEmployee.getAccType();
        return sysEmployeeService.generateAccount(userId,accType);
    }

}
