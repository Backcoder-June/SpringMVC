package memberAnnotation;

import org.springframework.stereotype.Component;

@Component
public class MemberDTO {
	private String id, name;
	private int pw;
	
	public MemberDTO() {} 
	
	public MemberDTO(String id, String name, int pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
		
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	} 
	
	
	
	

}
