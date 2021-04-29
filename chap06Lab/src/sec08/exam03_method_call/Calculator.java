package sec08.exam03_method_call;

public class Calculator {
	// 1. 필드
	// 2. 생성자
	// 3. 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y); // 내부 메소드 호출
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10); // 내부 메소드 호출
		System.out.println(result);
	}
	
	void println(String message) {
		System.out.println(message);
	}

}
