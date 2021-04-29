package sec14.exam02_constructor_access_package1;

public class B {
	// 필드
	A a1 = new A(true);  // public
	A a2 = new A(1);  // default 접근 제한자는 같은 패키지 내에서 접근 가능하다.
	// A a3 = newA("문자열");  // x
}
