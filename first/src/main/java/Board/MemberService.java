package Board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService implements MemberServiceInterface{

	memberDAO dao = new memberDAO();
	

	@Override
	public void joinmember(memberDTO dto) throws IOException {
		
		dao.join(dto);
	}




	@Override
	public List<memberDTO> paginglist(int[] limit) throws IOException{
		return dao.paging(limit);
	}

	
	
	
	@Override
	public memberDTO oneMember(String id) throws IOException {

		memberDTO onemember = dao.selectonemember(id);
		
		return onemember;
	}




	// 전체조회 
	@Override
	public List<memberDTO> allMember() throws IOException{

		List<memberDTO> memberlist = dao.selectAll();
		return memberlist;
	}

	
	

	// 등록 
	@Override
	public String registerMember(memberDTO dto) {
	
		return null;		
		
	}


}
