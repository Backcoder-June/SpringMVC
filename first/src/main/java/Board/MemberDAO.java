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

@Repository
public class memberDAO {

//	@Autowired
//	private SqlSessionFactory factory;
	
	
	
    public List<memberDTO> selectAll() throws IOException {

    	SqlSessionFactoryBuilder Builder = new SqlSessionFactoryBuilder();
    	SqlSessionFactory factory = Builder.build(Resources.getResourceAsReader("Board/mybatisConfig.xml"));

    	SqlSession session = factory.openSession();
    	
    	List<memberDTO> memberlist = session.selectList("memberlist");
    	
    	
    	return memberlist;
    }

    
    
    public memberDTO selectonemember(String id) throws IOException {

    	SqlSessionFactoryBuilder Builder = new SqlSessionFactoryBuilder();
    	SqlSessionFactory factory = Builder.build(Resources.getResourceAsReader("Board/mybatisConfig.xml"));
    	SqlSession session = factory.openSession();

    	return session.selectOne("onemember", id);
    }

    public List<memberDTO> paging(int[] limit) throws IOException {

    	SqlSessionFactoryBuilder Builder = new SqlSessionFactoryBuilder();
    	SqlSessionFactory factory = Builder.build(Resources.getResourceAsReader("Board/mybatisConfig.xml"));
    	SqlSession session = factory.openSession();

    	return session.selectList("paginglist", limit);    	
    }

    
    
    

    public void join(memberDTO dto) throws IOException {

    	SqlSessionFactoryBuilder Builder = new SqlSessionFactoryBuilder();
    	SqlSessionFactory factory = Builder.build(Resources.getResourceAsReader("Board/mybatisConfig.xml"));
    	SqlSession session = factory.openSession();

    	session.insert("join", dto);
//    	System.out.println("dto : " + dto + dto.getPw());
    	session.commit(); // commit 을 해줘야 실행됨! 
    	// JDBC 는 excuteUpdate 하면 바로 됬는데, Mybatis 는 commit 개념 필요 
    	
    }

    
    public int delete(String userid) {

        int deleteResult = 0;
        Connection con = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
             con = ds.getConnection();

//sql
            String sql = "delete from servletmember where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, userid);

            deleteResult = pr.executeUpdate();

        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
            try { con.close();}
            catch ( Exception e) {}
        }

        return deleteResult;
    }


    
    
    public int login(String userid, String userpw) throws IOException {

    	SqlSessionFactoryBuilder Builder = new SqlSessionFactoryBuilder();
    	SqlSessionFactory factory = Builder.build(Resources.getResourceAsReader("Board/mybatisConfig.xml"));
    	SqlSession session = factory.openSession();

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
    	
/*        Connection con = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();


            String sql = "select id, pw from servletmember where id=?";

            PreparedStatement pt = con.prepareStatement(sql);
            pt.setString(1,userid);
            ResultSet rs = pt.executeQuery();

            String dbid= null;
            String dbpw = null;
            if (rs.next()) {
                condition=1;

                dbid = rs.getString("id");
                dbpw = rs.getString("pw");

                if (dbpw.equals(userpw)) {
                    condition=2;
                }
            } else {condition = 3; }


} catch (Exception e) { e.printStackTrace();}
finally { try {con.close(); } catch (Exception e) {} }

        return condition;
*/    


    public int edit(memberDTO dto) {

        Connection con = null;

        int editResult = 0;
        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "update servletmember set name = ? where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,dto.getName());
            pr.setString(2,dto.getId());

            editResult = pr.executeUpdate();



        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return editResult;

    }


//
}
