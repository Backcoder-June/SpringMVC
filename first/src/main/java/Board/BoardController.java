package Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

	@Autowired
	BoardService boardservice; 

	@GetMapping("/allboard")
	public String allboard(@RequestParam(name="page", defaultValue = "1", required = false)int page ,Model model) {
	
		int totalboard = boardservice.totalnum();
	
		int totalpage = 0; 
		if( totalboard%5 == 0) {
			totalpage = totalboard/5;
		}else {
			totalpage = totalboard/5 + 1; 
		}
		
		model.addAttribute("allboard", boardservice.allboard(new int[] {(page-1)*5,5}));
		model.addAttribute("totalpage", totalpage); 
		
		return "/MVC/allboard";	
	}

	@GetMapping("/searchboard")
	public String searchboard(String item, String search, Model model) {
	
		BoardDTO bdto = new BoardDTO(); 
		
		if(item.equals("번호")) {
		bdto.setId(Integer.parseInt(search));
		}else if(item.equals("제목")) {
		bdto.setTitle(search);
		}else if(item.equals("내용")) {
		bdto.setContents(search);
		}else if(item.equals("작성자")) {
		bdto.setWriter(search);	
		}

		List<BoardDTO> searchResults = boardservice.searchBoard(bdto);
		model.addAttribute("searchResults", searchResults);

		return "/MVC/searchboard";
		
		
		/*
		 * int totalSearch = searchResults.size(); int totalpage = 0; if( totalSearch%5
		 * == 0) { totalpage = totalSearch/5; }else { totalpage = totalSearch/5 + 1; }
		 * model.addAttribute("totalpage", totalpage);
		 */	
		
	}
	
	
	@GetMapping("/myboard")
	public String myboard(@RequestParam(name = "id")int id, Model model) {
		
		BoardDTO myboard = boardservice.myboard(id); 
		
		model.addAttribute("myboard", myboard);
		
		return "/MVC/myboard";
	}

	
	@GetMapping("/boardwriting")
	public String writingform() {
		return "/MVC/boardwriting";
	}

	@PostMapping("/boardwriting")
	public String writingprocess(BoardDTO dto) {
		boardservice.saveBoard(dto);
		return "redirect:/allboard"; 
	}
	
	
	
	
	
	
}
