package chap24;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Customer;
import dao.CustomerDAO;
import tool.Action;

public class LoginAction extends Action{

	@Override
	public String excuse(
			HttpServletRequest request, HttpServletResponse response
			) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		HttpSession session = request.getSession();

		String login =request.getParameter("login");
		String password = request.getParameter("password");

		CustomerDAO dao = new CustomerDAO();
		Customer customer = dao.search(login,password);

		if(customer!= null) {
			session.setAttribute("customer",customer);
			return "login-out.jsp";
		}

		return "login-error.jsp";
	}

}