package com.owner;

import java.io.IOException;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.BusOwnerDB.BusOwnerDB;



@WebServlet("/ownerDetailsViewController")
public class ownerDetailsViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//create a session to capture the user name of log user
		HttpSession sessi = request.getSession();
		String name = sessi.getAttribute("userName").toString();
		
		try {
			//call to details method by passing user name to get the log user details and it display bus owner home page
			List<owner> owDetails = BusOwnerDB.details(name);
			request.setAttribute("details", owDetails);
			RequestDispatcher rd = request.getRequestDispatcher("OwnerHomeUI.jsp");
			rd.forward(request, response);
		}catch (Exception e) {
			e.getMessage();
		}
	}
	
	

}
