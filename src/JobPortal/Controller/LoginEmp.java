package JobPortal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JobPortal.DAO.SqlOperation;


@WebServlet("/LoginEmp")
public class LoginEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("pass");
		HttpSession session = request.getSession();
		System.out.println("Mail id "+username);
		System.out.println("Password "+password);
		 
		SqlOperation dao = new SqlOperation();
		System.out.println(dao.validateUser(username, password));
		
if (dao.validateUser(username, password)) {
	session.setAttribute("username", username);
			if (username.equals("HR@jobportal.com")) {
				
				response.sendRedirect("Admin.jsp");
			} else {
				int percent=SqlOperation.ProfileCompleteStatusUser(username);
				System.out.println(percent);
				 float s=(float)(percent/9);
				 System.out.println(s);
                	float status=s*100;
                	System.out.println(status);
				 request.setAttribute("status",status);
			
			    RequestDispatcher dd = request.getRequestDispatcher("EmpDashboard.jsp");
				dd.forward(request, response);
				
			}

		} else if (username != "" && password != "") {
			
			p.println("<script>alert('Login  Failed.')</script>");
			response.setHeader("Refresh","1;index.html");

		} else {
			p.println("<script>alert('Login  Failed.')</script>");
			response.setHeader("Refresh","1;index.html");
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
