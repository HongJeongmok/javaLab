package sec06.exam01_protected.pakage1;

public class B {
	public void method() {
		A a = new A(); // protected ���� �����ڴ� ���� ��Ű�������� ������ ����Ѵ�.
		a.field = "value";
		a.method();
	}

}
