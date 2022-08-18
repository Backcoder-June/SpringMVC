package annotation.Springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class memberhobbycontroller {

	
	@GetMapping("/start")
	public String start() {
	return "memberhobby";
	}

	@PostMapping("/end")
	public String end(hobbyDTO dto, Model model) {
	
		String result ="";
		if(dto.getAge()>=20) {
			result = "성인입니다";
		}else {
			result = "미성년자 입니다.";
		}
	
		
		model.addAttribute("result",result);
		model.addAttribute("dto", dto);
	
		return "memberhobbyresult";
	}
	
	
	// get start method memeberhobby.jsp
	
	// post end method memberhobbyresult.jsp 
	// age20 > < 성인 미성년 처리하고 model 로 보내 
	
	
	
}
