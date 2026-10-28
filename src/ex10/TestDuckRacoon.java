package ex10;

interface Duck{
	void swim();
}
interface Racoon{
	void dig();
}

class DuckRacoon implements Duck,Racoon{

	@Override
	public void dig() {
		System.out.println("땅을 팝니다.");
	}

	@Override
	public void swim() {
		System.out.println("헤엄을 칩니다.");
	}
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		DuckRacoon dr = new DuckRacoon();
		dr.dig();
		dr.swim();

	}

}
