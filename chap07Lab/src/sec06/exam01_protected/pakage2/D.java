package sec06.exam01_protected.pakage2;

import sec06.exam01_protected.pakage1.A;

public class D extends A{
	public D() {
		//super();
		this.field = "value";  // protected 접근 제한자는 자식 클래스에서의 접근을 허용한다.
		this.method();
	}

}
