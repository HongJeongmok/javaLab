package sec06.exam01_protected.pakage2;

import sec06.exam01_protected.pakage1.A;

public class D extends A{
	public D() {
		//super();
		this.field = "value";  // protected ���� �����ڴ� �ڽ� Ŭ���������� ������ ����Ѵ�.
		this.method();
	}

}
