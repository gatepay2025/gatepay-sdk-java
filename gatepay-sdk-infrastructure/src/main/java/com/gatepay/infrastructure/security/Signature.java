/**
 * @Date 2025/07/25
 * @Copyright: All rights Reserved, Designed By GatePay
 */
package com.gatepay.infrastructure.security;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;


/**
 * @Description 签名工具类
 * @Author ZJ-BE
 * @Date 2025/07/25
 */
public class Signature {

    private static final String HMAC_SHA512 = "HmacSHA512";
    // private static final String HMAC_SHA256 = "HmacSHA256";
    public static final String INVALID_SIGNATURE = "invalid signature";


    /**
     * 生成签名
     * @param timestamp 时间戳
     * @param nonce     随机字符串
     * @param body      请求体
     * @param secretKey 密钥
     * @return 签名字符串
     */
    public static String verifySignature(String timestamp, String nonce, String body, String secretKey) {
        String payload = String.format("%s\n%s\n%s\n", timestamp, nonce, body);
        return sign(payload, secretKey);
    }

    /**
     * 对数据进行签名
     * @param signingData 要签名的数据
     * @param key         密钥
     * @return 签名字符串
     */
    public static String sign(String signingData, String key) {
        try {
            Mac hmac = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), HMAC_SHA512);
            hmac.init(secretKeySpec);
            byte[] signature = hmac.doFinal(signingData.getBytes(StandardCharsets.UTF_8));
            return byteArrayToHexString(signature);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException("Error generating signature", e);
        }
    }

    /**
     * 将十六进制字符串转换为字节数组
     * @param hexString 十六进制字符串
     * @return 字节数组
     */
    private static byte[] hexStringToByteArray(String hexString) {
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }

    /**
     * 将字节数组转换为十六进制字符串
     * @param bytes 字节数组
     * @return 十六进制字符串
     */
    private static String byteArrayToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b & 0xff));
        }
        return sb.toString();
    }

    /**
     * 常量时间比较两个字节数组是否相等，防止时间侧信道攻击
     * @param a 第一个字节数组
     * @param b 第二个字节数组
     * @return 如果两个字节数组相等返回true，否则返回false
     */
    private static boolean constantTimeEquals(byte[] a, byte[] b) {
        if (a.length != b.length) {
            return false;
        }

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result |= a[i] ^ b[i];
        }
        return result == 0;
    }


    /**
     * 验证签名是否有效
     * @param signingData 签名数据
     * @param signature   签名
     * @param key         密钥
     * @return 如果签名有效返回null，否则返回错误信息
     */
    public static String verify(String signingData, String signature, String key) {
        try {
            byte[] decodedSignature = hexStringToByteArray(signature);

            Mac hmac = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), HMAC_SHA512);
            hmac.init(secretKeySpec);
            byte[] calculatedSignature = hmac.doFinal(signingData.getBytes(StandardCharsets.UTF_8));

            if (!constantTimeEquals(decodedSignature, calculatedSignature)) {
                return INVALID_SIGNATURE;
            }

            return null;
        } catch (Exception e) {
            return INVALID_SIGNATURE;
        }
    }

    /**
     * 生成签名
     * @param timestamp
     * @param nonce
     * @param body
     * @param secretKey
     * @return
     */
    public static String generateSignature(String timestamp, String nonce, String body, String secretKey) {
        try {
            // Concatenate timestamp, nonce and body
            String message = timestamp + nonce + body;

            // Create HMAC-SHA instance
            Mac hmacSha512 = Mac.getInstance(HMAC_SHA512);
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), HMAC_SHA512);
            hmacSha512.init(secretKeySpec);

            // Calculate signature
            byte[] hash = hmacSha512.doFinal(message.getBytes(StandardCharsets.UTF_8));

            // Encode with Base64
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new RuntimeException("Failed to generate signature", e);
        }
    }

}
