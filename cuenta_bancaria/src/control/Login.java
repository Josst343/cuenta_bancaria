package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		sendLoginForm(response, false);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("nombre");
		String password = request.getParameter("contrasena");
		sendLoginForm(response, false);
		if (userName != null && password != null &&
		userName.equals("joss") && password.equals("123")) {
			RequestDispatcher despachador= request.getRequestDispatcher("/datosestudiante");
			despachador.forward(request, response);
		}
		else {
		sendLoginForm(response, true);
		}
	}
	
	private void sendLoginForm(HttpServletResponse response, boolean withErrorMessage)
			throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<TITLE>Login</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			if (withErrorMessage)
				out.println("El ACCESO fall�. Int�ntelo otra vez.<BR>");
			out.println("<BR>");
			out.println("<BR>Please enter your user name and password.");
			out.println("<BR><FORM METHOD=POST>");
			out.println("<BR>User Name: <INPUT TYPE=TEXT NAME=nombre>");
			out.println("<BR>Password: <INPUT TYPE=PASSWORD NAME=contrasena>");
			out.println("<BR><INPUT TYPE=SUBMIT VALUE=Submit>");
			out.println("</FORM>");
			out.println("</BODY>");
			out.println("</HTML>");
		}


}
