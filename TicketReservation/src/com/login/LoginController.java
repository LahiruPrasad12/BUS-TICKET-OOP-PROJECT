 package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BusOwnerDB.*;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String l1;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Assign enter user id and password to declared variable
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		try {
		 l1 = BusOwnerDB.validate(username, password);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		if(l1 !="fale") {
			//create session to display user name of loged user
			HttpSession session = request.getSession();
			session.setAttribute("userName", l1);
			response.sendRedirect("OwnerHomeUI.jsp");
			
		}else {
			
			request.setAttribute("Message", "Your User Name Or Password is Incorrect");
			request.getRequestDispatcher("loginUI.jsp").forward(request, response);
			//response.sendRedirect("loginUI.jsp");
		}
		
	}//End OF The doPost Method..

}//End Of The LoginController..
