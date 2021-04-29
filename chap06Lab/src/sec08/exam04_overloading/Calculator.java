package sec08.exam04_overloading;

public class Calculator {
	// 1. 필드
	// 2. 생성자
	
	// 3. 메소드
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	// 직사각형의 넓이
	// method overloading
	double areaRectangle(double width, double height) {
		return width * height;
	}

}
