<<<<<<< HEAD
package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		// 0.0<=Math.random()<1.0 사이의 임의의 실수값을 반환한다.
		// 0.0<=Math.random()*20<20.0
		// 0<=(int) Math.random()*20<20 사이의 임의의 정수값을 반환
		// 81<=(int) (Math.random()*20) + 81<101 사이의 임의의 정수
		int score = (int) (Math.random()*20) + 81;  // 81~100의 임의의 정수값을 생성
		System.out.println("점수:"+score);

		String grade; // String 클래스 타입
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점:"+grade);
		
	}

}
=======
package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		// 0.0<=Math.random()<1.0 사이의 임의의 실수값을 반환한다.
		// 0.0<=Math.random()*20<20.0
		// 0<=(int) Math.random()*20<20 사이의 임의의 정수값을 반환
		// 81<=(int) (Math.random()*20) + 81<101 사이의 임의의 정수
		int score = (int) (Math.random()*20) + 81;  // 81~100의 임의의 정수값을 생성
		System.out.println("점수:"+score);

		String grade; // String 클래스 타입
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("학점:"+grade);
		
	}

}
>>>>>>> branch 'master' of https://github.com/HongJeongmok/javaLab.git
