### 目录
- 1、支付宝沙箱环境测试demo
- 2、支付宝整合到ssm环境
- 3、微信支付整合到ssm环境


### 一、支付宝测试环境代码测试

#### 1.下载电脑网站的官方demo：

下载地址：https://docs.open.alipay.com/270/106291/

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154517076-1543882391.png)

#### 2.下载解压导入eclipse

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154518748-1355167243.png)

readme.txt请好好看一下。

只有一个Java配置类，其余都是JSP。

#### 3.配置AlipayConfig

(1).注册蚂蚁金服开发者账号（免费，不像苹果会收取费用）

注册地址：https://open.alipay.com ，用你的支付宝账号扫码登录，完善个人信息，选择服务类型（我选的是自研）。

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154521091-559671439.png)

(2).设置app_id和gatewayUrl

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154523420-1165043884.png)

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154525998-1945276837.png)

其中密钥需要自己生成，appID和支付宝网关是已经给好的，网关有dev字样，表明是用于开发测试。

(3).设置密钥

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154527795-74942620.png)

点击“生成方法”，打开界面如下：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154529482-463775295.png)

下周密钥生成工具，解压打开后，选择2048位生成密钥：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104155721716-114991997.png)

如果没有设置过，此时显示文本是“设置应用公钥”，我这里是已经设置过得。

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154532888-1699829873.png)

设置方法,“打开密钥文件路径”：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104155723091-1059236432.png)

![image](https://images2017.cnblogs.com/blog/913181/201711/913181-20171104154536326-1505768047.png)

复制应用公钥2048.txt中的内容到点击“设置应用公钥”的弹出框中，保存：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104155724529-560291030.png)

- 商户私钥（merchant_private_key）

     复制 应用私钥2048.txt 中的内容到merchant_private_key中。

- 支付宝公钥（alipay_public_key）

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154537920-690623311.png)

   点击如上图链接，复制弹出框里面的内容到alipay_public_key。

   如果这个设置不对，结果是：支付成功，但是验签失败。

  如果是正式环境，需要上传到对应的应用中：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154539248-1117011503.png)

(4).服务器异步通知页面路径（notify_url）

如果没有改名，修改IP和端口号就可以了，我自己的如下:

```
http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp
```

(5).页面跳转同步通知页面路径（return_url）

```
http://localhost:8080/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp
```

#### 4.测试运行

