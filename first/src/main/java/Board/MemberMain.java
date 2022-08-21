package Board;

import java.io.IOException;

import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MemberMain {


	public static void main(String[] args) throws IOException {

		MemberService service = new MemberService();
	
		//전체회원정보조회 
List<memberDTO> memberlist = service.allMember();

for(memberDTO aaaa : memberlist) { System.out.println(aaaa);
  }
 

		//한명정보 조회
memberDTO onemember = service.oneMember("backcoder");

System.out.println("찾은 멤버 : " + onemember);


		// 페이징 - sql에서는 해당 개수만 가져오는게 끝 
// limit 에 숫자 더하는 로직걸두고, 리턴값을 각 [1] [2] 페이지롤 걸어두면 페이징 완성 

int[] limit= {0, 4};

int i = 1; 
System.out.println("=====");
List<memberDTO> list3 = service.paginglist(limit);
for(memberDTO dto : list3) {
	System.out.println(i +"번째 " + dto);
	i++;
}
System.out.println("=====");



// join 
memberDTO dto1 = new memberDTO("apple", "2222", "honey");

service.joinmember(dto1);

memberDTO result = service.oneMember(dto1.getId());

System.out.println("회원가입 결과 : "+result);






	}

}
