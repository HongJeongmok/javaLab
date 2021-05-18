<<<<<<< HEAD
package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// Main Thread가 main() 메소드를 실행한다.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
=======
package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample1 {
	// Main Thread가 main() 메소드를 실행한다.
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
		}

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
