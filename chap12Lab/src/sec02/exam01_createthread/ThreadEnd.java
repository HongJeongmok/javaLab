package sec02.exam01_createthread;

// ThreadEnd Thread�� ���� Ŭ����
public class ThreadEnd extends Thread {

	@Override
	public void run() {
		// thread�� ���۵Ǹ� ����Ǵ� ����
		for (int i = 1; i <= 20; i++) {
			System.out.println("run number = " + i);
		}
	}

	public static void main(String[] args) {
		Thread te = new ThreadEnd();
		// ThreadEnd te = new ThreadEnd();
		
		// �۾�thread�� ���� thread�� �����Ŵ
		te.start();
		
		// Main Thread�� ����
		// main()������ ȭ�鿡 101���� 120���� ���
		for (int i = 101; i <= 120; i++) {
			System.out.println("-------> main number = " + i);
		}
	}

}