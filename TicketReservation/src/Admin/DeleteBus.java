package Admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import AdminDButill.AdminDButill;

@WebServlet("/DeleteBus")
public class DeleteBus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String busID = request.getParameter("bID");
		System.out.println(busID);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		boolean ans = false;
		try {
			ans = AdminDButill.deleteBus(busID);
			
			if(ans==true) {
				out.println("<script type='text/javascript'>");
				out.println("alert('Bus Delete successfully! ');");
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
