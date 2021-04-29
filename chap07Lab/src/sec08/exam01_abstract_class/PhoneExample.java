package sec08.exam01_abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// Cannot instantiate the type Phone
		// Phone phone = new Phone("홍길동"); // 추상클래스는 객체를 만들 수 없다.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}

}
