package sec05.exam05_instanceof;

public class Bus implements Vehicle {

	// 반드시 추상메소드를 재정의 한다.
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");

	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
