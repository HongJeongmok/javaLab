package verify;

import java.util.Scanner;

public class DoWhileExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 1~100 ������ ��
		int ran = (int) (Math.random() * 100) + 1;

		int cnt = 0; // ����� ���ƴ��� Ȯ���ϱ� ���� ����
		int inNum = 0; // sc.nextInt()�� ���� �ֿܼ��� ���� �Է¹޾� �����ϴ� ����

		// ...
		do {
			System.out.println("1����  100���� ���ڸ� �Է��ϼ���.");
			inNum = sc.nextInt();
			cnt++;
			if (inNum < ran) {
				System.out.println("���ڰ� �۽��ϴ�");
			}
			else if (inNum > ran) {
				System.out.println("���ڰ� Ů�ϴ�");
			}

		} while (inNum != ran);
		System.out.println(cnt + "���� ���ƽ��ϴ�.");
		sc.close();

	}

}
