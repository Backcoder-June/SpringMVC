package AOP;

public class Member {
	public void login(String id) {
		
		System.out.println(id + "로그인 되었습니다");
	}
	
	public void logout(String id) {
		System.out.println(id + "로그아웃 되었습니다");
		
	}

}
