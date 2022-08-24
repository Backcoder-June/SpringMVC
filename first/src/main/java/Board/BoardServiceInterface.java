package Board;

import java.util.List;

public interface BoardServiceInterface {
	
	public List<BoardDTO> allboard(int[] limit);

	public BoardDTO myboard(int id);
	
	public int saveBoard(BoardDTO dto);
	
	public int totalnum();

	public List<BoardDTO> searchBoard(BoardDTO dto);

	public void deleteBoard(int id);

	public void editBoard(BoardDTO dto);      
	
	
	
	//
}
