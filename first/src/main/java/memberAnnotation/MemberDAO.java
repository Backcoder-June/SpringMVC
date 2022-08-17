package memberAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dao")
public class MemberDAO {

	@Autowired
	MemberDTO dto;
		
//	@Autowired
//	MemberDAO(MemberDTO dto) {
//		this.dto = dto; }

		


	public boolean selectMember() {
		
		dto.setId("spring");
		dto.setName("whatever");
		dto.setPw(1112);
	
		
		if(dto.getId().equals("spring")&&dto.getPw()==1111){
			return true; 
		}else { return false;}
	}

	
	public void insertmember() {		
		System.out.println("회원가입 완료");
	}

}
