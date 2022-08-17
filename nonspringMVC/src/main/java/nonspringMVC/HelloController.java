package nonspringMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

	@Override
	public String handleAndRequest(HttpServletRequest request, HttpServletResponse response) {
		
		HelloDTO dto = new HelloDTO(); 
		
		dto.setMessage("날 가져가봐");
		
		request.setAttribute("message", dto);
		
		return "hello.jsp"; 
	}

}

