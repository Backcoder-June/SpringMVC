package serviceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("junior")
public class JuniorEMP implements MemberService{

	@Autowired
	MemberDAO dao; 
	
	
	@Override
	public void registerMember() {
	
		if(dao.selectMember()==true) {
			dao.insertmember();
			dao.insertCompany();
		}else {System.out.println("회원가입 할 수 없습니다.");}
	}
	
		@Override
		public String registerMember(MemberDTO dto) {
		
			if(dao.selectMember(dto)==true) {
				dao.insertmember(dto);
				dao.insertCompany(dto);
				return "회원가입 완료"; 
			}else {return "회원가입 불가능";}
		
		
		
		
		
	}
	
	

}
