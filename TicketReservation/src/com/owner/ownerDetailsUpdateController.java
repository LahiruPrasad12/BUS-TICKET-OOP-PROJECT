package com.owner;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.BusOwnerDB.*;

@WebServlet("/ownerDetailsUpdateController")
public class ownerDetailsUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//import statement for write java script code
		PrintWriter set = response.getWriter();
		response.setContentType("text/html");
		
		//Capture the parameter
		String id = request.getParameter("id");
		String uname = request.getParameter("username");
		String fname = request.getParameter("fName");
		String lname = request.getParameter("lName");
		String phone = request.getParameter("phone");
		String mail = request.getParameter("email");
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String code = request.getParameter("code");
		
		try {
			boolean ans = false;
			//call the updateDetails method to update user details
			ans = BusOwnerDB.updateDetails(id,uname, fname, lname, phone, mail, address, city, code);
		 
			//if update is success full system display successful pop message and system redirect user to bus owner home page
			if(ans == true) {
				set.println("<script type = 'text/javascript'>");
				set.println("alert('Successfull');");
				set.println("location = 'OwnerHomeUI.jsp'");
				set.println("</script>");
			}
			
			//if updated user name already exists system display error message and system let to user to update again
			else {
				request.setAttribute("Message", "Your User Name is Already Exixts");
				request.getRequestDispatcher("userProfile.jsp").forward(request, response);
			}
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
