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
}
