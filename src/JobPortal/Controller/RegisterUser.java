package JobPortal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.DAO.SqlOperation;


@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   
    public RegisterUser() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter p = response.getWriter();
		String email=request.getParameter("mail");
		String fname=request.getParameter("firstName");
		String lname=request.getParameter("lastName");
		String mobilenum=request.getParameter("mobilenum");
		String username=request.getParameter("userName");
		String password=request.getParameter("passwd");
		String gender=request.getParameter("gender");
		String technicalskills=request.getParameter("keySkills");
		String currentrole=request.getParameter("currentRole");
		String company=request.getParameter("company");
		String experience=request.getParameter("expirence");
		
		SqlOperation obj=new SqlOperation();
		if(obj.addUser(email, fname, lname, mobilenum, username, password, gender, technicalskills, currentrole, company, experience)==1)  {
			p.println("<script>alert('Employee Registration Successfull.')</script>");
			response.setHeader("Refresh","1;index.html");
		}
		else
		{
			p.println("<script>alert('Employee Registration Unsuccessfull! Try Again')</script>");
			response.setHeader("Refresh","1;index.html");
		}
			
		
			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
