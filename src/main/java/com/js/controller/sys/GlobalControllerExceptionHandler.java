package com.js.controller.sys;


import com.js.util.ResultUtil;
import com.js.util.exception.BizExceptionEnum;
import com.js.util.pojo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局的的异常拦截器（拦截所有的控制器）（带有@RequestMapping注解的方法上都会拦截）
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * 拦截运行时异常
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Result<Object> notFount(RuntimeException e) {
        log.error("运行时异常:", e);
        return new ResultUtil<Object>().setErrorMsg(getCode(e), e.getMessage());
    }

    private static Integer getCode(RuntimeException e) {
        if (e.getMessage().equals(BizExceptionEnum.LOGON_FAILURE.getMessage())) {
            return BizExceptionEnum.LOGON_FAILURE.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.LOGIN_ERROR.getMessage())) {
            return BizExceptionEnum.LOGIN_ERROR.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.REQUEST_NOT_EXIST.getMessage())) {
            return BizExceptionEnum.REQUEST_NOT_EXIST.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.FENCE_UPLOAD_ERROR.getMessage())) {
            return BizExceptionEnum.FENCE_UPLOAD_ERROR.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.DB_ERROR.getMessage())) {
            return BizExceptionEnum.DB_ERROR.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.INFO_LOAD_FAILURE.getMessage())) {
            return BizExceptionEnum.INFO_LOAD_FAILURE.getCode();
        } else if (e.getMessage().equals(BizExceptionEnum.DATA_NOT_EXIST.getMessage())) {
            return BizExceptionEnum.DATA_NOT_EXIST.getCode();
        }
        return BizExceptionEnum.SERVER_ERROR.getCode();
    }
}
