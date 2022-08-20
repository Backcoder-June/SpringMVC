package Board;

import Board.BoardDAO;

import Board.BoardDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class BoardController {

	@Autowired
	MemberService service; 
	
	
	@GetMapping("/home")
	public String home() {
		
		return "/MVC/Home"; 
	}

@GetMapping("/allmembers")
public String allmembers(Model model) throws IOException  {
	List<memberDTO> memberlist = service.allMember();

	model.addAttribute("allmember", memberlist);

	return "/MVC/allmember";

}
	

	
	@GetMapping("/memberlist")
	public String allmember(Model model) {

		BoardDAO dao = new BoardDAO();
    List<BoardDTO> list = dao.Allboard();

    
            model.addAttribute("allmember",list);
            return "/MVC/allmember";             	
	}

	
	
	
	/*    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String service = req.getParameter("menu");
        String jspfile ="";


        //로그인 세션
        //( 로그인이 없을시 Guest 만들기 위해 굳이 세션을 생성하면 낭비다 =>
        // VIEW 단에서 조종하자. )

        if (service.equalsIgnoreCase("로그인")) {
            if (req.getParameter("id") != null) {

                String id = req.getParameter("id");
                String pw = req.getParameter("pw");

                memberDAO dao = new memberDAO();
                int condition = dao.login(id, pw);


                if (condition == 2) {

                    HttpSession idsession = req.getSession();
                    idsession.setAttribute("userid", id);

                    jspfile = "/MVC/logined_Home.jsp";
                } else if (condition == 1 || condition == 3) {

                    jspfile = "/MVC/loginFail.jsp";
                }
            }
        }


        //로그아웃  세션지우기
        if (service.equalsIgnoreCase("로그아웃")) {
            HttpSession logoutSession = req.getSession();
            logoutSession.removeAttribute("userid");
            jspfile = "/MVC/Home.jsp";
        }


        //전체회원조회
        if (service.equalsIgnoreCase("memberlist")) {
            memberDAO dao = new memberDAO();
            ArrayList<memberDTO> list = dao.selectAll();
            req.setAttribute("allmember", list );
            jspfile = "/MVC/allmember.jsp";
        }


        //전체 게시판 조회
        if (service.equalsIgnoreCase("allboard")) {
            BoardDAO bdao = new BoardDAO();

            ArrayList<BoardDTO> allboard = bdao.Allboard();
            req.setAttribute("allboard", allboard);
            jspfile = "/MVC/allboard.jsp";
        }

        // 게시물 작성
        if (service.equalsIgnoreCase("boardwriting")) {
            jspfile = "/MVC/boardwriting.jsp";
        }

        // post 로 옮길것들 따로 다 모아서 getPost로 옮기면 된다.
        // para 테스트용도로 일단 get
        if (service.equalsIgnoreCase("작성")) {
            BoardDTO boardDTO = new BoardDTO();

            boardDTO.setTitle(req.getParameter("title"));
            boardDTO.setContents(req.getParameter("contents"));
            boardDTO.setWriter(req.getParameter("writer"));

            BoardDAO boardDAO = new BoardDAO();
            boardDAO.saveBoard(boardDTO);

            jspfile = "/MVC/boardsuccess.jsp";
        }

        // 회원가입
        if (service.equalsIgnoreCase("회원가입")) {

            memberDTO dto = new memberDTO(req.getParameter("id"), req.getParameter("pw"), req.getParameter("name"));
            memberDAO dao = new memberDAO();

            int condition = dao.login(req.getParameter("id"), req.getParameter("pw"));
            if (condition==3) {
                dao.join(dto);
                jspfile = "/MVC/joinsuccess.jsp";
            } else {
                jspfile = "/MVC/joinfail.jsp";
            }

        }

        //회원탈퇴
        if (service.equalsIgnoreCase("회원탈퇴")) {

            memberDAO dao = new memberDAO();

            int condition = dao.login(req.getParameter("id"), req.getParameter("pw"));

            if (condition == 2) {

                dao.delete(req.getParameter("id"));
                // 세션도 같이 삭제 해줘야지
                HttpSession deleteSession = req.getSession();
                deleteSession.invalidate();

                jspfile = "/MVC/deletesuccess.jsp";
            }else {
                jspfile = "/MVC/deletefail.jsp";
            }
        }


        // 게시물 하나씩 보기
        if (service.equalsIgnoreCase("myboard")) {
            BoardDAO dao = new BoardDAO();

            BoardDTO myboard = dao.myboard(Integer.parseInt(req.getParameter("id")));
            req.setAttribute("myboard", myboard);
            jspfile = "/MVC/myboard.jsp";

        }

        // 수정 페이지
        if (service.equalsIgnoreCase("수정하기")) {

            BoardDAO dao = new BoardDAO();
            BoardDTO target = dao.myboard(Integer.parseInt(req.getParameter("id")));

            req.setAttribute("myboard", target);

            jspfile = "/MVC/boardediting.jsp";
        }

        // 수정
        if (service.equalsIgnoreCase("수정")) {
            BoardDTO dto = new BoardDTO();

            dto.setId(Integer.parseInt(req.getParameter("id")));
            dto.setTitle(req.getParameter("title"));
            dto.setContents(req.getParameter("contents"));
            dto.setWriter(req.getParameter("writer"));

            BoardDAO dao = new BoardDAO();
            dao.editBoard(dto);

            req.setAttribute("myboard", dto );
             jspfile = "/MVC/myboard.jsp";
        }

        // 본인이 작성한 게시판 글 목록
        if (service.equalsIgnoreCase("FBI")) {
            HttpSession session2 = req.getSession();
            String sessionid = (String)session2.getAttribute("userid");

            BoardDAO dao = new BoardDAO();
            ArrayList<BoardDTO> fbi = dao.fbi(sessionid);
            req.setAttribute("fbi", fbi);
            jspfile = "/MVC/FBIboards.jsp";
        }


        RequestDispatcher rd = req.getRequestDispatcher(jspfile);
        rd.forward(req, resp);
*/

    }
