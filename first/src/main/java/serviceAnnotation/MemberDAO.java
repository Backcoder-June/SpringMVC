package serviceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class MemberDAO {

	@Qualifier("dto1")
	@Autowired
	MemberDTO dto;
	
//	MemberDAO(MemberDTO dto) {
//		this.dto = dto;
//	}


	public boolean selectMember() {
		if(dto.getId().equals("spring")&&dto.getPw()==1111){
			return true; 
		}else {return false;}
	}

	
	public void insertmember() {		
		System.out.println("회원가입 완료");
	}
	
	public void insertCompany() {
		System.out.println("회사입사 완료");
	}
	
	public void adminStat() {
		System.out.println("관리자권한부여");
	}

	
	public boolean selectMember(MemberDTO dto) {
		if(dto.getId().equals("spring")&&dto.getPw()==1111){
			return true; 
		}else {return false;}
	}

	
	public void insertmember(MemberDTO dto) {		
		System.out.println("회원가입 완료");
	}
	
	public void insertCompany(MemberDTO dto) {
		System.out.println("회사입사 완료");
	}
	
	public void adminStat(MemberDTO dto) {
		System.out.println("관리자권한부여");
	}

	
}
