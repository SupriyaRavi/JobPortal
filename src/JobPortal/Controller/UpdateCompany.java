package JobPortal.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import JobPortal.Bean.Company;
import JobPortal.Bean.Employee;
import JobPortal.DAO.SqlOperation;

/**
 * Servlet implementation class UpdateCompany
 */
@WebServlet("/UpdateCompany")
public class UpdateCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCompany() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		HttpSession s=request.getSession();
		String email=(String) s.getAttribute("companyMail");
		System.out.println("Session Value "+email);
		Company c =SqlOperation.fetchCompany(email);
		System.out.println("From Servlet :: "+c);
		 	request.setAttribute("UpdatedCompObj",c);
		 	request.getRequestDispatcher("UpdateCompany.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
