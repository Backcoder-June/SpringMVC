package Board;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

	public class MemberDAO {

	
	
    public ArrayList<MemberDTO> selectAll() {

        Connection con = null;

        ArrayList<MemberDTO> list = new ArrayList<>();

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "select * from servletmember";

            PreparedStatement pr = con.prepareStatement(sql);

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                MemberDTO dto = new MemberDTO(resultSet.getString(1), resultSet.getString(2),
                        resultSet.getString(3));

                list.add(dto);
            }

        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return list;
    }


    public void join(MemberDTO dto) {

        int condition = 0;
        Connection con = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "insert into servletmember values(?,?,?)";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1,dto.getId());
            pr.setString(2,dto.getPw());
            pr.setString(3,dto.getName());

            int joinResult = pr.executeUpdate();

            condition = joinResult;


        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }



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


    public int login(String userid, String userpw) {

        Connection con = null;
        int condition = 0;

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
    }


    public int edit(MemberDTO dto) {

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