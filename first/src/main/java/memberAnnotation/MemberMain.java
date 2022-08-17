package memberAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("memberAnnotation/memberxml.xml");

		MemberDAO dao= (MemberDAO)fac.getBean("dao"); 
		
		//MemberDTO dto= (MemberDTO)fac.getBean("dto1"); 필요없어짐 config 에 dao에 dto1 넣어서  
		

		
		//dao.setDto(dto2);  이것도 container 로 옮긴다. 
		
		boolean result = dao.selectMember();
		if(result == true) {
			System.out.println(dao.dto.getName() + "님 로그인 성공");
		}else {
			dao.insertmember(); 
		}
		
		
		
		
		
		
		
		
		
		
	}
}
