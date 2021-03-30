package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));  // false 값 비교 대소문자 구분
		System.out.println(str1.equalsIgnoreCase(str2));  // true 값 비교 대소문자 구분x
		
		String lowerStr1 = str1.toLowerCase();  // 알파벳 소문자로 변경(대문자변경 toUpperCase)
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));  // true
		

	}

}
