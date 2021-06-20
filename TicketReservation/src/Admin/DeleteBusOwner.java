package Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdminDButill.AdminDButill;

@WebServlet("/DeleteBusOwner")
public class DeleteBusOwner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ownerID = request.getParameter("uid");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean ans = false;
		try {
			ans = AdminDButill.delete(ownerID);
			
			if(ans==true) {
				out.println("<script type='text/javascript'>");
				out.println("alert('Owner Delete successfully! ');");
				out.println("location='AdminUI.jsp'");
				out.println("</script>");
				
			}else {
				out.println("<script type='text/javascript'>");
				out.println("alert('Error!');");
				out.println("location='AdminUI.jsp'");
				out.println("</script>");
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
