package com.Bus;



import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.BusOwnerDB.*;

@WebServlet("/ViewBusController")
public class ViewBusController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Get user id of logged user
		HttpSession session = request.getSession();
		String userName = session.getAttribute("userName").toString();
		System.out.println(userName);
		
		try {
			List<Bus> det = BusOwnerDB.viewBusDetails(userName);
			request.setAttribute("busDetails", det);
			RequestDispatcher rd = request.getRequestDispatcher("BusProfile.jsp");
			rd.forward(request, response);
			
		}catch (Exception e) {
			e.getMessage();
		}
	}

}
