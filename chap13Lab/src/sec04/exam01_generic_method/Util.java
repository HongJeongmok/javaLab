<<<<<<< HEAD
package sec04.exam01_generic_method;

public class Util {
	// ���ʸ� �޼ҵ�
	// �޼ҵ� ���� : ����Ÿ�� �޼ҵ��(Ÿ�� �Ű�����) {...}
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
=======
package sec04.exam01_generic_method;

public class Util {
	// ���ʸ� �޼ҵ�
	// �޼ҵ� ���� : ����Ÿ�� �޼ҵ��(Ÿ�� �Ű�����) {...}
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
