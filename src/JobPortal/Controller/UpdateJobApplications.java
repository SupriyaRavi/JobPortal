package JobPortal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.DAO.SqlOperation;


@WebServlet("/UpdateJobApplications")
public class UpdateJobApplications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateJobApplications() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Jtitle=request.getParameter("id");
		String Company=request.getParameter("comp");
		System.out.println(Jtitle);
		System.out.println(Company);
		PrintWriter p = response.getWriter();
	SqlOperation s=new SqlOperation();
		if(s.updateApprove(Jtitle, Company)==1) {
			p.println("<script>alert('Approved  Successfully.')</script>");
			response.setHeader("Refresh", "1;Admin.jsp");
		}
		else
		{
			p.println("<script>alert('Approve failed!! Try Again')</script>");
			response.setHeader("Refresh", "1;AppliedJobs.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
