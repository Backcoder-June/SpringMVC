package Board;

import Board.memberDTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Repository("dao")
public class memberDAO {

	@Autowired
	SqlSession session;

	// 전체회원 조회 
    public List<memberDTO> selectAll() throws IOException {
    	List<memberDTO> memberlist = session.selectList("memberlist");
    	return memberlist;
    }

    // 한명 조회 
    public memberDTO selectonemember(String id) throws IOException {
    	return session.selectOne("onemember", id);
    }

    // 페이징으로 조회 
    public List<memberDTO> paging(int[] limit) throws IOException {
    	return session.selectList("paginglist", limit);    	
    }

    // 총인원수 
    public int getCount() {
		return session.selectOne("membercount");
	}
	
    
    
    // 검색 조회 
    public List<memberDTO> search(memberDTO dto){
    	return session.selectList("searchlist", dto);
    }

    


    
    
    
    // 회원가입 
    public void join(memberDTO dto) throws IOException {

    	session.insert("join", dto);
//    	System.out.println("dto : " + dto + dto.getPw());
//    	session.commit(); // commit 을 해줘야 실행됨! 
    	// JDBC 는 excuteUpdate 하면 바로 됬는데, Mybatis 는 commit 개념 필요
    	// commt / rollback 선택권 
    	
    }

    // 회원 정보 수정 
    public int updateMember(memberDTO dto) throws IOException {

    	int result = session.update("updatemember", dto);    
//    	session.commit();
    	return result;
    }

    // 회원 탈퇴 
    public int deleteMemeber(String id) throws IOException{

    	int result = session.delete("deletemember", id);
//    	session.commit();
    	return result; 
    }

    // 로그인 
    public int login(String userid, String userpw) throws IOException {

    	String dbpw = session.selectOne("login", userid );
    	
    	int condition = 0; 
    	if(dbpw != null) {
    		condition = 1; 
    		
    		if(userpw.equals(dbpw)) {
    			condition = 2;
    		}
    	}else { condition =3; }

    	return condition; 
    }
    	




//
}
