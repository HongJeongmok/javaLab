package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		// 일반 for문
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("점수 총합="+sum);
		
		sum = 0;
		// 향상된 for문
		for (int score : scores) {
			sum += score; // sum = sum + score;
		}
		
		System.out.println("점수 총합="+sum);
		
		double avg = (double)sum / scores.length;
		System.out.println("점수 평균="+avg);

	}

}
