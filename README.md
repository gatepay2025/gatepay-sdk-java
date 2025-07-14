# gatepay-sdk-java

GatePay API官方JAVA语言客户端代码库。

功能介绍
GatePay JAVA SDK适用于Java 17及以上版本。
在开始使用GatePay SDK之前需要提前去GatePay注册中心注册账号，申请secretKey密钥SDK信息请妥善保管，如果遗失可能会造成非法用户使用此信息操作您在的资源，给你造成数据和财产损失。

接口SDK。详见接口介绍
客户端core.Client，支持HTTP签名请求和应答。
下载和安装
1.下载地址:
https://github.com/gatepay2025/gatepay-sdk-java

2.您也可以使用以下命令获取安装包，代码会被下载到JAVA PATH环境变量中第一个路径src目录中。
git clone https://github.com/gatepay2025/gatepay-sdk-java

调用SDK
业务侧SDK的调用主要分为如下步骤：

设置secretKey

创建业务Client

设置业务请求参数

调用SDK API接口

处理得到响应

大致代码如下：
