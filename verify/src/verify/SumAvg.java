package verify;

public class SumAvg {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
			avg = (double)sum/100;
		}
		System.out.println("1부터 100까지의 합 : "+ sum);
		System.out.println("1부터 100까지의 평균 : "+ (String.format("%.2f",  avg)));  // 소수점 두자리까지 출력하는 방법은 검색했습니다.
		}

	}


