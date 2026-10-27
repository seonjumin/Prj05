package ex04;

import java.time.LocalDate;

class GirlMember{
	//fields
	private String name;
	private int bYear;
	private String role;

	//constructor
	public GirlMember(String name, int bYear, String role) {
		this.name = name;
		this.bYear = bYear;
		this.role = role;
	}
	
	//Method
	public void info() {
		int age = LocalDate.now().getYear() - this.bYear;
		System.out.printf("%s %d년생 %d살 %s\n",name,bYear,age,role);
	}

	
}

public class MemberTest {

	public static void main(String[] args) {
		GirlMember member1 = new GirlMember("원이",2004,"리더");
		member1.info();
		GirlMember member2 = new GirlMember("리브",2006,"보컬");
		member2.info();
		GirlMember member3 = new GirlMember("미나미",2006,"보컬");
		member3.info();
		GirlMember member4 = new GirlMember("메이",2008,"랩");
		member4.info();
		GirlMember member5 = new GirlMember("제나",2007,"랩");
		member5.info();

		
		//배열로 저장해서 처리
		//1. 먼저 저장할 배열을 인원수에 맞게 준비
		GirlMember[] rescArr = new GirlMember[5];
		
		rescArr[0] = member1;
		rescArr[1] = member2;
		rescArr[2] = member3;
		rescArr[3] = member4;
		rescArr[4] = member5;
		
		for(int i = 0; i<rescArr.length; i++) {
			rescArr[i].info();
		}
	}

}
