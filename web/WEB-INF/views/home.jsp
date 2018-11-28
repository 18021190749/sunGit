<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
<c:forEach items = "${message}" var="msg">
    <span><c:out value="${msg.title}"/></span>
    <span><c:out value="${msg.content}"/></span><br>
</c:forEach>
</div>
</body>
</html>
