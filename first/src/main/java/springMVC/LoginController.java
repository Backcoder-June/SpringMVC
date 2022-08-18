package springMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

//		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id"); 
		int pw = Integer.parseInt(request.getParameter("pw"));   
		
		LoginDTO dto = new LoginDTO(); 
		
		dto.setId(id);
		dto.setPw(pw);

		ModelAndView mv = new ModelAndView(); 
		mv.addObject("dto", dto); 
		mv.setViewName("loginresult");
		
		return mv;
	}

}
