package sec12.exam01_wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing :  기본형(stack) -> 참조형(heap)
		Integer obj1 = new Integer(100);  // 기본형 -> Integer
		Integer obj2 = new Integer("200");  // String ->Integer
		Integer obj3 = Integer.valueOf(300);  // String -> Integer
		
		// Unboxing : 참조형 -> 기본형
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}
}