package sec05.exam01_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {
		// Anonymous 객체 생성
		Anonymous anony = new Anonymous();
		
		// 익명자식객체의 wake() 메소드를 사용한다.
		anony.field.wake();
		
		// 로컬 변수에 익명자식객체를 사용한다.
		anony.method1();
		
		// 매개변수에 익명자식객체를 사용한다.
		anony.method2(new Person() {
			void  study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		
	}

}
