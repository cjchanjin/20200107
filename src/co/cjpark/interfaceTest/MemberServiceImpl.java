package co.cjpark.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.cjpark.scope.Member;

public class MemberServiceImpl implements Service {

//	private Member member; // import 해줘야 한다 . 멤버클래스를 사용하기 위해 정의 (public 이런거 안하면 protected로 됨)
							// 전역변수 설정
	
	private ArrayList<Member> list;		//리스트 구조를 사용하기 위한 변수

	@Override
	public void insert() {
		Member member;		//멤버클래스를 사용하기 위해 정의
		
		list = new ArrayList<Member>();		//리스트 초기화			

		boolean b = true;   //do while 문의 조건
		Scanner sc = new Scanner(System.in);
				
		do {
			System.out.println("멤버를 추가하겠습니까? (Y/N)");
			String yesNo = sc.nextLine();
			if(yesNo.equals("N")) {
				b = false;
				break;
			}
					
			member = new Member();  //초기화
			System.out.println("아이디를 입력하세요");
			member.setId(sc.nextLine());
			System.out.println("패스워드 입력하세요");
			member.setPw(sc.nextLine());
			System.out.println("이름을 입력하세요");
			member.setName(sc.nextLine());
			System.out.println("주소를 입력하세요");
			member.setAddr(sc.nextLine());
			System.out.println("전화번호 입력하세요");
			member.setTel(sc.nextLine());
			System.out.println("등급 입력하세요");
			member.setGrade(sc.nextInt());
			sc.nextLine();
			
			list.add(member);		//리스트에 추가한다.
			} while (b);
			sc.close();
		}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		for(Member member : list ) {
			System.out.print(member.getId() + " ");
			System.out.print(member.getPw() + " ");
			System.out.print(member.getName() + " ");
			System.out.print(member.getAddr() + " ");
			System.out.print(member.getTel() + " ");
			System.out.println(member.getGrade() + " ");

		}
	}

}
