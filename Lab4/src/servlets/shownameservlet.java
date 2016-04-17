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

@WebServlet(name = "shownameservlet", urlPatterns = { "/shownameservlet" })
public class shownameservlet extends HttpServlet {

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on
	// the + sign on the left to edit the code.">

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		HashMap<String, Person> list = (HashMap<String, Person>) session.getAttribute("list");
		if (list == null) {
			list = new HashMap<String, Person>();
		}
		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("shownames.jsp");
		dispatcher.forward(request, response);
	}

}
