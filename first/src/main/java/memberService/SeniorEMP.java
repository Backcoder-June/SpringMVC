package memberService;

public class SeniorEMP implements MemberService {
	
	MemberDAO dao; 
	
	public void setDao(MemberDAO dao) {
		this.dao = dao; 
	}
	// 이거 생성자에 넣는거 == 세터로 변수처럼 사용하는 거.
	
	
	@Override
	public void registerMember() {
		// TODO Auto-generated method stub
	
		if(dao.selectMember()==false) {
			dao.insertmember();
			dao.adminStat();
		
		}


}
}
