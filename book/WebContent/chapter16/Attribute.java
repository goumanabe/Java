package chapter16;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;

/**
 * Servlet implementation class Attribute
 */
@WebServlet("/chapter16/attribute")
public class Attribute extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		Product p =new Product();
		p.setId(1);
		p.setName("まぐろ");
		p.setPrice(100);
		request.setAttribute("product",p);
		request.getRequestDispatcher("attribute.jsp").forward(request, response);
	}
}