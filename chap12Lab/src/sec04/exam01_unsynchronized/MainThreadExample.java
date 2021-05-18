<<<<<<< HEAD
package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
=======
package sec04.exam01_unsynchronized;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
