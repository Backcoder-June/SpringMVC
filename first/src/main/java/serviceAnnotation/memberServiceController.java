package serviceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class memberServiceController {
	
	@Qualifier("junior")
	@Autowired
	MemberService junior;
	
	
	@GetMapping("/memberjoin")
	public String memberjoin(MemberDTO dto, Model model) {

		String result = junior.registerMember(dto); 

		model.addAttribute(result);
		
		return "memberjoinservice"; 
	}
	
	
	

}
