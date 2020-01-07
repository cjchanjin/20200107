package co.cjpark.scope;

public class Member {		//private 변수에 값을 전달하는 두가지 : 1. 생성자 통해서  / 2. setter 통해서 입력
	private String id;
	private String pw;
	private String name;
	private String addr;
	private String tel;
	private int grade;
	
	public Member() {		//default 생성자. 없으면 컴파일러가 컴파일 시 자동으로 만든다. 
	}							//default 생성자 만들어 놔야 나중에 출력할때 지정한 생성자 대로 값 안넣어도 됨
//	
//	public Member(String id, String pw, String name, String addr, String tel, int grade) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.grade = grade;
//	}

	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getPw() {
		return pw;
	}

	public final void setPw(String pw) {
		this.pw = pw;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getAddr() {
		return addr;
	}

	public final void setAddr(String addr) {
		this.addr = addr;
	}

	public final String getTel() {
		return tel;
	}

	public final void setTel(String tel) {
		this.tel = tel;
	}

	public final int getGrade() {
		return grade;
	}

	public final void setGrade(int grade) {
		this.grade = grade;
	}

//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", addr=" + addr + ", tel=" + tel + ", grade="
//				+ grade + "]";
//	}
	
	
//	public void insert(String id, String pw, String name, String addr, String tel, int grade) {
//		this.id = id;
//		this.pw = pw;
//		this.name = name;
//		this.addr = addr;
//		this.tel = tel;
//		this.grade = grade;
//	}
		
	public String toString () {
		System.out.print(id + " ");
		System.out.print(pw + " ");
		System.out.print(name + " ");
		System.out.print(addr + " ");
		System.out.print(tel + " ");
		System.out.println(grade + " ");
		return null;
	}
	
	
}
