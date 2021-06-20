package Admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdminDButill.AdminDButill;

@WebServlet("/viewOwnersServlet")
public class viewOwnersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
			ArrayList<Owners> owner = AdminDButill.getOwners();
			request.setAttribute("det", owner);
			RequestDispatcher reqst = request.getRequestDispatcher("AdminUI.jsp");
			reqst.forward(request, response);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
