package upload;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

	UploadDTO uploaddto;
	

	public void setUploaddto(UploadDTO uploaddto) {
		this.uploaddto = uploaddto;
	}


	@GetMapping("/fileupload")
	public String uploadform() {
		return "upload/uploadform";
	}

	
	  @PostMapping("/fileupload") 
	  public String uploadprocess(UploadDTO dto, Model model) throws IOException { 
		  
		  //file1, file2 파일의 이름/내용 정도만 뽑아서 사용하자.
		  // => 서버의 c:\\upload 폴더에 저장 

		  String savePath = "c:/upload/"; 

		  // 요청으로 들어온 업로드 파일
		  MultipartFile mf1 = dto.getFile1();
		  if(!mf1.isEmpty()) {
		  // 업로드한 파일명 그대로 
		  String originalname1 = mf1.getOriginalFilename();
		  // 확장차 뺀 파일명  
		  String onlyfilename = originalname1.substring(0, originalname1.indexOf("."));
		  // 확장자 명
		  System.out.println(originalname1);
		  String extname = originalname1.substring(originalname1.indexOf("."));
		  String newname = onlyfilename + "(" + UUID.randomUUID().toString()+")" + extname; 
		  File serverfile1 = new File(savePath + newname); 
		  mf1.transferTo(serverfile1);
		  }
		  
		  
		  // mf2 도 마찬가지로 위처럼 잡아주면 된다. 없으면 실행 안하게 끔 
//		  MultipartFile mf2 = dto.getFile2();

		  
		  
		  
		  
//		  System.out.println("작성자 : " + dto.getName());
//		  System.out.println("설명 : " + dto.getDescription());
		  

		  // getOriginalFileName : 업로드한 파일명 그대로 
//		  System.out.println(mf1.getOriginalFilename());
//		  System.out.println(mf2.getOriginalFilename());

		  // 뷰단에서 꺼내쓰기 : ${dto.file1.originalFilename} 
		  
		  // getSize : 파일의 총 길이 byte 단위   
//		  System.out.println(mf1.getSize());
//		  System.out.println(mf2.getSize());

		  
		  //업로드된 파일을 서버에 저장할 경로 지정 
		  //폴더 없으면 자동생성.
		  
		  //파일명 추출 
//		  String originalname2 = mf2.getOriginalFilename();
		  
		  // java.io.File 클래스
    	  // 이 경로에 추출한 이름으로 ( 받아온 이름그대로 ) 빈파일 껍데기 하나 생성 
//		  File serverfile2 = new File(savePath + originalname2); 
	
		  //이제 요청에서 업로드된 파일을 이 빈파일에다가 옮기는것(복사)  
//		  mf2.transferTo(serverfile2);
		  
		  model.addAttribute("dto", dto); 
		  return "upload/uploadprocess"; 
	  }
}
