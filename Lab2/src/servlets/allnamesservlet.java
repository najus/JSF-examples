package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import names.Person;
import names.PersonList;

/**
 * 
 * @author najus
 *
 */
@WebServlet("/allnamesservlet")
public class allnamesservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();
        PersonList personlist = (PersonList)session.getAttribute("list");
        if (personlist == null){
        	personlist = new PersonList();
        	session.setAttribute("list", personlist);
        }

        out.println("<html>");
        out.println("<body>");

        Collection<Person> plist=personlist.getList();

        out.println("<table  border='1'>");
        for (Person p: plist){
        	out.println("<tr><th>"+p.getKey()+"</th><th>"+p.getFirstname()+"</th><th>"+p.getLastname()+"</th><th>");
        }
        out.println("</table>");
        out.println("<br>");
        out.println("<form method=GET action=allnamesservlet>");
        out.println("<input type=submit value='Show all Names'>");
        out.println("</form>");
        out.println("<form method=GET action=addnamesservlet>");
        out.println("Key=<input type=text name=key>");
        out.println("First Name=<input type=text name=firstname>");
        out.println("Last Name=<input type=text name=lastname>");
        out.println("<input type=submit value='Add'>");
        out.println("</form>");
        out.println("<form method=GET action=removenamesservlet>");
        out.println("Key=<input type=text name=key>");
        out.println("<input type=submit value='Remove'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();	
        }




}
