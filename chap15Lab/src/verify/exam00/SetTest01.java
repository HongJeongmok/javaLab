package verify.exam00;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		int n;
		Set s = new HashSet();  // 정렬기능 없음
		//TreeSet s = new TreeSet();  // 오름차순구조
		Random r = new Random();
		// 작성위치
		// Set을 이용한 로또
		while (true) {
			s.add(r.nextInt(45) + 1);
			if (s.size() == 6) {
				break;
			}
		}
		/*
		 while (s.size() !=6) {
		 n = r.nextInt(45) + 1;  // 1~45 임의의 정수 6개
		 s.add(n);
		 }
		 */
		// 정렬 : set -> list 변경하여 Collections.sort()를 이용하여 정렬한다.
		// List list = new Arraylist(s);
		// Collections.sort(list);
		System.out.println(s);
		//System.out.println(list);
	}
}
