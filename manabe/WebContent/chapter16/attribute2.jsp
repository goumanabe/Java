<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@page import="bean.Product,java.util.List" %>
<% List<Product> list=(List<Product>)request.getAttribute("list"); %>

<% for(Product p:list){ %>
<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %>
<%} %>

<%@include file="../footer.html" %>