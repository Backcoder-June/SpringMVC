package Board;

import java.util.ArrayList;

public interface MemberServiceInterface {
	
	public ArrayList<MemberDTO> allMember();

	
	public String registerMember(MemberDTO dto);
	

}
