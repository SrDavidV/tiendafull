package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class tv_Servlet
 */
@WebServlet("/tv_Servlet")
public class tv_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tv_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String usuario= request.getParameter("usuario");
		String contraseña= request.getParameter("contraseña");
		String accion= request.getParameter("accion");
		
		PrintWriter writer = response.getWriter();
	
		if(accion.equalsIgnoreCase("Ingresar")) {
			if(usuario.equalsIgnoreCase("admininicial") && contraseña.equalsIgnoreCase("admin123456")) {
				writer.println("Inicio de sesion exitoso");
			}else {
			   writer.println(" Usuario y/o contraseña incorrectos");
			writer.close();
			}
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
