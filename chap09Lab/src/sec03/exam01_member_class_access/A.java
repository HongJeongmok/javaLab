package sec03.exam01_member_class_access;

public class A {
	// �ν��Ͻ� �ʵ�
	B field1 = new B();
	C field2 = new C();
	
	// �ν��Ͻ� �޼ҵ�
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// ���� �޼ҵ�
	static void metho2() {
		/* B var1 = new B(); ���� �޼ҵ忡�� �ν��Ͻ� ��� ��ü�� ���� �� ����.*/
		C var2 = new C();  // ���� �޼ҵ忡 ���� ��� Ŭ������ ����� �� �ִ�.
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {
	}
	
	// ���� ��� Ŭ����
	static class C{
	}

}
