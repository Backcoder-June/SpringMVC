package Mybatis;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import Board.MemberDTO;

public class MemberMain {


//	public void setService(MemberService service) {
//		this.service = service;
//	}

	public static void main(String[] args) throws IOException {

		MemberService service = new MemberService();
		
	 
	SqlSessionFactoryBuilder builder= new SqlSessionFactoryBuilder();
	//SQL 파일들 읽어오고 관리해주는 놈
	SqlSessionFactory factory = builder.build(Resources.getResourceAsReader("Mybatis/mybatisConfig.xml"));
	
	//db연결 // 
SqlSession session = factory.openSession();


//   sql 실행 

List<MemberDTO> list = session.selectList("memberlist"); 

//
//for(MemberDTO aaaa : list) { System.out.println(aaaa);
//  }
 
//Scanner scanner = new Scanner(System.in); 
//
//System.out.print("조회할 사람 입력 : ");
//
//String key =scanner.nextLine(); 


 
// List<MemberDTO> list2 = session.selectList("onemember", "june");


List<MemberDTO> list2 = service.onemember("june"); 

for(MemberDTO a : list2 ) {
	
	System.out.println(a+"a");
	
}





	}

}
