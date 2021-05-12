<<<<<<< HEAD
package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();  // 작업 Thread 생성한다.
		autoSaveThread.setDaemon(true);  // 작업 Thread를 데모 Thread로 만든다.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
=======
package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();  // 작업 Thread 생성한다.
		autoSaveThread.setDaemon(true);  // 작업 Thread를 데모 Thread로 만든다.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("메인 스레드 종료");
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
