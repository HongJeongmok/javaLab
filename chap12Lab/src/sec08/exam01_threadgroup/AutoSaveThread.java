<<<<<<< HEAD
package sec08.exam01_threadgroup;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
=======
package sec08.exam01_threadgroup;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
