package com.register;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.BusOwnerDB.*;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean ans = false;
	
		//Capture the user input details
		String fName = request.getParameter("fname");
		String lName = request.getParameter("lname");
		String Phone = request.getParameter("phone");
		String Email = request.getParameter("email");
		String Address = request.getParameter("address");
		String city = request.getParameter("city");
		String zipCode = request.getParameter("zipCode");
		String UserName = request.getParameter("userName");
		String Password = request.getParameter("password");
		
		try {
			//Send Captured details to entity class
			ans = BusOwnerDB.addBusOwner(fName,lName, Email, Phone, Address,city,zipCode, UserName, Password);
		}catch(Exception e) {
			e.getMessage();
		}
		
		if(ans == true) {
			//if userID not exists system redirect user to user login page 
			RequestDispatcher rd = request.getRequestDispatcher("loginUI.jsp");
			rd.forward(request, response);	
		}
		else {
			//Display error Message and System display registration page to register again
			request.setAttribute("Message", "Your User Name is Already Exixts");
			request.getRequestDispatcher("RegisterUI.jsp").forward(request, response);
		}
	
		
	}//End Of The doPost method..
	
	
}
