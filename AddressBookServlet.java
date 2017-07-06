package addressbook.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import addressbookbusiness.User;




/**
 * Servlet implementation class AddressBookServlet
 */
@WebServlet({ "/AddressBookServlet", "/add" })
public class AddressBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressBookServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//need to call the database here or the ability to call the db
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name =request.getParameter("name");		
		String email =request.getParameter("email");
		String phone =request.getParameter("phoneNumber");
		String message = "You got this!"; //testing how it works
		
		User user = new User(name,email,phone);
		request.setAttribute("user", user);
		request.setAttribute("message", message); //testing how it works
		String url = "/results.jsp";
		getServletContext().getRequestDispatcher(url)
		                   .forward(request, response);
	}
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
