package JobPortal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.DAO.SqlOperation;

/**
 * Servlet implementation class SubmitJob
 */
@WebServlet("/SubmitJob")
public class SubmitJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public SubmitJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		String CompanyName=request.getParameter("Cname");
		String Jobtitle=request.getParameter("Jpost");
		String Email=request.getParameter("email");
		String FullName=request.getParameter("Fname");
		String MobileNo=request.getParameter("Mno");
		String Skills=request.getParameter("skill");
		
		SqlOperation obj=new SqlOperation();
		if(obj.addUserToJob(CompanyName,Jobtitle,Email,FullName,MobileNo,Skills)==1) {
			p.println("<script type=\"text/javascript\">"); 
			p.println("Submitted Job Successfully \")");
			p.println("</script>");
			response.setHeader("Refresh", "1;EmpDashboard.jsp");
		}else
		{
			p.println("<script type=\"text/javascript\">"); 
			p.println("alert(\"Job Submission Failed ! please try again.\")");
			p.println("</script>");
			response.setHeader("Refresh", "1;SubmitJob.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
