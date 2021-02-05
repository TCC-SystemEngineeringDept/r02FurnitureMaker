<%@page import="r02Furniture.jdbc.Hinmoku"%>
<%@page import="r02Furniture.jdbc.Bui"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>品目の一覧</title>
</head>
<body>
<%
	List<Hinmoku> list = (List<Hinmoku>)request.getAttribute("hinmokuList");
%>

<H1>品目の一覧</H1>


<table>
<%for(Hinmoku h : list){ %>
<tr>
<th><%= h.getHinmokuCode() %></td>
<td><%= h.getHinmokuName() %></td>
<td><%= h.getSeriesCode() %></td>
<td><%= h.getBuiCode() %></td>
<td><%= h.getSizeW() %></td>
<td><%= h.getSizeH() %></td>
<td><%= h.getSizeD() %></td>
</tr>
<% } %>
</table>
</body>
</html>