package ex03;

class Member{
	private String name;
	private int bYear;
	private String role;
	
	//OvrLoading - 같은 이름의 생성자가 (인자가 다른) 여러개 있다.
	public Member() {
		System.out.println("hi");
	}
	public Member(String name,int bYear, String role){
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	public void info(){
		System.out.printf("%s %d %s\n", name, bYear, role);
	}
	
	
}

public class MemberTest {

	public static void main(String[] args) {
		//private 변수에 값을 넣는 방법 2가지
		//1. 생성자를 이용
		Member r0 = new Member();
		
		Member r1 = new Member("원이", 2004, "리더");
		r1.info();
		
	}

}
