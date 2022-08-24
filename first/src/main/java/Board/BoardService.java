package Board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements BoardServiceInterface {

	@Autowired
	BoardDAO boarddao; 
	
	@Override
	public List<BoardDTO> allboard(int[] limit) {
		return boarddao.Allboard(limit); 
	}

	@Override
	public void editBoard(BoardDTO dto) {
		boarddao.editBoard(dto);
	}






	@Override
	public BoardDTO myboard(int id) {
		
		boarddao.viewcount(id);
		
		return boarddao.Myboard(id);
	}


	@Override
	public int saveBoard(BoardDTO dto) {
		return boarddao.insertBoard(dto);
	}

	
	@Override
	public void deleteBoard(int id) {
		boarddao.deleteBoard(id);
	}




	@Override
	public int totalnum() {
		return boarddao.totalBoardNum();
	}




	@Override
	public List<BoardDTO> searchBoard(BoardDTO dto) {
		return boarddao.searchBoard(dto);
	}


	
	
	
	
	
	

}
