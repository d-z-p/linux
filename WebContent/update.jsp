<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改页面</title>
</head>
<body>
<h2 align = "center">学生宿舍管理系统</h2>
<h2 align = "center">修改页面</h2>
    <form action="UpdateTradeServlet" method = "post" align = "center">
        <table align = "center">
            <tr>
                <td>宿舍名</td><td>
                <input type = "hidden" name = "tradeid" value="${trade.tradeId }"/>	
                <input type = "text" name = "tradeName" value = "${trade.tradeName }" ></td>
            </tr>
            <tr>
                <td>宿舍号</td><td><input type = "text" name = "tradePrice" value  = "${trade.tradePrice}"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value = "修改" style="color:blue" ></td>
            </tr>
        </table>
    </form>
</body>
</html>
