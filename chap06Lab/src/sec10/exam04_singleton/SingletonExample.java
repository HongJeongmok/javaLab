package sec10.exam04_singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton obj1 = new Singleton();  // The constructor Singleton() is not visible
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1==obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}

	}

}
