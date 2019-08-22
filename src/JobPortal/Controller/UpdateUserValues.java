package JobPortal.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JobPortal.DAO.SqlOperation;


@WebServlet("/UpdateUserValues")
public class UpdateUserValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateUserValues() {
        super();
   
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession();
		String mail=(String) s.getAttribute("username");
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
		PrintWriter p = response.getWriter();
		SqlOperation obj=new SqlOperation();
		
		int flag=obj.updateUserValue(mail,fname,lname,mobilenum,username,password,gender,technicalskills,currentrole,company,experience);
		if(flag==1) {
			p.println("<script>alert('Profile Updated Successfull.')</script>");
			response.setHeader("Refresh","1;EmpDashboard.jsp");
		}
		else {
			p.println("<script>alert('Profile Updated Failed.')</script>");
			response.setHeader("Refresh","1;EmpDashboard.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
