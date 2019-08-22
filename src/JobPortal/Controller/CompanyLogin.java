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

/**
 * Servlet implementation class CompanyLogin
 */
@WebServlet("/CompanyLogin")
public class CompanyLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompanyLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		String email = request.getParameter("mail");
		String password = request.getParameter("passwd");
		HttpSession session = request.getSession();
		session.setAttribute("companyMail", email);
		System.out.println("Mail id "+email);
		System.out.println("Password "+password);
		SqlOperation dao = new SqlOperation();
		
		if(dao.validateCompany(email, password)) {
			RequestDispatcher Req = request.getRequestDispatcher("CompanyDashboard.jsp");
			Req.forward(request, response);
				
		}else
		if (email != "" && password != "") {
				
			//dont leave blank
			p.println("<script>alert('Login Failed! Try again')</script>");
			response.setHeader("Refresh","1;CompanyLogin.html");


			}
		else {
			p.println("<script type=\"text/javascript\">"); 
			p.println("alert(\"Login failed\")");
			p.println("</script>");
			response.setHeader("Refresh", "1;CompanyLogin.html");
		}
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
