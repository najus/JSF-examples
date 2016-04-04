package com.waa.lab1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author najus
 *
 */
@WebServlet("/LogonServlet")
public class LogonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LogonServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if (username != null && password != null) {
			if (username.equals("user") && password.equals("pass")) {
				out.println("Welcome user");
			} else {
				out.println("Wrong userid or password! Please try again");
				out.println("<form method=GET action=LogonServlet>");
				out.println("Username=<input type=text name=username> <br>");
				out.println("Password=<input type=text name=password>");
				out.println("<input type=submit value='Logon'>");
				out.println("</form>");
			}
		} else {
			out.println("<form method=GET action=LogonServlet>");
			out.println("Username=<input type=text name=username> <br>");
			out.println("Password=<input type=text name=password>");
			out.println("<input type=submit value='Logon'>");
			out.println("</form>");

		}

		out.println("</body>");
		out.println("</html>");
		out.close();
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
