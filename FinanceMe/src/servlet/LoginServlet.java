package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import constant.Common;
import constant.ErrorMsg;
import constant.Page;
import dao.UserDao;
import entity.User;

/**
 * Servlet implementation class LoginServlet
 */
/* 服务器使用注解的方式帮我注册了servlet了，这时候已经不需要我再web.xml手动注册了。 */
/* 表示servle类请求的url地址 */
@WebServlet(description = "login for user", urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("*****Line33*****");
		res.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");

		String uri = req.getRequestURI();
		uri = uri.substring(uri.lastIndexOf("/") + 1);

		if (uri.equals("LoginServlet")) {

			try {
				login(req, res);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public void login(HttpServletRequest req, HttpServletResponse res) throws Exception {

		String id = req.getParameter("id");
		String pwd = req.getParameter("password");

		if (Common.EMPTY.equals(id)) {
			// ユーザーID未入力
			req.setAttribute("error", ErrorMsg.UINB001);
			req.getRequestDispatcher(Page.LOGIN).forward(req, res);

		} else if (Common.EMPTY.equals(pwd)) {
			// パスワード未入力
			req.setAttribute("error", ErrorMsg.UINB002);
			req.setAttribute("id", id);
			req.getRequestDispatcher(Page.LOGIN).forward(req, res);
		} else {
			UserDao uDao = new UserDao();
			User u = uDao.search(id);
			if (!pwd.equals(u.getPassword())) {
				// パスワード不正または該当ユーザーが存在しません。
				req.setAttribute("error", ErrorMsg.UINM001);
				req.setAttribute("id", id);
				req.getRequestDispatcher(Page.LOGIN).forward(req, res);

			} else {
				req.setAttribute("userName", u.getName());
				req.getRequestDispatcher(Page.LOGIN_SUCCESS).forward(req, res);
			}
		}
	}

}
