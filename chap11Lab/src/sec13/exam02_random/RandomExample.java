<<<<<<< HEAD
package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���� ��ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);  // ����θ� ����
		System.out.print("���� ��ȣ : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ��ȣ
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("��÷ ��ȣ : ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;  // 1~45 ������ ������ ����
			System.out.print(winningNumber[i] + " ");
		}

	}

}
=======
package sec13.exam02_random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// ���� ��ȣ
		int[] selectNumber = new int[6];
		Random random = new Random(3);  // ����θ� ����
		System.out.print("���� ��ȣ : ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// ��÷ ��ȣ
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("��÷ ��ȣ : ");
		for(int i=0; i<6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;  // 1~45 ������ ������ ����
			System.out.print(winningNumber[i] + " ");
		}

	}

}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
