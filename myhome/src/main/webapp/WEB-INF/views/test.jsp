<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
userid : <%= request.getAttribute("userid") %>
userid : <%= request.getAttribute("username") %>

���̵� ${userid} �̸� : ${username}
</body>
</html>