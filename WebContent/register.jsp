<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
</head>
<body>
  <h2 align = "center">学生宿舍管理系统</h2>
  <h3 align = "center">注册页面</h3>
  <hr>
    <form align = "center" action="RegisterServlet" method="post">
        <table align = "center" border="0">
            <tr><td>用户名</td><td><input type="text" name="userName" ></td></tr>
            <tr><td>密码</td><td><input type="password" name="userPwd" ></td></tr>
            <tr><td>确认密码</td><td><input type="password" name="userRePwd" ></td></tr>
            <tr><td align = "center" colspan="2"><input type="submit" value = "注册" style="color:blue" ></td></tr>
        </table>
    
    </form>
</body>
</html>
