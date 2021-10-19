<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sample01</title>
</head>
<body>
<% String[] name = {"Spring", "Summer", "Autumn", "Winter"}; %>
<% for(int i = 0; i < name.length; i++){%>
<p align="center"><%= name[i] %></p>
<% }%>
</body>
</html>