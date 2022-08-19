package Board;


import Board.BoardDTO;
import Board.MemberDTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BoardDAO {

    public ArrayList<BoardDTO> Allboard() {

        Connection con = null;

        ArrayList<BoardDTO> boardlist = new ArrayList<>();

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "select * from boardDTO";

            PreparedStatement pr = con.prepareStatement(sql);

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                BoardDTO dto = new BoardDTO(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));

                boardlist.add(dto);
            }

        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return boardlist;
    }

    public int saveBoard(BoardDTO boardDTO) {

        Connection con = null;
        int saveresult = 0;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "insert into boardDTO (title, contents, writer) values(?, ?, ?)";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, boardDTO.getTitle() );
            pr.setString(2, boardDTO.getContents() );
            pr.setString(3, boardDTO.getWriter() );


             saveresult = pr.executeUpdate();



        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return saveresult;
    }


    public BoardDTO myboard(int id) {

        Connection con = null;
        BoardDTO dto = null;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "select * from boardDTO where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setInt(1, id );

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                dto = new BoardDTO(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));

            }

        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return dto;
    }


    public int editBoard(BoardDTO boardDTO) {

        Connection con = null;
        int saveresult = 0;

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "update boardDTO set title = ?, contents = ? where id = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, boardDTO.getTitle() );
            pr.setString(2, boardDTO.getContents() );
            pr.setInt(3, boardDTO.getId());

            saveresult = pr.executeUpdate();



        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return saveresult;
    }

    public ArrayList<BoardDTO> fbi(String writer) {

        Connection con = null;
        BoardDTO dto = null;
        ArrayList<BoardDTO> list = new ArrayList<>();

        try {
            Context initcontext = new InitialContext();
            Context envContext = (Context) initcontext.lookup("java:/comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/backdb");
            con = ds.getConnection();

//sql
            String sql = "select * from boardDTO where writer = ?";

            PreparedStatement pr = con.prepareStatement(sql);

            pr.setString(1, writer );

            ResultSet resultSet = pr.executeQuery();


            while (resultSet.next()) {

                BoardDTO target = new BoardDTO(resultSet.getInt(1), resultSet.getString(2),
                        resultSet.getString(3), resultSet.getString(4));

                list.add(target);
            }

        } catch ( Exception e) { e.printStackTrace(); }

        finally { try { con.close(); } catch ( Exception e) {} }

        return list;
    }









    //
}


