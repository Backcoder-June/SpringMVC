package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadController {
	
	
	@GetMapping("/filedownloadlist")
	public String filelist(Model model) {
		File f = new File("c:/upload"); // 디렉토리/파일 접근 가능한 정보 객체 
		String[] fileArray = f.list();  // 파일목록 String[] 으로 리턴 
		
		model.addAttribute("fileArray", fileArray); 
	
		return "upload/downloadlist"; 
	}


	// void 타입으로 주면 URL 명과 같은 jsp 파일(views폴더아래)로 return 시킨다. 
	// setContentType("upload/downloadlist") 로 잡으면 => 리턴에 view 파일을 리턴하지 않는다. 
	
	@GetMapping("/fileDownResult")
	public void downresult(String filename, HttpServletResponse resp) throws IOException {

		// 해당 파일불러오기  
		File f = new File("c:/upload/" + filename); 

		
		// 파일길이 필요함 
		int length = (int)f.length();
		
		
		
		// 3총사 세팅 
		resp.setContentType("application/download");
		resp.setContentLength(length);
		resp.setHeader("Content-Disposition", "attachment; filename=\""+filename+"\"");

		
		
		// OutputStream 사용 응답 
		// java.io 객체들 
		FileInputStream fin = new FileInputStream(f);
		OutputStream out = resp.getOutputStream(); 
		FileCopyUtils.copy(fin, out); 
	
		
		
		//Stream 닫아주기 
		fin.close(); 
		out.close(); 
		
		
		// fin : 다룬로드 파일내용 / out : 브라우저 
				
		
	}

	
	
	
	
	
	
	
}
