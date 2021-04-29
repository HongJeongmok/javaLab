package sec08.exam01_method.declaration;

public class Calculator {
	// 클래스의 구성 맴버
	// 1. 필드
	// 2. 생성자
	Calculator() { // 기본 생성자
		
	}
	// 3. 메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / (double) y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
