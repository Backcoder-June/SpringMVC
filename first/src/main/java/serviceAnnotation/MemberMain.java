package serviceAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("serviceAnnotation/member.xml");


		MemberService service = (MemberService)fac.getBean("junior");
		
		service.registerMember();		
		
		
	}
}
