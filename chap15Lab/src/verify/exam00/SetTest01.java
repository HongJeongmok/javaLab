package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		int n;
		Set s = new HashSet();  // ���ı�� ����
		//TreeSet s = new TreeSet();  // ������������
		Random r = new Random();
		// �ۼ���ġ
		// Set�� �̿��� �ζ�
		while (true) {
			s.add(r.nextInt(45) + 1);
			if (s.size() == 6) {
				break;
			}
		}
		/*
		 while (s.size() !=6) {
		 n = r.nextInt(45) + 1;  // 1~45 ������ ���� 6��
		 s.add(n);
		 }
		 */
		// ���� : set -> list �����Ͽ� Collections.sort()�� �̿��Ͽ� �����Ѵ�.
		// List list = new Arraylist(s);
		// Collections.sort(list);
		System.out.println(s);
		//System.out.println(list);
	}
}
