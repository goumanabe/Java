<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>検索キーワードを入力して下さい</p>
<form action="Product.action" nethod="post">
<input type="text" name="keyword">
<input type="submit" value="検索">
</form>

<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="product" items="${list}">

	<tr>
	<td>商品${product.id}</td>
	<td><img src="photograph/${product.id}.jpg" height="64"></td>
	<td>${product.name}</td>
	<td>${product.price}円</td>
	<td><a href="CartAdd.action?id=${product.id}">カートに追加</a></td>
	</tr>

</c:forEach>
</table>

</body>
</html>