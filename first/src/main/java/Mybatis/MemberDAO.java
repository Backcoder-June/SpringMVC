package Mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {
	
	SqlSession session; 

	// 일단 Spring 없으니 세터로 
	public void setSessioin(SqlSession session) {
		this.session= session;
	}
	
	
	public List<MemberDTO> getList(){
		return session.selectList("memberlist");
		
	}
		

	public List<Board.MemberDTO> oneMember(String id){
		return session.selectList("onemember", id ); 	
	}
	
	

}