![image](https://img-blog.csdn.net/20180620154857896?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

![image](https://img-blog.csdn.net/20180620154907328?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



测试用的支付宝买家账户可以在“沙箱账号”这个页面可以找到：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154546045-990881709.png)

支付成功后，验签结果：

![image](http://images2017.cnblogs.com/blog/913181/201711/913181-20171104154547279-197713081.png)


#### 问题解决
由于我们使用的是沙箱测试环境，测试环境和正式上线的环境的**网关**是不一样的，如果配置错误，会出现，appid错误的问题。配置如下：
![这里写图片描述](https://img-blog.csdn.net/20180620170947435?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)





### 二、将支付宝支付整合到ssm框架

#### 1、项目架构
![这里写图片描述](https://img-blog.csdn.net/20180620155335825?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

- 项目架构：spring+springmvc+mybatis
- 数据库：mysql
- 部署环境：tomcat9.0
- 开发环境：jdk9、idea
- 支付：支付宝、微信


整合到ssm一样，我们需要像沙箱测试环境一样，需要修改**支付的配置信息**
![这里写图片描述](https://img-blog.csdn.net/20180620170214281?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

#### 2、数据库代码

主要包括以下的数据库表：

- user：用户表
- order：支付产生的订单
- flow：流水账
- product：商品表：用于模拟购买商品。
```
drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   varchar(20) not null,
   username             varchar(128),
   sex                  varchar(20),
   primary key (id)
);

alter table user comment '用户表';


CREATE TABLE `flow` (
  `id` varchar(20) NOT NULL,
  `flow_num` varchar(20) DEFAULT NULL COMMENT '流水号',
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品主键ID',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '支付金额',
  `paid_method` int(11) DEFAULT NULL COMMENT '支付方式\r\n            1：支付宝\r\n            2：微信',
  `buy_counts` int(11) DEFAULT NULL COMMENT '购买个数',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='流水表';


CREATE TABLE `orders` (
  `id` varchar(20) NOT NULL,
  `order_num` varchar(20) DEFAULT NULL COMMENT '订单号',
  `order_status` varchar(20) DEFAULT NULL COMMENT '订单状态\r\n            10：待付款\r\n            20：已付款',
  `order_amount` varchar(11) DEFAULT NULL COMMENT '订单金额',
  `paid_amount` varchar(11) DEFAULT NULL COMMENT '实际支付金额',
  `product_id` varchar(20) DEFAULT NULL COMMENT '产品表外键ID',
  `buy_counts` int(11) DEFAULT NULL COMMENT '产品购买的个数',
  `create_time` datetime DEFAULT NULL COMMENT '订单创建时间',
  `paid_time` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单表';


CREATE TABLE `product` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL COMMENT '产品名称',
  `price` varchar(11) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='产品表 ';


```

#### 3、dao数据接口层

这里就不介绍了，这个只包括简单的curd，可以使用`通用mapper`，或者`逆向工程`就行。

以订单order为例给出：

```

public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String id);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}
```

**注意：**源代码最后给出。

#### 4、service层

同上，最后在项目源代码里可见。

以订单order为例给出：

```


/**
 * 订单操作 service
 * @author ibm
 *
 */
public interface OrdersService {

	/**
	 * 新增订单
	 * @param order
	 */
	public void saveOrder(Orders order);
	
	/**
	 * 
	 * @Title: OrdersService.java
	 * @Package com.sihai.service
	 * @Description: 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
	 * Copyright: Copyright (c) 2017
	 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 * 
	 * @author sihai
	 * @date 2017年8月23日 下午9:04:35
	 * @version V1.0
	 */
	public void updateOrderStatus(String orderId, String alpayFlowNum, String paidAmount);
	
	/**
	 * 获取订单
	 * @param orderId
	 * @return
	 */
	public Orders getOrderById(String orderId);
	
}

```

#### 4、支付宝支付controller（支付流程）

**支付流程图**
![这里写图片描述](https://img-blog.csdn.net/20180620165147752?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

首先，启动项目后，输入http://localhost:8080/,会进入到商品页面，如下：
![这里写图片描述](https://img-blog.csdn.net/20180620160715724?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

下面是页面代码

**商品页面（products.jsp）**
![这里写图片描述](https://img-blog.csdn.net/20180620160814279?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

```
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<script src="<%=request.getContextPath() %>/static/js/jquery.min.js" type="text/javascript"></script>

<html>

    <head>
        
    </head>
    
    <body>
        
        <table>
        	<tr>
        		<td>
        			产品编号
        		</td>
        		<td>
        			产品名称
        		</td>
        		<td>
        			产品价格
        		</td>
        		<td>
        			操作
        		</td>
        	</tr>
	        <c:forEach items="${pList }" var="p">
	        	<tr>
	        		<td>
	        			${p.id }
	        		</td>
	        		<td>
	        			${p.name }
	        		</td>
	        		<td>
	        			${p.price }
	        		</td>
	        		<td>
	        			<a href="<%=request.getContextPath() %>/alipay/goConfirm.action?productId=${p.id }">购买</a>
	        		</td>
	        	</tr>
	        	
	        </c:forEach>
        </table>
        
        <input type="hidden" id="hdnContextPath" name="hdnContextPath" value="<%=request.getContextPath() %>"/>
    </body>
    
</html>


<script type="text/javascript">

	$(document).ready(function() {
		
		var hdnContextPath = $("#hdnContextPath").val();
		
		
	});
	

</script>


```

点击上面的**购买**，进入到**订单页面**

![这里写图片描述](https://img-blog.csdn.net/20180620161120463?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)


填写**个数**，然后点击**生成订单**，调用如下代码

![这里写图片描述](https://img-blog.csdn.net/20180620161348895?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
根据`SID`（生成id的工具）等信息生成订单，保存到数据库。

进入到**选择支付页面**

![这里写图片描述](https://img-blog.csdn.net/20180620161452619?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

调用了如下代码：

![这里写图片描述](https://img-blog.csdn.net/20180620161534326?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)


然后，我们选择**支付宝支付**，进入到了我们支付的页面了，大功告成！
![这里写图片描述](https://img-blog.csdn.net/201806201616503?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3NpaGFpMTIzNDU=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

调用了如下代码：

```
/**
	 *
	 * @Title: AlipayController.java
	 * @Package com.sihai.controller
	 * @Description: 前往支付宝第三方网关进行支付
	 * Copyright: Copyright (c) 2017
	 * Company:FURUIBOKE.SCIENCE.AND.TECHNOLOGY
	 *
	 * @author sihai
	 * @date 2017年8月23日 下午8:50:43
	 * @version V1.0
	 */
	@RequestMapping(value = "/goAlipay", produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String goAlipay(String orderId, HttpServletRequest request, HttpServletRequest response) throws Exception {

		Orders order = orderService.getOrderById(orderId);

		Product product = productService.getProductById(order.getProductId());

		//获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

		//设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

		//商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = orderId;
		//付款金额，必填
		String total_amount = order.getOrderAmount();
		//订单名称，必填
		String subject = product.getName();
		//商品描述，可空
		String body = "用户订购商品个数：" + order.getBuyCounts();

		// 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
    	String timeout_express = "1c";

		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
				+ "\"total_amount\":\""+ total_amount +"\","
				+ "\"subject\":\""+ subject +"\","
				+ "\"body\":\""+ body +"\","
				+ "\"timeout_express\":\""+ timeout_express +"\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

		//请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();

		return result;
	}
```

这段代码都可以在阿里支付的demo里面找到的，只需要复制过来，然后改改，整合到ssm环境即可。


上面就是将阿里支付宝支付整合到ssm的全过程了，如果还有什么疑问，可以留言或者私信我！





