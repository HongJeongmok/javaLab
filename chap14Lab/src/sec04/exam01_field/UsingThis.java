<<<<<<< HEAD
package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	// 인스턴스 멤버 클래스
	class Inner {
		int innerField = 20;

		void method() {
			// 람다식
			MyFunctionalInterface fi= () -> {
				System.out.println("outterField : " + outterField);  // outterField : 10
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");  // Using This.this 는 밖의 객체
				
				System.out.println("innerField : " + innerField);  // innerField : 20
				System.out.println("innerField : " + this.innerField + "\n");  // this. 는 안쪽 객체
			};
			fi.method();                            
		}
	}
}

=======
package sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	// 인스턴스 멤버 클래스
	class Inner {
		int innerField = 20;

		void method() {
			// 람다식
			MyFunctionalInterface fi= () -> {
				System.out.println("outterField : " + outterField);  // outterField : 10
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");  // Using This.this 는 밖의 객체
				
				System.out.println("innerField : " + innerField);  // innerField : 20
				System.out.println("innerField : " + this.innerField + "\n");  // this. 는 안쪽 객체
			};
			fi.method();                            
		}
	}
}

>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
