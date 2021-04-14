package verify;

public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0.0<=Math.random()<1.0
		// 0.0<=Math.random()*6<6.0
		// 0<=(int)Math.random()*6<6 하면 0~5
		// 0<=(int)(Math.random()*6)+1<7 하면 1~6
		while (true) {
		int number1 = (int) (Math.random()*6)+1;  //1~6
		int number2 = (int) (Math.random()*6)+1;  //1~6
			System.out.println("("+number1+","+number2+")");
			if (number1+number2 ==5) {
				
				break;
			}
				
		}

	}

}
