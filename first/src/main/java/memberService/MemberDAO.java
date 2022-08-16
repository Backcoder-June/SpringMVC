package memberService;

public class MemberDAO {

	MemberDTO dto;
	
//	MemberDAO(MemberDTO dto) {
//		this.dto = dto;
//	}

	// dto를 완전 변수처럼 보고, set 까지 해버리는 것. // 생성자로 autowired 하는거
	public void setDto(MemberDTO dto) {
		this.dto = dto;
	}


	public boolean selectMember() {
		if(dto.getId().equals("spring")&&dto.getPw()==1111){
			return true; 
		}else {return false;}
	}

	
	public void insertmember() {		
		System.out.println("회원가입 완료");
	}
	
	public void insertCompany() {
		System.out.println("회사가입 완료");
	}
	
	public void adminStat() {
		System.out.println("관리자권한부여");
	}

}
