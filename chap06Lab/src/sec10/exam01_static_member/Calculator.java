package sec10.exam01_static_member;

public class Calculator {
	static double pi = 3.14159;  // ���� �ʵ�, Method ������ ����(����)
	
	static int plus(int x, int y) {  // ���� �޼ҵ�
		return x+y;
		}
	
	int minus(int x, int y) {  // �ν��Ͻ� �޼ҵ�, Heap ������ ����
		return x-y;
	}

}