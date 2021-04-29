package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		//how1
		Thread thread = new BeepThread();
		
		//how2
		/*Thread thread = new Thread() {
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		};*/ 
		
		
		thread.start();  // 작업 thread가 수행
		
		// Main thread가 수행
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}

