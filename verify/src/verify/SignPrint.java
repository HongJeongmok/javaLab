package verify;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		System.out.println("수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : "0")); 

	}

}
