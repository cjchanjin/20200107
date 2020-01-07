package co.cjpark.interfaceTest;

public interface Service {
		/* class 가 아니라 interface
		함수원형만 가지고 있다. 나머지는 니마음대로 override해라 */
	
		public void insert();   //입력
		public void update();	//변경
		public void delete();	//삭제
		public void display();	//조회, 화면출력
		
}
