package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1~100 사이의 수
		int ran = (int) (Math.random() * 100) + 1;

		int cnt = 0; // 몇번에 맞쳤는지 확인하기 위한 변수
		int inNum = 0; // sc.nextInt()를 통해 콘솔에서 값을 입력받아 저장하는 변수

		// ...
		do {
			System.out.println("1부터  100사이 숫자를 입력하세요.");
			inNum = sc.nextInt();
			cnt++;
			if (inNum < ran) {
				System.out.println("숫자가 작습니다");
			}
			else if (inNum > ran) {
				System.out.println("숫자가 큽니다");
			}

		} while (inNum != ran);
		System.out.println(cnt + "번에 맞쳤습니다.");
		sc.close();

	}

}
