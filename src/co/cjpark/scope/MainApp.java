package co.cjpark.scope;

import co.cjpark.interfaceTest.MemberServiceImpl;
import co.cjpark.interfaceTest.Service;
import co.cjpark.interfaceTest.StudentServiceImpl;

public class MainApp {
	
	public static void main(String[] args) {
//		Member member = new Member();  //member 인스턴스 생성.
//		member.setId("Hong");
//		member.setPw("1234");
//		member.setName("홍길동");
//		member.setAddr("대구광역시 중구 국채보상로");
//		member.setTel("010-111-1111");
//		member.setGrade(1);
		
//		member.toString();		 //주석처리 시 아래 메모리에 덮어씌어진 값들만 출력이 된다.
		
		//위에서 메모리에 기록한 데이터를 여기서 덮어쓴다. (위에 to string 한걸로 값 빼내주고, 메모리에 덮어씀.)
//		member = new Member( "Park", "2345", "박승리", "서울특별시 중구 종로", "010-222-2222", 2);
//		member.insert( "Park", "2345", "박승리", "서울특별시 중구 종로", "010-222-2222", 2);
//		member.toString();
//		System.out.println(member.getId()+" " + member.getPw());	//내가원하는 값만 추출할때. get~ 쓴다
//	
		
//		Service service = new MemberServiceImpl();  //import 해야함
//		service.insert();
//		service.display();
	
		Service se2 = new StudentServiceImpl();	 //import 해야함
		se2.insert();
		se2.display();
	
	}
}
