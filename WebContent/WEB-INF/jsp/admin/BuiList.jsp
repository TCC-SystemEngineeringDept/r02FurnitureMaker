<%@page import="r02Furniture.jdbc.Bui"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>部位の一覧</title>
</head>
<body>
<%
	List<Bui> list = (List<Bui>)request.getAttribute("buiList");
%>

<H1>部位の一覧</H1>


<table>
<%for(Bui b : list){ %>
<tr>
<th><%= b.getBuiCode() %></th>
<td><%= b.getBuiName() %></td>
</tr>
<% } %>
</table>
</body>
</html>