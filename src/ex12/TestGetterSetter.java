package ex12;

class Emp {
	//fields
	private String name;
	private int eno;
	private String phone;
	
	//기본 생성자
	public Emp() {
		
	}
	//생성자
	public Emp(int eno, String name, String phone) {
		this.eno = eno;
		this.name = name;
		this.phone = phone;
	}

	//method
		public void info() {
			System.out.printf("%d %s %s\n",eno, name, phone);
		}
	
	//Getter/Setter : 형태 함수
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
}

public class TestGetterSetter {

	public static void main(String[] args) {
		//getter,setter이용 -하나씩 수정할 때 용이
		Emp emp1 = new Emp();	
		emp1.setEno(1);
		emp1.setName("장원영");
		emp1.setPhone("010-2222-3333");
		System.out.printf("%d %s %s\n",emp1.getEno(), emp1.getName(), emp1.getPhone());
				
//		int num = emp1.getEno();
//		System.out.println(num);

		//	생성자 사용	
		Emp emp2 = new Emp(2,"카리나","010-1111-2222");
		emp2.info();
	}

}
