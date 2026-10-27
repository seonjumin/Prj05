package ex02;

class Car{
	String name;
	String color;
	int year;
	
	void info(){
		System.out.println("차이름: "+ name);
		System.out.println("색상: "+ color);
		System.out.println("연식: "+ year);
		
	}
	
}

public class TestCar02 {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "아빠차";
		car1.color = "black";
		car1.year = 2023;
		car1.info();
		
		Car car2 = new Car();
		car2.name = "엄마차";
		car2.color = "red";
		car2.year = 2026;
		car2.info();
	}

}
