<<<<<<< HEAD
package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		// Scanner Ŭ���� Ÿ���� scanner ������ Scanner ��ü �����Ͽ� ���Խ�Ų��.
		Scanner sanner = new Scanner(System.in);
		// String Ŭ���� Ÿ��
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sanner.nextLine();  // ǥ���������ġ(�ܼ�)���� ������ �Է¹޾� ������ ���Խ�Ų��.
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
=======
package sec03.exam03_dowhile;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�޽����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		// Scanner Ŭ���� Ÿ���� scanner ������ Scanner ��ü �����Ͽ� ���Խ�Ų��.
		Scanner sanner = new Scanner(System.in);
		// String Ŭ���� Ÿ��
		String inputString;
		
		do {
			System.out.print(">");
			inputString = sanner.nextLine();  // ǥ���������ġ(�ܼ�)���� ������ �Է¹޾� ������ ���Խ�Ų��.
			System.out.println(inputString);
		} while (!inputString.equals("q"));
		
		System.out.println();
		System.out.println("���α׷� ����");

	}

}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
