package annotation.Springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class annotationController {

	
//	@RequestMapping(value = "/loginform", method = RequestMethod.GET )

	@GetMapping("/loginform")
	public String maptest() {
		
		return "loginform";
	}

	
//	@RequestMapping(value = "/loginresult", method = RequestMethod.POST)
	@PostMapping("/loginresult")
	public String loging(@ModelAttribute("dto") LoginDTO dto) {
		// 자동으로 form태그에서 name == 파라미터명 같은거 매칭해서 가져옴 
		
		return "loginresult";
	}


	
	/*
	 * @RequestMapping("/loginform") public String logingform(){
	 * 
	 * return "loginform"; }
	 */
	
	
	

	/*
	 * @RequestMapping("/loginresult") public ModelAndView loging(HttpServletRequest
	 * request, HttpServletResponse response) throws Exception {
	 * 
	 * String id = request.getParameter("id"); int pw =
	 * Integer.parseInt(request.getParameter("pw"));
	 * 
	 * LoginDTO dto = new LoginDTO();
	 * 
	 * dto.setId(id); dto.setPw(pw);
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("dto", dto);
	 * mv.setViewName("loginresult");
	 * 
	 * return mv; }
	 */	
	/*
	 * @RequestMapping("/loginresult") public ModelAndView loging(String id, int pw)
	 * { // 자동으로 form태그에서 name == 파라미터명 같은거 매칭해서 가져옴
	 * 
	 * LoginDTO dto = new LoginDTO();
	 * 
	 * dto.setId(id); dto.setPw(pw);
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("dto", dto);
	 * mv.setViewName("loginresult");
	 * 
	 * return mv; }
	 * 
	 */	
	
	/*
	 * @RequestMapping("/loginresult") public ModelAndView loging(LoginDTO dto) { //
	 * 자동으로 form태그에서 name == 파라미터명 같은거 매칭해서 가져옴
	 * 
	 * ModelAndView mv = new ModelAndView(); mv.addObject("dto", dto);
	 * mv.setViewName("loginresult");
	 * 
	 * return mv; }
	 */

	/*
	 * @RequestMapping("/loginresult") public String loging(@ModelAttribute("dto")
	 * LoginDTO dto) { // 자동으로 form태그에서 name == 파라미터명 같은거 매칭해서 가져옴
	 * 
	 * return "loginresult"; }
	 */

	
	
	
	
	
}
