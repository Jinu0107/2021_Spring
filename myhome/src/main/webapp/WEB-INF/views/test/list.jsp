<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	
	ArrayList<String> flowerList = (ArrayList<String>)request.getAttribute("flowerList");
	for(int i =0; i < flowerList.size(); i++){
		out.println(flowerList.get(i));
	}
	
%>

</body>
</html>