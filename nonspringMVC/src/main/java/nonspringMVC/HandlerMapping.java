package nonspringMVC;

import java.util.HashMap;

public class HandlerMapping {
	
	HashMap<String, Controller> mappings = new HashMap<>();

	HandlerMapping(){
		mappings.put("hello", new HelloController());
		mappings.put("a", new HelloController());
		mappings.put("list", new ListController());
	}

	Controller getController(String key) {
		System.out.println("키 : " + key);
		return mappings.get(key); 
	}
	
	
	

}
