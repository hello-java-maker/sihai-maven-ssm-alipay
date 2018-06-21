<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<script src="<%=request.getContextPath() %>/static/js/jquery.min.js" type="text/javascript"></script>

<html>

    <head>
        
    </head>
    
    <body>
        
    <form action="<%=request.getContextPath() %>/alipay/createOrder.action" method="post">
    	<input type="hidden" id="productId" name="productId" value="${p.id }" />
        <table>
        	<tr>
        		<td>
        			产品编号: ${p.id }
        		</td>
        	</tr>
        		<td>
        			产品名称: ${p.name }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			产品价格: ${p.price }
        		</td>
        	<tr>
        	</tr>
        		<td>
        			购买个数： <input id="buyCounts" name="buyCounts"/>
        		</td>
        	</tr>
        	</tr>
        		<td>
        			<input type="submit" value="form提交，生成订单" />
        			&nbsp;&nbsp;&nbsp;&nbsp;
        			<input type="button" value="ajax提交，生成订单" onclick="createOrder()" />
        		</td>
        	</tr>
        </table>
    </form>
    
    
        <input type="hidden" id="hdnContextPath" name="hdnContextPath" value="<%=request.getContextPath() %>"/>
    </body>
    
</html>

<script type="text/javascript">

		
	var hdnContextPath = $("#hdnContextPath").val();
	
	function createOrder() {
		$.ajax({
	    	url: hdnContextPath + "/alipay/createOrder.action",
	    	type: "POST",
	    	data: {"productId": $("#productId").val(), "buyCounts": $("#buyCounts").val()},
	    	dataType: "json",
	    	success: function(data) {
	            if(data.status == 200 && data.msg == "OK") {
	            	debugger;
	            	// 提交订单成功后, 进入购买页面
	            	window.location.href = hdnContextPath + "/alipay/goPay.action?orderId=" + data.data;
	            } else {
	            	alert(data.msg);
	            	console.log(JSON.stringify(data));
	            }
	    	}
	    });
	}

</script>

