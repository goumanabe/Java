package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import bean.Product;
import dao.ProductDAO;
import tool.Page;

/**
 * Servlet implementation class Seach
 */
@WebServlet(urlPatterns={"/chapter15/search"})
public class Search extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response
			) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		Page.header(out);

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource)ic.lookup(
					"java:/comp/env/jdbc/book");
			Connection con = ds.getConnection();

			String keyword=request.getParameter("keyword");

			ProductDAO dao =new ProductDAO();
			List<Product> list=dao.search(keyword);

			for(Product p:list){
				out.println(p.getId());
				out.println(":");
				out.println(p.getName());
				out.println(":");
				out.println(p.getPrice());
				out.println("<br>");
			}

		}catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}