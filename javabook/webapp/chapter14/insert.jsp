<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<p>追加する商品を入力してください</p>
<form action="insert" method="post">
<input type="text" name="name">
<input type="text" name="price">
<input type="submit" value="検索">
</form>

<%@include file="../footer.html" %>
