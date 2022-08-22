package Board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class MemberService implements MemberServiceInterface{

	@Autowired
	memberDAO dao;

	
	@Override
	public int login(String id, String pw) throws IOException {
		int condition = dao.login(id, pw);
		
		return condition; 
	}

	@Override
	public void joinmember(memberDTO dto) throws IOException {
		
		dao.join(dto);
	}


	@Override
	public int updateMember(memberDTO dto) throws IOException {
		
		/*
		 * int condition = dao.login(dto.getId(), dto.getPw());
		 * 
		 * if(condition==2) { int result = dao.updateMember(dto); return result; } else
		 * {return 0;}
		 */
		int result = dao.updateMember(dto);
		return result;
	}

	@Override
	public int deleteMember(String id, String pw) throws IOException {

		int condition = dao.login(id, pw); 
		
		if(condition ==2) {
			dao.deleteMemeber(id);
		}
		return 0;
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

	// 페이징하기 위한 전체 회원수 구해오기 
	@Override
	public int getTotalMember() {
		return dao.getCount();
	}

	
	
	
	// 전체조회 
	@Override
	public List<memberDTO> allMember() throws IOException{

		List<memberDTO> memberlist = dao.selectAll();
		return memberlist;
	}

	// 검색조회 

	@Override
	public List<memberDTO> search(memberDTO dto) {
		
		return dao.search(dto);
		
	}

	// 등록 
	@Override
	public String registerMember(memberDTO dto) {
	
		return null;		
		
	}


}
