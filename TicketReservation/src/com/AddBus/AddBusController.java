package com.AddBus;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.BusOwnerDB.*;


@WebServlet("/AddBusController")
public class AddBusController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//create boolean type variable to capture the DB rsult
		boolean ans = false;
		
		//capture the user entered variable
		String id = request.getParameter("id");
		String startPlace = request.getParameter("from");
		String endPlace = request.getParameter("To");
		String departureT = request.getParameter("dTime");
		String arrivalT = request.getParameter("aTime");
		String type = request.getParameter("type");
		float fare = Float.parseFloat (request.getParameter("fare"));
		int seats = Integer.parseInt(request.getParameter("seats"));
		
		System.out.println(type);
		//get user name of logged user
		HttpSession sesson = request.getSession();
		String name = sesson.getAttribute("userName").toString();
	
		//this statement foe write a java script code display successful message
		PrintWriter set = response.getWriter();
		response.setContentType("text/html");
		
		
		try {
			//call the add bus method and capture the state of insert new bus process
			ans = BusOwnerDB.addBus(id, startPlace, endPlace, departureT, arrivalT, type, fare,seats,name);
			
			if(ans == true) {
				//if userID not exists system redirect user to user login page 
				set.println("<script type = 'text/javascript'>");
				set.println("alert('Successfull');");
				set.println("location = 'OwnerHomeUI.jsp'");
				set.println("</script>");
			}
			else {
				//Display error Message and System display addBus page to add bus details again
				request.setAttribute("Message", "Your Bus Id is Already Exixts");
				request.getRequestDispatcher("AddBusForm.jsp").forward(request, response);
			}
			
			
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
