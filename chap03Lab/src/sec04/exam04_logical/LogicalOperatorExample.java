package sec04.exam04_logical;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'b';  //65
		
		if((charCode >= 65)&(charCode<=90)) {  // T & F = F
			System.out.println("대문자 이군요");
		}

		if((charCode >= 97) && (charCode<=122)) {  // T && T = T
			System.out.println("소문자 이군요");
		}		
		
		int value = 6;
		
		if ( (value%2==0) || (value%3==0)) {   // 논리합(||)
			System.out.println("2 또는 3의 배수 이군요");
		}
		
	}

}
