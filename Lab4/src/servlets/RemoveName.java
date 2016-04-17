package servlets;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Person;

@WebServlet(name = "removeName", urlPatterns = { "/removeName" })
public class RemoveName extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = request.getParameter("key").toString();
		if (key != null) {

			HttpSession session = request.getSession();
			HashMap<String, Person> list = (HashMap<String, Person>) session.getAttribute("list");
			list.remove(key);
			request.setAttribute("list", list);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("showallnames.jsp");
		dispatcher.forward(request, response);
	}

}
