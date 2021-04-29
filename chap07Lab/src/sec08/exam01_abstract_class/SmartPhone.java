package sec08.exam01_abstract_class;

public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}

	// 추상메소드를 재정의하여 일반메소드로 만든다.
	@Override
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	// 일반메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

}
