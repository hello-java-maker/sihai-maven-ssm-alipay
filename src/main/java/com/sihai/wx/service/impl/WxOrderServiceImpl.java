package com.sihai.wx.service.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.sihai.utils.WeChatIDKEY;
import com.sihai.wx.config.WeChatConfig;
import com.sihai.wx.entity.PayResult;
import com.sihai.wx.entity.PreOrder;
import com.sihai.wx.entity.PreOrderResult;
import com.sihai.wx.service.WxOrderService;
import com.sihai.wx.util.HttpUtil;
import com.sihai.wx.util.Sign;
import com.sihai.wx.util.XmlUtil;

@Service
public class WxOrderServiceImpl implements WxOrderService {
	
	/**
	 * ==========================================
	 * 微信预付单：指的是在自己的平台需要和微信进行支付交易生成的一个微信订单，称之为“预付单”
	 * 订单：指的是自己的网站平台与用户之间交易生成的订单
	 * 
	 * 1. 用户购买产品 --> 生成网站订单
	 * 2. 用户支付 --> 网站在微信平台生成预付单
	 * 3. 最终实际根据预付单的信息进行支付
	 * ==========================================
	 */
	
	@Override
	public PreOrderResult placeOrder(String body, String out_trade_no, String total_fee) throws Exception {
		// 生成预付单对象
		PreOrder o = new PreOrder();
		// 生成随机字符串
		String nonce_str = UUID.randomUUID().toString().trim().replaceAll("-", "");
		o.setAppid(WeChatIDKEY.APPID);
		o.setBody(body);
		o.setMch_id(WeChatIDKEY.MCH_ID);
		o.setNotify_url(WeChatConfig.NOTIFY_URL);
		o.setOut_trade_no(out_trade_no);
		// 判断有没有输入订单总金额，没有输入默认1分钱
		if (total_fee != null && !total_fee.equals("")) {
			o.setTotal_fee(Integer.parseInt(total_fee));
		} else {
			o.setTotal_fee(1);
		}
		o.setNonce_str(nonce_str);
		o.setTrade_type(WeChatConfig.TRADE_TYPE);
		o.setSpbill_create_ip(WeChatConfig.SPBILL_CREATE_IP);
		SortedMap<Object, Object> p = new TreeMap<Object, Object>();
		p.put("appid", WeChatIDKEY.APPID);
		p.put("mch_id", WeChatIDKEY.MCH_ID);
		p.put("body", body);
		p.put("nonce_str", nonce_str);
		p.put("out_trade_no", out_trade_no);
		p.put("total_fee", total_fee);
		p.put("spbill_create_ip", WeChatConfig.SPBILL_CREATE_IP);
		p.put("notify_url", WeChatConfig.NOTIFY_URL);
		p.put("trade_type", WeChatConfig.TRADE_TYPE);
		// 获得签名
		String sign = Sign.createSign("utf-8", p, WeChatIDKEY.KEY);
		o.setSign(sign);
		// Object转换为XML
		String xml = XmlUtil.object2Xml(o, PreOrder.class);
		// 统一下单地址
		String url = WeChatConfig.PLACEANORDER_URL;
		// 调用微信统一下单地址
		String returnXml = HttpUtil.sendPost(url, xml);
		
		// XML转换为Object
		PreOrderResult preOrderResult = (PreOrderResult) XmlUtil.xml2Object(returnXml, PreOrderResult.class);
		
		return preOrderResult;
	}

	@Override
	public PayResult getWxPayResult(HttpServletRequest request) throws Exception {
		InputStream inStream = request.getInputStream();
		BufferedReader in = null;
		String result = "";
		in = new BufferedReader(
				new InputStreamReader(inStream));
		String line;
		while ((line = in.readLine()) != null) {
			result += line;
		}
		PayResult pr = (PayResult)XmlUtil.xml2Object(result, PayResult.class);
		System.out.println(pr.toString());
		return pr;
	}

}
