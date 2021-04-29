package sec01.exam01_variable;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1;  // 변수는 선언된 블록{}에서만 사용가능
		
		if(true) {
			int var2;  // var1과 var2 사용가능
			
			var1 = 10;
			var2 = 20;
			var2 = 21;
		}
		
		var1 = 11;  // var2 사용 불가능
		// var2 = 21; // var2 cannot be resolved to a variable
		System.out.println(var1);
	}

}
