<<<<<<< HEAD
package sec02.exam01_createthread;

import java.awt.Toolkit;

// Runnable 인터페이스 구현클래스
public class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

=======
package sec02.exam01_createthread;

import java.awt.Toolkit;

// Runnable 인터페이스 구현클래스
public class BeepTask implements Runnable {	
	public void run() {		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
