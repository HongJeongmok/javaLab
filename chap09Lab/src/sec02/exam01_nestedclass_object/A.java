<<<<<<< HEAD
package sec02.exam01_nestedclass_object;

// �ٱ� Ŭ����
public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	// �ν��Ͻ� ��� Ŭ����
	public class B {
		B() {
			System.out.println("B ��ü�� ������");
		}
		int field1;
		/* static int field2;  �ν��Ͻ� ��� Ŭ���� �ȿ��� ���� �ʵ� ��� �Ұ� */
		void method1() {}
		/* static void method2() {}  ���� �޼ҵ� ��� �Ұ� */
	}
	// ���� ��� Ŭ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		}
			int fiedl1;
			static int field2;
			void method1() {}
			static void method2() {}
	}
	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}
				int fiedl1;
				// static int field;
				void method1() {}
				// static void method2() {}
		}
		D d = new D();
		d.fiedl1 = 3;
		d.method1();
	}
}
=======
package sec02.exam01_nestedclass_object;

// �ٱ� Ŭ����
public class A {
	A() {
		System.out.println("A ��ü�� ������");
	}
	// �ν��Ͻ� ��� Ŭ����
	public class B {
		B() {
			System.out.println("B ��ü�� ������");
		}
		int field1;
		/* static int field2;  �ν��Ͻ� ��� Ŭ���� �ȿ��� ���� �ʵ� ��� �Ұ� */
		void method1() {}
		/* static void method2() {}  ���� �޼ҵ� ��� �Ұ� */
	}
	// ���� ��� Ŭ����
	static class C {
		C() {
			System.out.println("C ��ü�� ������");
		}
			int fiedl1;
			static int field2;
			void method1() {}
			static void method2() {}
	}
	void method() {
		// ���� Ŭ����
		class D {
			D() {
				System.out.println("D ��ü�� ������");
			}
				int fiedl1;
				// static int field;
				void method1() {}
				// static void method2() {}
		}
		D d = new D();
		d.fiedl1 = 3;
		d.method1();
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
