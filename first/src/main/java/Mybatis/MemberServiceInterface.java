package Mybatis;

import java.util.ArrayList;
import java.util.List;

public interface MemberServiceInterface {
	
	public List<MemberDTO> allMember();
	
	public List<Board.MemberDTO> onemember(String id);
	
	
	public String registerMember(MemberDTO dto);
	

}
