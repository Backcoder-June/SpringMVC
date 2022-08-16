package memberService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("memberService/member.xml");


		MemberService junioremp = (MemberService)fac.getBean("junioremp");
		
		junioremp.registerMember(); 
		
		
		
		
		
		
		
		
		
		
	}
}
