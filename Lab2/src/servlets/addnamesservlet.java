package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import names.PersonList;
/**
 * 
 * @author najus
 *
 */

@WebServlet("/addnamesservlet")
public class addnamesservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String key = request.getParameter("key");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");

        HttpSession session = request.getSession();
        PersonList personlist = (PersonList)session.getAttribute("list");
        if (personlist == null){
        	personlist = new PersonList();
        	session.setAttribute("list", personlist);
        }
        personlist.addPerson(key, firstname, lastname);
        response.sendRedirect("allnamesservlet");

	}


}
