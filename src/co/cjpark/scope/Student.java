package co.cjpark.scope;

//DTO  -> 멤버변수, 기본생성자, get-setter 만 가지고 있는 class   (Data Transfer Object)
// VO (spring frame work 에서 부르는 명칭)
//특별한 기능이 없다. data를 입출력만 하는거

public class Student {
	private String id;
	private String name;
	private String major;
	private String tel;
	
	private void student() {
		// TODO Auto-generated method stub

	}
	
	public final String getId() {
		return id;
	}

	public final void setId(String id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getMajor() {
		return major;
	}

	public final void setMajor(String major) {
		this.major = major;
	}

	public final String getTel() {
		return tel;
	}

	public final void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
