package JobPortal.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApplyToJob
 */
@WebServlet("/ApplyToJob")
public class ApplyToJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ApplyToJob() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Jtitle=request.getParameter("id");
		String Company=request.getParameter("comp");
		String Email=request.getParameter("mail");
		System.out.println("id"+Jtitle);
		System.out.println("c-mail"+Company);
		System.out.println("emp-mail"+Email);
		 request.setAttribute("Jtitle",Jtitle);
		 request.setAttribute("Jcompany",Company);
		 request.setAttribute("Empmail", Email );
		 request.getRequestDispatcher("SubmitJob.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
