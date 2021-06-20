package com.Bus;

import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.BusOwnerDB.BusOwnerDB;

@WebServlet("/DeleteBusController")
public class DeleteBusController extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String busId = request.getParameter("busId");
		System.out.println(busId);
		
		boolean rezult = false; 
		
		//this statement for write java script code to display pop up message
		PrintWriter set = response.getWriter();
		response.setContentType("text/html");
		
		rezult = BusOwnerDB.deleteDetails(busId);
		
		if(rezult == true) {
			
			set.println("<script type = 'text/javascript'>");
			set.println("alert('SUCCESSFUL DEACTIVATED!!!');");
			set.println("location = 'OwnerHomeUI.jsp'");
			set.println("</script>");
			
		}else {
			set.println("<script type = 'text/javascript'>");
			set.println("alert('TRY AGAIN');");
			set.println("location = 'BusProfile.jsp'");
			set.println("</script>");
		}
	}

}
