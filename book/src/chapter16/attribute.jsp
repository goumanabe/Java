<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@page import="bean.Product" %>
<% Product p=(Product)request.getAttribute("Product"); %>
<%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
<%@include file="../footer.html" %>