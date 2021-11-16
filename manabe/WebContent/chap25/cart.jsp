<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="menu.jsp" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
 <c:when test="${cart.size()>0}">
  <p>${cart.size() }種類の商品があります。</p>
  <hr>
 </c:when>
 <c:otherwise>
  <p>カートに商品がありません。</p>
 </c:otherwise>

</c:choose>

<table style="border-collapse:separate;border-spacing:10px;">
<c:forEach var="item" items="${cart}">
 <tr>
  <td><img src="image/${item.product.id}.jpg" height="96"></td>
  <td>${item.product.name}</td>
  <td>${item.product.price}</td>
  <td>${item.count}個</td>
  <td><a href="CartRemove.action?id=${item.product.id}">カートから削除</a></td>
 </tr>


</c:forEach>
</table>

</body>
</html>