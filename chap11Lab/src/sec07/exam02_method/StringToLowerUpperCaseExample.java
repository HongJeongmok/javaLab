package sec07.exam02_method;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));  // false �� �� ��ҹ��� ����
		System.out.println(str1.equalsIgnoreCase(str2));  // true �� �� ��ҹ��� ����x
		
		String lowerStr1 = str1.toLowerCase();  // ���ĺ� �ҹ��ڷ� ����(�빮�ں��� toUpperCase)
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1.equals(lowerStr2));  // true
		

	}

}
