package command;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class commandAPI {
	
	public static void main(String[] args) {
		
		ApplicationContext fac = new ClassPathXmlApplicationContext("command/command.xml");
		
		
		boardcommand b = (boardcommand)fac.getBean("board");
		membercommand m = (membercommand)fac.getBean("member");
		productcommand p = (productcommand)fac.getBean("product"); 
		
		// 이렇게 가져올 수 있다. 타입을 따로 명시. 
		command c1 = fac.getBean(boardcommand.class, "board");
		
		b.run(); 
		m.run();
		p.run(); 
		
		
		
		
		
		
		
	}

}
