package ex09;

//다중상속 : c++만 가능, java랑 c#은 안됨
//오리너구리 class = 오리 class + 너구리 class
class Duck{
	void swim() {
		System.out.println("헤엄을 칩니다.");
	}
}

class Racoon{
	void dig() {
		System.out.println("땅을 판다.");
	}
}

class DuckRacoon extends Duck{
	
}
public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		

	}

}
