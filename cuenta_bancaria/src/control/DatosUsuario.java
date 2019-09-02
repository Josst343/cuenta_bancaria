package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DatosUsuario
 */
@WebServlet("/datosusuario")
public class DatosUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DatosUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out= response.getWriter();
		out.print("<HTML>");
		out.print("<HEAD>");
		out.println("<TITLE>Datos personales</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY>");
		out.println("<BR><FORM METHOD=POST action=\"/cuenta_bancaria\">");
		out.println("<BR>Nombre: <INPUT TYPE=TEXT NAME=nombre>");
		out.println("<BR>Direccion: <INPUT TYPE=TEXT NAME=direccion>");		
		out.println("<BR>RFC: <INPUT TYPE=TEXT NAME=rfc>");
		out.println("<BR>telefono: <INPUT TYPE=number NAME=telefono>");
		out.println("<BR>Usuario: <INPUT TYPE=TEXT NAME=usuario>");
		out.println("<BR>Contrasena: <INPUT TYPE=TEXT NAME=contrasena>");
		out.println("<BR><INPUT TYPE=SUBMIT VALUE=Enviar>");
		out.println("</FORM>");
		out.println("</BODY>");
		out.println("</HTML>");	
		out.close();

	}

}
