package sec03.exam02_casting;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue; // ����Ÿ�� ��ȯ char(2bytes) <- (4bytes)
		// Type mismatch: cannot convert from int to char
		System.out.println(charValue);  // ��

	}

}
