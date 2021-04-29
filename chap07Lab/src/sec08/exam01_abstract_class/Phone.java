package sec08.exam01_abstract_class;

public abstract class Phone {
	// 추상 클래스의 구성 멤버
	// 1. 필드
	public String owner;
	
	// 2. 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// 3. 추상메소드 : 실행문이 없다. 그래서 상속받는 자식 클래스에서 꼭 재정의 해야한다.
	public abstract void turnOff();
	
	// 4. 일반메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

}
