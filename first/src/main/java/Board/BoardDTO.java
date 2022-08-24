package Board;

import org.springframework.stereotype.Component;

@Component("boarddto")
public class BoardDTO {

    private int id;
    private String title;
    private String contents;
    private String writer;
    private int viewcount;
    
    public BoardDTO(int id, String title, String contents, String writer, int viewcount) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
        this.viewcount = viewcount;
    }
    
    
    public BoardDTO(){}


    
    
    
    
    public int getViewcount() {
		return viewcount;
	}


	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}


	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}

