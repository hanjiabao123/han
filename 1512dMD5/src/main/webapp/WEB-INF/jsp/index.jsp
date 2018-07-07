<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/addUser" method="post">
	<div>
		<label>用户名</label>
		<input type="text" id="uname" name="uname">
	</div>
	<div>
		<label>密码</label>
		<input type="password" id="pwd" name="pwd">
	</div>
	<input type="submit" value="注册">
</form>
</body>
</html>