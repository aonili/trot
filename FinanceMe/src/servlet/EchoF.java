package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EchoF
 */
@WebServlet(description = "the first sevlet class", urlPatterns = { "/EchoF" })
public class EchoF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// test用
	// Eclipse运行sevlet和jsp  
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		/*
		 * request.getParameterNames()方法是将发送请求页面中form表单里 所有具有name属性的表单对象获取(包括button).
		 * 返回一个Enumeration类型的枚举
		 */
		/*
		 * 通过Enumeration的hasMoreElements()方法遍历. 再由nextElement()方法获得枚举的值.
		 * 此时的值是form表单中所有控件的name属性的值.
		 */

		// import java.util.Enumeration;
		Enumeration<String> flds = req.getParameterNames();
		if (!flds.hasMoreElements()) {
			out.print("<html>");
			out.print("<form method=\"POST\"" + "action=\"EchoF\">");

			for (int i = 0; i < 10; i++)
				out.print("<b>Field" + i + "</b> " + "<input type=\"text\"" + " size=\"20\" name=\"Field" + i
						+ "\" value=\"Value" + i + "\"><br>");

			out.print("<INPUT TYPE=submit name=submit Value=\"Submit\"></form></html>");
		} else {

			out.print("<h1>Your form contained:</h1>");

			while (flds.hasMoreElements()) {
				String field = (String) flds.nextElement();
				String value = req.getParameter(field);
				out.print(field + " = " + value + "<br>");
			}

		}

		out.close();
	}

	/**
	 * Default constructor.
	 */
	public EchoF() {
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// tomcat目录下，lib文件夹中就有那两个包，servlet-api.jar和jsp-api.jar
	// 把jsp-api 、servlet-api 放到项目中的 web-inf/lib 目录下 即可
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
