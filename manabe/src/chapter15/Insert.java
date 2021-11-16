package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

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

@WebServlet(urlPatterns={"/chapter15/insert"})
public class Insert extends HttpServlet {
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

			String name =request.getParameter("name");
			int price =Integer.parseInt(request.getParameter("price"));

			Product p=new Product();

			p.setName(name);
			p.setPrice(price);

			ProductDAO dao =new ProductDAO();
			int line = dao.insert(p);

			if(line>0) {
				out.println("追加に成功しました。");
			}

		}catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}