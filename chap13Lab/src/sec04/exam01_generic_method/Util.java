<<<<<<< HEAD
package sec04.exam01_generic_method;

public class Util {
	// 제너릭 메소드
	// 메소드 선언 : 리턴타입 메소드명(타입 매개변수) {...}
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
=======
package sec04.exam01_generic_method;

public class Util {
	// 제너릭 메소드
	// 메소드 선언 : 리턴타입 메소드명(타입 매개변수) {...}
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
