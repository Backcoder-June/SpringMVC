package nonspringMVC;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DispatcherServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uri =req.getRequestURI();
		
		String uri_array[] = uri.split("/"); 
		String result = uri_array[uri_array.length -1]; 

		System.out.println("uri 짜르기 result : "+result);
		
		  
		  HandlerMapping mappings = new HandlerMapping(); Controller con =
		  mappings.getController(result);
		  
		 		String viewname = con.handleAndRequest(req, resp);
		System.out.println("viewname: " + viewname);
		
		
		RequestDispatcher rd  = req.getRequestDispatcher(viewname);

		rd.forward(req, resp); 
	}
}
