<<<<<<< HEAD
package sec03.exam03_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 익명구현객체
		fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		
		// 람다식
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}











=======
package sec03.exam03_return;

public class MyFunctionalInterfaceExample { 
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		// 익명구현객체
		fi = new MyFunctionalInterface() {
			@Override
			public int method(int x, int y) {
				int result = x + y;
				return result;
			}
		};
		
		// 람다식
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> { return x + y; };
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}











>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
