package JobPortal.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JobPortal.Bean.Employee;
import JobPortal.Bean.Jobs;
import JobPortal.DAO.SqlOperation;


@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		HttpSession s=request.getSession();
		String mail=(String) s.getAttribute("username");
		System.out.println("Session Value "+mail);
		Employee e =SqlOperation.fetchEmployee(mail);
		System.out.println("From Servlet :: "+e);
		 	request.setAttribute("UpdatedEmpObj",e);
		 	request.getRequestDispatcher("UpdateUser.jsp").forward(request, response);
		 
	}

	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
