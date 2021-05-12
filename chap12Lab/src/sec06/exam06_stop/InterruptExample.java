<<<<<<< HEAD
package sec06.exam06_stop;

public class InterruptExample {
	public static void main(String[] args)  {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
=======
package sec06.exam06_stop;

public class InterruptExample {
	public static void main(String[] args)  {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
		thread.interrupt();
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
