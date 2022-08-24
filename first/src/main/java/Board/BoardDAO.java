package Board;


import Board.BoardDTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Repository("boarddao")
public class BoardDAO {
	
	@Autowired
	SqlSession session; 
	
	
	//전체 게시판 조회 
    public List<BoardDTO> Allboard(int[] limit) {
    	return session.selectList("allboard", limit);     	
    }

    //해당 게시글 조회 
    public BoardDTO Myboard(int id) {
    	
    	return session.selectOne("boardid", id);
    	
    }

    public int insertBoard(BoardDTO dto) {
    	int result = session.insert("insertboard", dto);

// 왜 commit이 자동으로 되지? true 설정 안하고 bean 에서 그냥 생성해둔건데 
//    	session.commit();
    	
    	return result; 
    }
    
    // 총 게시물 수 
    public int totalBoardNum() {
    	return session.selectOne("totalnum");
    }
    
    
    public List<BoardDTO> searchBoard(BoardDTO dto){
//    	session.selectList("searchboard", searchLimit);
    	return session.selectList("searchboard", dto);
    	
    }


    public void viewcount(int id) {
    	session.update("viewcount", id); 
    }

    public void deleteBoard(int id) {
    	session.delete("deleteId", id); 
    }
    
    public BoardDTO fbi(int id) {
    	return session.selectOne("fbi", id); 
    }
    
    public void editBoard(BoardDTO dto) {
    	
    	session.update("editBoard", dto);
    }
    
    
    
	/*
	 * public int saveBoard(BoardDTO boardDTO) {
	 * 
	 * Connection con = null; int saveresult = 0;
	 * 
	 * try { Context initcontext = new InitialContext(); Context envContext =
	 * (Context) initcontext.lookup("java:/comp/env"); DataSource ds = (DataSource)
	 * envContext.lookup("jdbc/backdb"); con = ds.getConnection();
	 * 
	 * //sql String sql =
	 * "insert into boardDTO (title, contents, writer) values(?, ?, ?)";
	 * 
	 * PreparedStatement pr = con.prepareStatement(sql);
	 * 
	 * pr.setString(1, boardDTO.getTitle() ); pr.setString(2, boardDTO.getContents()
	 * ); pr.setString(3, boardDTO.getWriter() );
	 * 
	 * 
	 * saveresult = pr.executeUpdate();
	 * 
	 * 
	 * 
	 * } catch ( Exception e) { e.printStackTrace(); }
	 * 
	 * finally { try { con.close(); } catch ( Exception e) {} }
	 * 
	 * return saveresult; }
	 */

	/*
	 * public BoardDTO myboard(int id) {
	 * 
	 * Connection con = null; BoardDTO dto = null;
	 * 
	 * try { Context initcontext = new InitialContext(); Context envContext =
	 * (Context) initcontext.lookup("java:/comp/env"); DataSource ds = (DataSource)
	 * envContext.lookup("jdbc/backdb"); con = ds.getConnection();
	 * 
	 * //sql String sql = "select * from boardDTO where id = ?";
	 * 
	 * PreparedStatement pr = con.prepareStatement(sql);
	 * 
	 * pr.setInt(1, id );
	 * 
	 * ResultSet resultSet = pr.executeQuery();
	 * 
	 * 
	 * while (resultSet.next()) {
	 * 
	 * dto = new BoardDTO(resultSet.getInt(1), resultSet.getString(2),
	 * resultSet.getString(3), resultSet.getString(4));
	 * 
	 * }
	 * 
	 * } catch ( Exception e) { e.printStackTrace(); }
	 * 
	 * finally { try { con.close(); } catch ( Exception e) {} }
	 * 
	 * return dto; }
	 */

    







    //
}


