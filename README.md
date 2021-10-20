# Java
HTTPステータス 500 – Internal Server Error
タイプ 例外報告

メッセージ [/chapter16/attribute.jsp] の処理中に行番号 [7] で例外が発生しました。

説明 サーバーは予期しない条件に遭遇しました。それはリクエストの実行を妨げます。

例外

org.apache.jasper.JasperException: [/chapter16/attribute.jsp] の処理中に行番号 [7] で例外が発生しました。

4: 
5: <%@page import="bean.Product" %>
6: <% Product p=(Product)request.getAttribute("Product"); %>
7: <%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
8: <%@include file="../footer.html" %>


Stacktrace:
	org.apache.jasper.servlet.JspServletWrapper.handleJspException(JspServletWrapper.java:601)
	org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:498)
	org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:383)
	org.apache.jasper.servlet.JspServlet.service(JspServlet.java:331)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
	chapter16.Attribute.doGet(Attribute.java:28)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
根本原因

java.lang.NullPointerException
	org.apache.jsp.chapter16.attribute_jsp._jspService(attribute_jsp.java:130)
	org.apache.jasper.runtime.HttpJspBase.service(HttpJspBase.java:70)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
	org.apache.jasper.servlet.JspServletWrapper.service(JspServletWrapper.java:465)
	org.apache.jasper.servlet.JspServlet.serviceJspFile(JspServlet.java:383)
	org.apache.jasper.servlet.JspServlet.service(JspServlet.java:331)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
	chapter16.Attribute.doGet(Attribute.java:28)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:655)
	javax.servlet.http.HttpServlet.service(HttpServlet.java:764)
	org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:52)
注意 原因のすべてのスタックトレースは、サーバのログに記録されています
