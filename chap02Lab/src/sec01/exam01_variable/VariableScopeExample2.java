package sec01.exam01_variable;

//클래스
public class VariableScopeExample2 {

	// main() 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// v1 변수 선언
		int v1 =  15;
		
		if (v1 > 10) {
			// v2 변수 선언
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}

		System.out.println(v1);
	}

}
