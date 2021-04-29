package sec06.exam01_array_bylist;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {83, 90, 87};  // stack영역에 주소값 heap영역에 값 바로 저장
		
		System.out.println("scores[0]="+scores[0]);
		System.out.println("scores[1]="+scores[1]);
		System.out.println("scores[2]="+scores[2]);
		
		int sum = 0;
		// sum = scores[0] + scores[1] + scores[2];
		// for (int i=0; i<scores.length; i++)
		for (int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합:"+sum);

	}

}
