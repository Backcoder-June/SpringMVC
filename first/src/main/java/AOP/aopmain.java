package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopmain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("AOP/aopbean.xml");
		
		Member member = fac.getBean(Member.class, "member");
		Board board = fac.getBean(Board.class, "board");
		Common c = fac.getBean(Common.class, "common");

		
		member.login("june");
		
		board.insert(100); 
		board.getList();
		
		member.logout("june");
		
		
		
		
		
	}

}
