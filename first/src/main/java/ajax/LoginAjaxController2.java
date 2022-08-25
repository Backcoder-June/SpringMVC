package ajax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Board.BoardDTO;
import Board.MemberService;
import Board.memberDTO;

@Controller
public class LoginAjaxController2 {

	@Autowired
	MemberService service; 
	
	
	  @GetMapping("/ajaxlogin2") public String ajaxloginform() { 
	  return "ajax/loginform2"; }
	   
	 	// 이 맵핑은 새로운 PAGE 전체가 아니라, Body 부에 대한 응답일 뿐이다 

	@ResponseBody   
	@PostMapping(value="/ajaxlogin2", produces = {"application/json;charset=utf-8"})
	public memberDTO ajaxloginProcess2(memberDTO dto) {
		
		if(dto.getId().equals("ajax") && dto.getPw().equals("1111")) {
			dto.setName("Backcoder");
		}
		
		return dto; 
	}

	
	
	@ResponseBody
	@GetMapping(value = "/ajaxmemberlist", produces = {"application/json;charset=utf-8"} )
	public List<memberDTO> memli(memberDTO dto) throws IOException{

		List<memberDTO> memberlist = service.allMember();
		
		return memberlist; 
}
}