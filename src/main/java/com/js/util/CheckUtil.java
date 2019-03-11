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
    public static final String REGEX_MOBILE = "^1([38][0-9]|4[579]|5[0-3,5-9]|6[6]|7[0135678]|9[89])\\d{8}$";

    /**
     * 正则表达式：验证电话号
     */
    public static final String REGEX_TEL= "^(\\(\\d{3,4}\\)|\\d{3,4}-|\\s)?\\d{7,14}$";


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
     * @param mobile
     * @return 返回true为正确，false为不正确
     */
    public static boolean checkMobile(String mobile) {
        Pattern pattern = Pattern.compile(REGEX_MOBILE);
        Matcher matcher = pattern.matcher(mobile);
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
     * @param snum 设置最短长度
     * @param lnum 设置最大长度
     * @return 返回true为正确，false为不正确
     */
    public static boolean checkNumber(String str, Integer snum, Integer lnum) {
        if(str != null && str.length() >= snum && str.length() <= lnum) {
            return true;
        }
        return false;
    }
}
