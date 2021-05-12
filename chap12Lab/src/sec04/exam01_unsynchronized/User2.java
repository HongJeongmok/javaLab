<<<<<<< HEAD
package sec04.exam01_unsynchronized;

public class User2 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
=======
package sec04.exam01_unsynchronized;

public class User2 extends Thread {	
	private Calculator calculator;
	
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	public void run() {
		calculator.setMemory(50);
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
