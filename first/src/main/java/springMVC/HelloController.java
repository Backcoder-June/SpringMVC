package springMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HelloDTO dto = new HelloDTO(); 
		
		dto.setMessage("날 가져가봐");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", dto);
	
		// 이거와 똑같은 기능 request.setAttribute("message", dto);
	
		mv.setViewName("hello");
		// view 파일도 설정. 뷰리졸버. 
		
		return mv; 

	}

}

