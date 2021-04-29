package sec04.exam01_abstract_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		// Television 구현객체
		rc = new Television();
		rc.turnOn();  // Television 객체의 turnOn() 실제메소드가 실행되는 것이다.
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();  // Audio 객체의 turnOn() 실제메소드가 실행되는 것이다.
		rc.turnOff();

	}

}
