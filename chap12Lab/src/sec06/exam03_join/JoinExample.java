<<<<<<< HEAD
package sec06.exam03_join;

public class JoinExample {
	// main Thread�� ����
	public static void main(String[] args) {
		// �۾� Thread�� ����
		SumThread sumThread = new SumThread();
		// �۾� Thread�� ����
		sumThread.start();
		try {
			// main Thread�� �۾� Thread�� �Ϸ�ɶ����� �Ͻô����·� �ִ´�.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

=======
package sec06.exam03_join;

public class JoinExample {
	// main Thread�� ����
	public static void main(String[] args) {
		// �۾� Thread�� ����
		SumThread sumThread = new SumThread();
		// �۾� Thread�� ����
		sumThread.start();
		try {
			// main Thread�� �۾� Thread�� �Ϸ�ɶ����� �Ͻô����·� �ִ´�.
			sumThread.join();
		} catch (InterruptedException e) {
		}
		System.out.println("1~100 ��: " + sumThread.getSum());
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
