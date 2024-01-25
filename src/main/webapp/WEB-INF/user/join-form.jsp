<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    LocalDateTime now = LocalDateTime.now();
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>회원가입 페이지 <%=now%></h1>

    <hr>
    <form action="/join.do" method="post">
        <input type="text" placeholder="username" name="username">
        <input type="text" placeholder="password" name="password">
        <input type="text" placeholder="email" name="email">
        <button>회원가입</button>
    </form>
</body>
</html>
