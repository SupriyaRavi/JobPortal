package JobPortal.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import JobPortal.Bean.TotalAppliedCandidates;
import JobPortal.DAO.SqlOperation;


@WebServlet("/ApproveJobs")
public class ApproveJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ApproveJobs() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
		 List<TotalAppliedCandidates> TotalJ =SqlOperation.appliedJobs();
		 request.setAttribute("TotalJobs",TotalJ);
		 request.getRequestDispatcher("AppliedJobs.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
