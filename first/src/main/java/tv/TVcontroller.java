package tv;

public class TVcontroller {
	
	public static void main(String[] args) {

		TVinterface tv = null; 

		TVfactory fac = new TVfactory(); 
		tv = fac.getTV(args[0]); 
		

		
		//tv = new SamsungTV(); 
	
	//	tv.powerOff();
		
		
		SamsungTV stv = new SamsungTV();

		
		
		stv.powerOff();
		stv.powerOn();
		stv.volumeDown(10);
		
		LgTV ltv = new LgTV(); 
		
		ltv.volumeDown(3);
		ltv.volumeUp(5);
		ltv.powerOff();
		
		
		
	}

}
