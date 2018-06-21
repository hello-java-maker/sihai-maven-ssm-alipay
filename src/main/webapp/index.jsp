<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:forward page="${base}/alipay/products.action"></jsp:forward>

<input type="hidden" id="hdnContextPath" name="hdnContextPath" value="<%=request.getContextPath() %>"/>