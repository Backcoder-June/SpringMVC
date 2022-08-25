package ajax;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginAjaxController {
	
	  @GetMapping("/ajaxlogin") 
	  public String ajaxloginform() { 
	  return "ajax/loginform"; }
	   
	 	// 이 맵핑은 새로운 PAGE 전체가 아니라, Body 부에 대한 응답일 뿐이다 
	@ResponseBody   
	@PostMapping(value="/ajaxlogin", produces = {"application/json;charset=utf-8"})
	public String ajaxloginProcess(String id, String pw) {

		String condition = ""; 
		
		if(id.equals("ajax") && pw.equals("1111")) {
			condition = "정상 로그인 입니다. success";
		} else { 
			condition = "로그인 할 수 없습니다.fail"; 
		}
//		model.addAttribute("condition", condition);
		//{ "process" : "condition" }  
		return "{\"process\" : \""+condition+"\"}"; 
	}
}
