package co.cjpark.interfaceTest;

import java.util.ArrayList;
import java.util.Scanner;

import co.cjpark.scope.Student;

public class StudentServiceImpl implements Service {
//	private Student student;	//전역변수 설정
	
	private ArrayList<Student> list;
	
	@Override
	public void insert() {
		Student student;
		
		list = new ArrayList<Student>();
		
		boolean b = true;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("학생 정보를 추가하겠습니까? (Y/N)");
			String yesNo = sc.nextLine();
			if(yesNo.equals("n") || yesNo.equals("N")) {
				b = false;
				break;
			}
					
		student = new Student();  //초기화
		System.out.println("학번을 입력하세요");
		student.setId(sc.nextLine());
		System.out.println("이름을 입력하세요");
		student.setName(sc.nextLine());
		System.out.println("전공을 입력하세요");
		student.setMajor(sc.nextLine());
		System.out.println("전화번호를 입력하세요");
		student.setTel(sc.nextLine());
		
		list.add(student);	//리스트에 추가
		} while(b);
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
		for(Student student : list) {
			System.out.print(student.getId() + " ");
			System.out.print(student.getName() + " ");
			System.out.print(student.getMajor() + " ");
			System.out.print(student.getTel() + " ");
		}
	}

}
