package serviceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class scopeMain {

	
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("member/member.xml");

		MemberDTO dto1 = (MemberDTO)fac.getBean("dto1");
		MemberDTO dto2 = (MemberDTO)fac.getBean("dto2");
		MemberDTO dto3 = (MemberDTO)fac.getBean("dto3"); 
		
		
		
		
		
		
		
		
		
		
	}
}
