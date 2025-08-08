# gatepay-sdk-java

GatePay API官方JAVA语言客户端代码库。

# 功能介绍
1. GatePay JAVA SDK适用于Java 17及以上版本。
2. 在开始使用GatePay SDK之前需要提前去GatePay注册中心注册账号，申请secretKey，密钥信息请妥善保管，如果遗失可能会造成非法用户使用此信息操作您的资源，给您造成数据和财产损失。
3. 接口SDK
4. 客户端GatePayClient，支持通过HTTP签名发送请求和接收应答。

# 下载和使用

1. 下载地址:
https://github.com/gatepay2025/gatepay-sdk-java

2. 您也可以使用以下命令获取安装包，代码会被下载到您本地的目录中。
git clone https://github.com/gatepay2025/gatepay-sdk-java

# 调用SDK

**业务侧调用SDK主要分为如下步骤：**

1. 引用GatePay Java版本SDK

2. 创建GatePayConfig

3. 创建GatePayClient

4. 设置业务请求参数

5. 调用SDK API接口

6. 处理得到响应

大致代码如下：

```java
ChainsReq chainsReq = new ChainsReq();
chainsReq.setCurrency("USDT");
GatePayConfig gatePayConfig = new GatePayConfig(GatePayConstants.END_POINT_DEFAULT, 30, "client-id", new Credential("secret-key", "api-key");
GatePayClient gatePayClient = new GatePayClient(gatePayConfig);
gatePayClient.getAddressChains(chainsReq);
```