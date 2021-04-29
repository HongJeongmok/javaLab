package sec02_runtime_exception;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);  // 100;
		int value2 = Integer.parseInt(data2);
		// java.lang.NumberFormatException 발생한다.

	}

}
