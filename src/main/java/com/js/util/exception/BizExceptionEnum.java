package com.js.util.exception;


import java.io.Serializable;

/**
 * 所有业务异常的枚举
 */
public enum BizExceptionEnum implements Serializable, ServiceExceptionEnum {

    /**
     * 业务
     */
    LOGIN_ERROR(400, "账号或密码错误"),
    LOGON_FAILURE(401, "登录失效"),
    DATA_NOT_EXIST(402, "暂无数据"),
    INFO_LOAD_FAILURE(403, "信息加载失败"),
    FENCE_UPLOAD_ERROR(404, "围栏上传失败"),

    /**
     * 数据库问题
     */
    DB_ERROR(600, "数据库系统错误"),

    /**
     * 为空
     */
    IS_NULL(600,"没有该数据"),

    /**
     * 请求问题
     */
    SERVER_ERROR(500, "服务器异常"),
    REQUEST_NOT_EXIST(501, "请求不存在");


    BizExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
