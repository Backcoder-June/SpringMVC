package Board;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface MemberServiceInterface {
	
	public List<memberDTO> allMember() throws IOException;

	public memberDTO oneMember(String id) throws IOException; 
	
	public String registerMember(memberDTO dto);

	public List<memberDTO> paginglist(int[] limit) throws IOException;

	public void joinmember(memberDTO dto) throws IOException;
	
	public int login(String id, String pw) throws IOException; 
	
	public int updateMember(memberDTO dto) throws IOException;

	public int deleteMember(String id, String pw) throws IOException;

	public int getTotalMember();
		
	public List<memberDTO> search(memberDTO dto); 
}
