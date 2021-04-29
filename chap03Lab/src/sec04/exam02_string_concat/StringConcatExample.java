package sec04.exam02_string_concat;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String 클래스 타입
		String str1 = "JDK" + 6.0;		
		System.out.println(str1);  // "JDK6.0"
		
		String str2 = "JDK" + 3 + 3.0;  //"JDK3"+3.0 = "JDK33.0"
		System.out.println(str2);
		
		String str3 = 3 + 3.0 + "JDK";  // "33.0JDK" (X), 6.0 + "JDK" = "6.0JDK"
		System.out.println(str3);
		

	}

}
