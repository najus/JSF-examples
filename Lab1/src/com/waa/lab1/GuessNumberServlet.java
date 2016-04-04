package com.waa.lab1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

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
@WebServlet("/GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GuessNumberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer randomNumber = new Random().nextInt(10) + 1;

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");

		String rn = request.getParameter("randomNumber");
		if (rn != null) {
			Integer usersRandomNumber = Integer.parseInt(rn);
			if (usersRandomNumber < randomNumber) {
				out.println("Too low, try again");
			}
			else if (usersRandomNumber > randomNumber) {
				out.println("Too High, try again");
			}
			else if (usersRandomNumber == randomNumber) {
				out.println("Correct, congratulations!");
			}
		} else {
			out.println("<form method=GET action=GuessNumberServlet>");
			out.println("Guess the number=<input type=text name=randomNumber>");
			out.println("<input type=submit value='Submit'>");
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
