package JobPortal.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.DAO.SqlOperation;


@WebServlet("/RegisterCompany")
public class RegisterCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterCompany() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cname=request.getParameter("username");
		String mail=request.getParameter("mail");
		String Password=request.getParameter("passwd");
		String Website=request.getParameter("web");
		String ContactPerson=request.getParameter("contactPerson");
		String ContactPersonNumber=request.getParameter("contactNumber");
		SqlOperation dao = new SqlOperation();
		
		if(dao.addCompany(cname, mail, Password, Website, ContactPerson, ContactPersonNumber)==1) {
			//success
			RequestDispatcher dd = request.getRequestDispatcher("CompanyLogin.html");
			dd.forward(request, response);
		}else {
			//fail
			RequestDispatcher dd = request.getRequestDispatcher("registerCompany.html");
			dd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
