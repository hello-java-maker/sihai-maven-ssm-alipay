<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>微信支付</title>
</head>
<body>

	<input type="text" id="qrCodeUrl" value="${qrCodeUrl }"/>
	
	<div id="code"></div> 
	
	<script src="<%=request.getContextPath() %>/static/js/jquery.min.js?v=1.0.1" type="text/javascript"></script>
	<script src="<%=request.getContextPath() %>/static/js/jquery-qrcode/jquery.qrcode.min.js?v=1.0.1" type="text/javascript"></script>
	
	<script type="text/javascript">
	
		$('#code').qrcode($("#qrCodeUrl").val());
		
		// 如果url中含有中文，使用本方法
		function toUtf8(str) {    
		    var out, i, len, c;    
		    out = "";    
		    len = str.length;    
		    for(i = 0; i < len; i++) {    
		        c = str.charCodeAt(i);    
		        if ((c >= 0x0001) && (c <= 0x007F)) {    
		            out += str.charAt(i);    
		        } else if (c > 0x07FF) {    
		            out += String.fromCharCode(0xE0 | ((c >> 12) & 0x0F));    
		            out += String.fromCharCode(0x80 | ((c >>  6) & 0x3F));    
		            out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));    
		        } else {    
		            out += String.fromCharCode(0xC0 | ((c >>  6) & 0x1F));    
		            out += String.fromCharCode(0x80 | ((c >>  0) & 0x3F));    
		        }    
		    }    
		    return out;    
		} 
// 		$('#code').qrcode(toUtf8("我还会回来的！"));
		
		// 查询是否支付成功 
		function checkPayResult() {
			$.get("/wxpay/wxPayIsSuccess.action", function(data) {
// 				debugger;
				console.log(data);
				if (data) {
					window.location.href = "/wxpay/paySuccess.action";
				}
			});
		}
		
		$(function() {
			// 每个3秒调用后台方法，查看订单是否已经支付成功
			window.setInterval("checkPayResult()", 3000);
		});
	</script>
</body>
</html>