package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.*;

/**
 * Servlet implementation class DataCatch
 */
@WebServlet("/DataCatch")
public class DataCatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DataCatch() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("Cache-control", "no-cache");
		String a = request.getRemoteAddr();
		String b = request.getParameter("user");
		String c = request.getParameter("url");
		String d = request.getParameter("newvisit");
		String e = request.getParameter("date");
		String f = request.getParameter("time");
		Balanceador.mostrarParametros(a,b,c,d,e,f);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
