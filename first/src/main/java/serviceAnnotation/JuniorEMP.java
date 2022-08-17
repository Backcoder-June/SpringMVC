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
		}
		
		
		
		
	}
	
	

}
