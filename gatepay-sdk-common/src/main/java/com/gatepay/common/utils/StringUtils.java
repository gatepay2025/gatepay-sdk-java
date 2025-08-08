/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.common.utils;

import java.util.List;


/**
 * @Description 字符串工具类
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class StringUtils {

    public static String joinStrSepByDoubleQuot(List<String> strList) {
        if (strList == null || strList.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder("\"");
        sb.append(String.join("\", \"", strList));
        sb.append("\"");
        return sb.toString();
    }

    public static boolean isStringInList(String str, List<String> strs) {
        if (strs == null) {
            return Boolean.FALSE;
        }
        return strs.contains(str);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

}
