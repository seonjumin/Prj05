package ex09;

//class는 다중상속불가능
//interface를 구현하여 다중상속을 구현한다.

//다중상속 : c++만 가능, java랑 c#은 안됨
//오리너구리 class = 오리 class + 너구리 class
class Duck{
	void swim() {
		System.out.println("헤엄을 칩니다.");
	}
}

//interface
//모든 함수가 abstract 일때 해당클래스 interface를 표현가능하다.
interface Racoon{
	void dig();
}

class DuckRacoon extends Duck implements Racoon{

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
		
	}
	
}
public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();

	}

}
