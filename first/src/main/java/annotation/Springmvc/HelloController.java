package annotation.Springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


@org.springframework.stereotype.Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public ModelAndView hello(){

		HelloDTO dto = new HelloDTO(); 
		
		dto.setMessage("날 가져가봐");
			
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", dto);
		
		mv.setViewName("hello");
		
		return mv; 
		
	}

}

