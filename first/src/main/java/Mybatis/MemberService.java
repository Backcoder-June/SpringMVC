package Mybatis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class MemberService implements MemberServiceInterface{

	MemberDAO dao; 
	
	public void setDao(MemberDAO dao) {
		this.dao = dao; 
	}

	
	
	
	@Override
	public List<Board.MemberDTO> onemember(String id) {
		return dao.oneMember(id);		
	}




	@Override
	public List<MemberDTO> allMember(){
        List<MemberDTO> list = dao.getList();
		return list;
	}

	@Override
	public String registerMember(MemberDTO dto) {
		return null;		
	}
}
