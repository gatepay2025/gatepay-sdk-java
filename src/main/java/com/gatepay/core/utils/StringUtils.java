package com.gatepay.core.utils;

import java.util.List;

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

}
