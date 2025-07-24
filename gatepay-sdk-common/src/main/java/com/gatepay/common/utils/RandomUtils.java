package com.gatepay.common.utils;

import java.security.SecureRandom;


/**
 * 随机数生成器
 *
 * @author ZJ-BE
 *
 */
public class RandomUtils {

    private static final String LETTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * 生成指定长度的随机字符串
     *
     * @param length 随机字符串的长度
     * @return 生成的随机字符串
     */
    public static String generateNonce(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = RANDOM.nextInt(LETTERS.length());
            sb.append(LETTERS.charAt(index));
        }

        return sb.toString();
    }

}
