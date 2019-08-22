package JobPortal.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.Bean.Jobs;
import JobPortal.DAO.SqlOperation;

import java.util.ArrayList;
import java.util.List;
/**
 * Servlet implementation class ApplyJobs
 */
@WebServlet("/ApplyJobs")
public class ApplyJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyJobs() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		 try {
			 
			 List<Jobs> jobs =SqlOperation.list();
		 request.setAttribute("JobList",jobs);
		 request.getRequestDispatcher("JobApply.jsp").forward(request, response);
		 
		 } catch (SQLException e) 
		 {
			 System.out.println(e);
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
