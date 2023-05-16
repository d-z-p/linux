<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<body>
  <h2 align = "center">学生宿舍管理系统</h2>
  <h3 align = "center">登录页面</h3>
  <hr>
    <form align = "center" action="LoginServlet" method="post">
        <table align = "center" border="0">
            <tr><td>用户名</td><td><input type="text" name="userName" ></td></tr>
            <tr><td>密码</td><td><input type="password" name="userPwd" ></td></tr>
            <tr><td align = "center"><input type="submit" value = "登录" style="color:blue" ></td><td align = "right"><button><a href = "register.jsp" style="color:blue" >注册</a></button></td></tr>
        </table>
    
    </form>

</body>
</html>

