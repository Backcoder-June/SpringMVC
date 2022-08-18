package annotation.Springmvc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

@org.springframework.stereotype.Controller
public class ListController {	

	@RequestMapping("/list") 
	public ModelAndView list(){

		ArrayList<HelloDTO> list = new ArrayList<HelloDTO>();
		for(int i=1; i<=5; i++) {
			HelloDTO dto = new HelloDTO(); 
			dto.setMessage("리스트 : " + i);
			list.add(dto); 
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		//request.setAttribute("list", list);

		mv.setViewName("list");
		
		return mv;
	}

}
