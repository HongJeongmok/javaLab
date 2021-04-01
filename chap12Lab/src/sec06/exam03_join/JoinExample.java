package sec06.exam03_join;

public class JoinExample {
	// main Thread가 실행
	public static void main(String[] args) {
		// 작업 Thread를 실행
		SumThread sumThread = new SumThread();
		// 작업 Thread가 실행
		sumThread.start();
		try {
			// main Thread가 작업 Thread가 완료될때까지 일시대기상태로 있는다.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 합: " + sumThread.getSum());
	}
}

