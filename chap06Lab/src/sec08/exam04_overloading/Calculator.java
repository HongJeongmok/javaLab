package sec08.exam04_overloading;

public class Calculator {
	// 1. �ʵ�
	// 2. ������
	
	// 3. �޼ҵ�
	// ���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	// ���簢���� ����
	// method overloading
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
