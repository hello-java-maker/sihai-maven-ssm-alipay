<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  

<html>

<head>
</head>
    
<body>
        
	用户列表：<br/>
	
	<c:forEach items="${userList}" var="u" >
		${u.id }&nbsp;&nbsp;&nbsp;&nbsp;${u.username }&nbsp;&nbsp;&nbsp;&nbsp;${u.sex }<br/>	
	
	</c:forEach>
        
</body>
    
</html>