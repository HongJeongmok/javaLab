<<<<<<< HEAD
package sec06.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}

=======
package sec06.exam02_yield;

public class ThreadB extends Thread {	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB �۾� ����");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB ����");
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
