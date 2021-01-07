<%@page import="com.mycompany.myhome.board.BoardDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.mycompany.myhome.board.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<BoardDto> list = (List<BoardDto>)request.getAttribute("boardList");
%>


<table style="Width:80%;border:1px solid #000">
	<% for(int i =0; i < list.size(); i++) { %>
		<tr>
			<td><%=list.get(i).getId() %></td>
			<td><%=list.get(i).getTitle()%></td>
			<td><%=list.get(i).getWriter() %></td>
			<td><%=list.get(i).getWdate() %></td>
			<td><%=list.get(i).getContents() %></td>
		</tr>
	<%} %>
</table>

</body>
</html>