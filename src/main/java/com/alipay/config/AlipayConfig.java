package com.alipay.config;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016091800541030";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQCY3i6OXEi8CBXF1uwuEkfH9CbOe8bdoZVaboxt3kTRzzDichFtj4Lnj8Ydakcd9uwsg9gC6owQtfxX9sgqxXwklR2jtONSzHGVVxGt8yFukXv+ngHVcJOkYZ9vf45M1DbCx1r9W1PgqcEkuQDZGYSmNbfiqo1NUAjISnOLbU2Fz5/IhNPJp9z2+AACGznziafpeSiZa0AifaI1E4dUeNRMe8dXIxJjT980rKa4YwnSDts2bUk0aWoyyhUbG9m4O8emEax+LAL/kYFhlDboAO8eMMyFQzrIi8rNL103jpJP9MTXm627yCPA3F+2fpbrNmnozUPx5oUptmuSjLjL/2FnAgMBAAECggEAQXZ8F2i7mRIZSNSl5YDcjmsmpyvoWIbWr5hBuNcDP5nrhD126yUW2NT/8R7O/6z7LID1YyJQAuP8AStkQrS5We0leTKAWrfEOEDGCGjiuzfAEqRVgrKn9y/7F8NXC92g6b53X6HZhI8NcA1tqIq9/HNqoL2Krz4D1MnVOzL+jLtTrzPzLYkeu53Qg9FgwUbKcbEA+icg+n8fEy6ZigcE83hAbL8dn0eLYKRNGGgFVeDmAL/8/M8DVWYnJ5/9X/kmb8jHkEjbMPwWXoswaoKJuEHnZCJx1H6M2pVFK/BxMZW49UX+i43Vw+mD/YftzRuu3pFo/8sPfcVIFSfbaBwzOQKBgQD6nIJ4dDuhiiSHAdrroynbalbrSpSb4aoFHiCnC0T9ZP+cpFWGHAaYb0vCRDt5GfOGCzw8akjX+t+LI+n09Bm9/6pT1qo8XwzogoWxFQSOSEEZD1CWPm6Ib01n9yabG6OrLSZZuULo/T+HXNVEMMfUPUiM+oo99JC7xNP8cInVswKBgQCcJ6Sscshi0vTgA/b2XajWswqJBo6pRgjAV5jZAEmtTg52FtOL8kxKK/RpH0RiEAv5DVPJp+S/+BGvI3O04K3VNca82KaWLuelccFx5WJ7+XypXNixHm3rSjlrP2yr1OefDV/P0Dz99hbpj/tVSoXTr57hMEwl/0Il0ODWs3NTfQKBgQCuHeE0CSWJBW59cleEkbc6H7bGAOohJ3c12Qm8pULIfsxtK2vUIlKew+yxyzA64kHkppeyLfHwRPfdNxWMP7BG5oOTfjiGe09/l3eFYeHpbN/1pkNKL5QiLJpuGjPzXg+nlVXozqNjNthVlrUBjJa5qd5nPIahpvKL0qOp5xKMqwKBgQCWv5617EmPPeCwsqMjy99HBalSB0aKG9Yu+WHRe/mkmQpU7kxjehI0OKLHKSw3Dw6/7CHLN44Z1T4dObhmEdE/V574iJ6ptbZjfaImdi/RR1UVm1CGDL5Iu2sbIiui5vKEFcE9OebntT8BU8Jq4Hq5lX1oH9wjgn01TKUCIFNhcQKBgQDgG8OXIVQdF7N3inZqyjmRiKncHVFHtxjDIdqGhRSTG6Rp3fuPlJpTOLIdPi9JiGctBelrtUgSd5dmQMbWrf+hL/pOUlmlAm/Jzy2CyU5kwlxl6ETWoO8RDhJQi0IiLV3kIwftE1NUdXZFQGOGwyoU1eAyTF0qFfmRzdBhg1b3Jg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmN4ujlxIvAgVxdbsLhJHx/QmznvG3aGVWm6Mbd5E0c8w4nIRbY+C54/GHWpHHfbsLIPYAuqMELX8V/bIKsV8JJUdo7TjUsxxlVcRrfMhbpF7/p4B1XCTpGGfb3+OTNQ2wsda/VtT4KnBJLkA2RmEpjW34qqNTVAIyEpzi21Nhc+fyITTyafc9vgAAhs584mn6XkomWtAIn2iNROHVHjUTHvHVyMSY0/fNKymuGMJ0g7bNm1JNGlqMsoVGxvZuDvHphGsfiwC/5GBYZQ26ADvHjDMhUM6yIvKzS9dN46ST/TE15utu8gjwNxftn6W6zZp6M1D8eaFKbZrkoy4y/9hZwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:9099/return_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:9099/notify_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}