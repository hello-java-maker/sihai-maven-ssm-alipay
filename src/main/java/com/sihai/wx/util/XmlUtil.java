package com.sihai.wx.util;

import java.io.InputStream;

import com.sihai.wx.entity.PayResult;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XmlUtil {
//	private static XStream xstream;
//	static {
//		xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
//	}

	/**
	 * 
	 * @Description: xml字符串转换为对象
	 * @param inputXml
	 * @param type
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年8月31日 下午4:52:13
	 */
	public static Object xml2Object(String inputXml, Class<?> type) throws Exception {
		if (null == inputXml || "".equals(inputXml)) {
			return null;
		}
		XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xstream.alias("xml", type);
		return xstream.fromXML(inputXml);
	}
	
	/**
	 * 
	 * @Description: 从inputStream中读取对象
	 * @param inputStream
	 * @param type
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年8月31日 下午4:52:29
	 */
	public static Object xml2Object(InputStream inputStream, Class<?> type) throws Exception {
		if (null == inputStream) {
			return null;
		}
		XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xstream.alias("xml", type);
		return xstream.fromXML(inputStream, type);
	}

	/**
	 * 
	 * @Description: 对象转换为xml字符串
	 * @param ro
	 * @param types
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2017年8月31日 下午4:52:45
	 */
	public static String object2Xml(Object ro, Class<?> types) throws Exception {
		if (null == ro) {
			return null;
		}
		XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));
		xstream.alias("xml", types);
		return xstream.toXML(ro);
	}
	
	public static void main(String[] args) throws Exception {
//		String xml = "<xml><appid><![CDATA[wx27ba4edf360825f0]]></appid>\r\n" + 
//				"<bank_type><![CDATA[CFT]]></bank_type>\r\n" + 
//				"<cash_fee><![CDATA[1]]></cash_fee>\r\n" + 
//				"<fee_type><![CDATA[CNY]]></fee_type>\r\n" + 
//				"<is_subscribe><![CDATA[Y]]></is_subscribe>\r\n" + 
//				"<mch_id><![CDATA[1488079552]]></mch_id>\r\n" + 
//				"<nonce_str><![CDATA[bedd615ea8bf403c9878a47619a37db2]]></nonce_str>\r\n" + 
//				"<openid><![CDATA[obzI8wbPdqk46snp2u-Vbr4mtIy4]]></openid>\r\n" + 
//				"<out_trade_no><![CDATA[170831BN11MFTKGC]]></out_trade_no>\r\n" + 
//				"<result_code><![CDATA[SUCCESS]]></result_code>\r\n" + 
//				"<return_code><![CDATA[SUCCESS]]></return_code>\r\n" + 
//				"<sign><![CDATA[A5391D28AB0A7AAD2A04CA025ECFC9F8]]></sign>\r\n" + 
//				"<time_end><![CDATA[20170831162215]]></time_end>\r\n" + 
//				"<total_fee>1</total_fee>\r\n" + 
//				"<trade_type><![CDATA[NATIVE]]></trade_type>\r\n" + 
//				"<transaction_id><![CDATA[4009492001201708319326473865]]></transaction_id>\r\n" + 
//				"</xml>";
//
//		xml = "<xml><appid><![CDATA[wx27ba4edf360825f0]]></appid><bank_type><![CDATA[CCB_DEBIT]]></bank_type><cash_fee><![CDATA[2]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1488079552]]></mch_id><nonce_str><![CDATA[b137e6dc58ca41f9a03ececef3737dd9]]></nonce_str><openid><![CDATA[obzI8wbPdqk46snp2u-Vbr4mtIy4]]></openid><out_trade_no><![CDATA[170831BXB06KDWX4]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[8556332D8BA236995B9F001A29F3527B]]></sign><time_end><![CDATA[20170831164115]]></time_end><total_fee>2</total_fee><trade_type><![CDATA[NATIVE]]></trade_type><transaction_id><![CDATA[4009492001201708319321871970]]></transaction_id></xml>";
		
		String xml = "<xml><appid><![CDATA[wx27ba4edf360825f0]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1488079552]]></mch_id><nonce_str><![CDATA[6c13599fcd4543f1a6e89ca039d413bd]]></nonce_str><openid><![CDATA[obzI8wbPdqk46snp2u-Vbr4mtIy4]]></openid><out_trade_no><![CDATA[170831CC85T0204H]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[75E1E8C59A0D9E518F35F9B68ECAA4EF]]></sign><time_end><![CDATA[20170831172556]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[NATIVE]]></trade_type><transaction_id><![CDATA[4009492001201708319329835501]]></transaction_id></xml>";
		PayResult pr = (PayResult)XmlUtil.xml2Object(xml, PayResult.class);
		System.out.println(pr.toString());
	}
	
}
