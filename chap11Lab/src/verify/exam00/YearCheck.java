<<<<<<< HEAD
package verify.exam00;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		/* if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		 } else {
			System.out.println(year + "은 평년");
		 }
		 */
		 // 작성 위치
		GregorianCalendar y = new GregorianCalendar();
		
		if(y.isLeapYear(year)) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년 입니다.");
		}
	}
}
=======
package verify.exam00;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class YearCheck {

	public static void main(String[] args) {
		System.out.print("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		/* if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "은 윤년");
		 } else {
			System.out.println(year + "은 평년");
		 }
		 */
		 // 작성 위치
		GregorianCalendar y = new GregorianCalendar();
		
		if(y.isLeapYear(year)) {
			System.out.println("윤년 입니다.");
		} else {
			System.out.println("평년 입니다.");
		}
	}
}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
