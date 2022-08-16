package springtv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TVcontroller {
	
	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("springtv/springtv.xml");

		TVinterface ltv = (TVinterface)factory.getBean("ltv");
		

		TVinterface stv = (TVinterface)factory.getBean("stv");
				
		ltv.powerOff();
		ltv.powerOn();
		ltv.volumeDown(10);
		
		stv.volumeDown(3);
		stv.volumeUp(5);
		stv.powerOff();
		
		
		
	}

}
