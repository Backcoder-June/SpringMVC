package tv;

public class TVfactory {
	
	public TVinterface getTV(String name) {
		if(name.equals("삼성")) {
			return new SamsungTV(); 
		}else if(name.equals("엘지")) {
			return new LgTV(); 		}
		
		return null; 
	}
	
	
	
	
}