package member;

public class MemberDTO {
	private String id, name;
	private int pw;
	
	public MemberDTO() {System.out.println("기본생성자");} 
	
	public MemberDTO(String id, String name, int pw) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	
	public MemberDTO(String id, int pw) {
		super();
		this.id = id;
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
