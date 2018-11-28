<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
<div>
    <form action="/validate/user.do" th:object="${user}" method="post" enctype="multipart/form-data">
        用户名：<input name="username" type="text" /><br/>
        姓  名：<input name="allname" type="text" /><br/>
        密　码：<input name="password" type="password" /><br/>
        手机号：<input name="phone" type="text" /><br/>
        生  日：<input name="birthday" type="date" /><br/>
        <input type="file" name="picture" accept="image/png,image/jpeg,image/gif"/>
        <input type="submit" value="register"/>
    </form>

    <form action="/homepage/picture.do" method="post" enctype="multipart/form-data">
        <label>picture:</label>
        <input type="file" name="picture" accept="image/png,image/jpeg,image/gif"/>
        <input type="submit" value="图片注册"/>
    </form>
</div>
</body>
</html>
