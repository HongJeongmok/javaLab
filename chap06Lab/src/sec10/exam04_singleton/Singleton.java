package sec10.exam04_singleton;

public class Singleton {
	// 정적 필드
	// 2. 자기 자신 타입의 필드에 객체를 생성하여 대입시키고 private static(같은 클래스 내에서만 공유)으로 설정한다.
	private static Singleton singleton = new Singleton();
	
	// 생성자
	// private 접근 제한자로써 같은 클래스에서만 접근을 허용한다.
	// 1. 생성자를 private 접근 제한자로 설정하여 외부 클래스에서 객체를 만들지 못하도록 한다.
	private Singleton() {}
	
	// 정적 메소드
	// 3. 리턴타입을 자신 타입으로 한 getInstance 메소드를 정의하여 자기 자신의 객체가 할당된 필드를 반환하도록 한다.
	static Singleton getInstance() {
		return singleton;
	}

}
