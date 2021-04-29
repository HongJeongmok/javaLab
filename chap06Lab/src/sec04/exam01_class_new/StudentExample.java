package sec04.exam01_class_new;

// 실행가능한(main 메소드 포함) 클래스
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Student() 생성자를 new연산자로  호출하여 객체를 생성한 후 ,
		// 그 주소값을 Student 타입의 s1 변수에 대입시킨다.
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 잠조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 다른 Student 객체를 잠조합니다.");

	}

}
