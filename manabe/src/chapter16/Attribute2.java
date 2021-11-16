package chapter16;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

/**
 * Servlet implementation class Attribute2
 */
@WebServlet("/chapter16/attribute2")
public class Attribute2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			ProductDAO dao =new ProductDAO();
			List<Product> list=dao.search("");

			request.setAttribute("list", list);
			request.getRequestDispatcher("attribute2.jsp")
			.forward(request, response);

		}catch (Exception e) {
			e.printStackTrace(out);
		}

	}
}