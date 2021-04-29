package verify;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max, min;
		int[] s = new int[5];
		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		// 작성 위치
		for (int i=0; i<s.length; i++) {
			s[i] =  sc.nextInt();
		}
		/*s[0] = sc.nextInt();
		s[1] = sc.nextInt();
		s[2] = sc.nextInt();
		s[3] = sc.nextInt();
		s[4] = sc.nextInt();*/
		max = s[0];
		min = s[0];
	
		for (int i=1; i<s.length; i++) {
			if(max < s[i]) max=s[i]; {
		}
			if(min > s[i]) min=s[i];
		}
		System.out.println("max="+max);
		System.out.println("min="+min);

	}

	}
