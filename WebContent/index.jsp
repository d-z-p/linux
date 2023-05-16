<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生宿舍管理系统</title>
</head>
<body>
<h2 align = "center">学生宿舍管理系统</h2>
<p align ="center"><a href="add.jsp">添加宿舍信息</a></p>
<table align ="center" width = "50%" border = "1">
<tr><th>宿舍名</th><th>宿舍号</th><th>管理</th></tr>

<c:forEach var = "list" items="${tradeList}">
	<tr><th>${list.tradeName}</th><th>${list.tradePrice}</th><td>
	<!-- <a href = 'edit.jsp'>修改</a>&nbsp; -->
	<a href ="${ pageContext.request.contextPath }/ToUpdateTradeServlet?tradeId=${ list.tradeId}">修改</a>&nbsp;
	<a href ="${ pageContext.request.contextPath }/DeleteStuServlet?method=delete&pid=${ list.tradeId}">删除</a></td></tr>
</c:forEach> 

</table>
</body>
</html>