package sec02.exam01_none_generic_type;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");  // 형변환, String -> Object
		String name = (String) box.get();  // 형변환, String -> String
		
		box.set(new Apple());  // 형변환, Apple -> Object
		Apple apple = (Apple) box.get();  // 형변환, Object -> Apple
	}

}
