<<<<<<< HEAD
package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();  // �۾� Thread �����Ѵ�.
		autoSaveThread.setDaemon(true);  // �۾� Thread�� ���� Thread�� �����.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("���� ������ ����");
	}
}
=======
package sec07.exam01_daemon;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();  // �۾� Thread �����Ѵ�.
		autoSaveThread.setDaemon(true);  // �۾� Thread�� ���� Thread�� �����.
		autoSaveThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		System.out.println("���� ������ ����");
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
