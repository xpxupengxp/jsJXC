package com.js.util;


import com.js.util.pojo.Result;

public class ResultUtil<T> {
    private Result<T> result;

    /**
     * 响应成功
     * @param t
     * @return
     */
    public Result<T> setData(T t) {
        result = new Result<>();
        result.setSuccess(true);
        result.setMessage("success");
        result.setResult(t);
        result.setCode(200);
        return result;
    }

    /**
     * 响应失败
     * @param code
     * @param message
     * @return
     */
    public Result<T> setErrorMsg(Integer code, String message) {
        result = new Result<>();
        result.setSuccess(false);
        result.setMessage(message);
        result.setCode(code);
        return result;
    }
}
