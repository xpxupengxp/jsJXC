package com.js.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 校验工具类
 */
public class CheckUtil {

    /**
     * 正则表达式：验证手机号
     */
    public static final String REGEX_TEL = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 为空校验
     * @param str
     * @return 返回true为空，false为非空
     */
    public static boolean isEmptyBatch(String str) {
        if(str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * 校验手机号
     * @param tel
     * @return 返回true为正确，false为不正确
     */
    public static boolean checkTel(String tel) {
        Pattern pattern = Pattern.compile(REGEX_TEL);
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();
    }

    /**
     * 校验邮箱
     * @param email
     * @return 返回true为正确，false为不正确
     */
    public static boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * 验证长度
     * @param str 验证内容
     * @param num 设置长度
     * @return 返回true为正确，false为不正确
     */
    public static boolean checkNumber(String str, Integer num) {
        if(str.length() <= num) {
            return true;
        }
        return false;
    }
}
