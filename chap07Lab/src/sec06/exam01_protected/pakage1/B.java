package sec06.exam01_protected.pakage1;

public class B {
	public void method() {
		A a = new A(); // protected 접근 제한자는 같은 패키지에서의 접근을 허용한다.
		a.field = "value";
		a.method();
	}

}
