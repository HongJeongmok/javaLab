package verify;

import java.util.Scanner;

public class SignPrint {

	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		int num =  sc.nextInt();
		System.out.println(num > 0 ? "���" : (num < 0 ? "����" : "0")); 

	}

}
