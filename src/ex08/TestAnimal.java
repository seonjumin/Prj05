package ex08;
//abstract (추상) class : new 불가능.
abstract class Animal{
	String name;
	void eat(String food) {
		System.out.println(name + "(이)가"+food+"을 먹는다.");
	}
	// <------ 모든 동물들의 공통되는 부분
	abstract void sound(); //코딩이 없는 함수를 만든다.
	// <-------동물마다 메서드의 이름은 같지만 내용이 다른부분, 각자의 클래스에서 정의할 것이다.
}

class Dog extends Animal{
	/*String name;
	void eat(String food) {
		System.out.println(name + "(이)가"+food+"을 먹는다.");
	} -> 이걸 Animal부모클래스로 뺀 것*/
	@Override //재정의 abstract 메소드를 자식이 다시 작성함.
	void sound() {
		System.out.println(super.name + "이 멍멍");
	}
}

class Cat extends Animal{

	@Override
	void sound() {
		System.out.println(super.name + "이 야옹");
	}
}

class Tiger extends Animal{

	@Override
	void sound() {
		System.out.println(super.name + "이 어흥");
	}
}
public class TestAnimal {

	public static void main(String[] args) {
		Dog chu = new Dog();
		work(chu, "츄", " 개껌");
		
		Cat nero = new Cat();
		work(nero, "네로", "츄르");
		
		Tiger neo = new Tiger();
		work(neo, "네오","고기");

	}

	private static void work(Animal animal, String name, String food) {
		animal.name = name;
		animal.eat(food);
		animal.sound();
		
	}

}
