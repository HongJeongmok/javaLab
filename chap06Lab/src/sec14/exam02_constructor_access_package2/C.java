package sec14.exam02_constructor_access_package2;

import sec14.exam02_constructor_access_package1.A;

public class C {
	// 필드
	A a1 = new A(true);  // public
	// A a2 = new A(1);  // default는 다른 패키지에서 접근할 수 없다.
	// A a3 = new A("문자열");  // private

}
