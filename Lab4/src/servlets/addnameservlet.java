package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Person;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "addnameservlet", urlPatterns = { "/addnameservlet" })
public class addnameservlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// processRequest(request, response);
		String key = request.getParameter("key").toString();
		String firstName = request.getParameter("firstname").toString();
		String lastName = request.getParameter("lastname").toString();

		if (key != null && firstName != null && lastName != null) {

			HttpSession session = request.getSession();
			HashMap<String, Person> list = (HashMap<String, Person>) session.getAttribute("list");
			Person person = new Person(firstName, lastName);
			if (list == null) {
				list = new HashMap<String, Person>();
				session.setAttribute("list", list);
			}
			list.put(key, person);

			request.setAttribute("list", list);
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("shownames.jsp");
		dispatcher.forward(request, response);
	}

}
