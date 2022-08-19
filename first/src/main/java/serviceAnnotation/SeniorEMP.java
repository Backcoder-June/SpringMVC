package serviceAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("senior")
public class SeniorEMP implements MemberService {
	
	@Autowired
	MemberDAO dao; 
	
	
	@Override
	public void registerMember() {
		// TODO Auto-generated method stub
	
		if(dao.selectMember()==false) {
			dao.insertmember();
			dao.adminStat();
		
		}
}
	
	@Override
	public String registerMember(MemberDTO dto) {
	
		if(dao.selectMember(dto)==true) {
			dao.insertCompany(dto);
			dao.adminStat(dto);
			return "회원가입 완료"; 
		}else {return "회원가입 불가능";}
	
		
}
}