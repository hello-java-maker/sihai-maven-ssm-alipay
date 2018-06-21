package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "";//在后台获取（必须配置）
	
	public static String merchant_private_key = "";//教程查看获取方式（必须配置）

	public static String alipay_public_key = "";//教程查看获取方式（必须配置）
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//注意：沙箱测试环境，正式环境为：https://openapi.alipay.com/gateway.do
}
