package sec06.exam02_array_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[3];  // stack영역에 주소값 heap영역에 공간만 생성 값은 나중에 입력
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1 ["+i+"]="+arr1[i]);
		}

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<arr1.length; i++) {
			System.out.println("arr1 ["+i+"]="+arr1[i]);
		}
		
		String[] arr2 = new String[3];  // stack영역에 주소값 heap영역에 객체의 주소값(새로운 객체 생성) 저장
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2 ["+i+"]="+arr2[i]);
		}
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2 ["+i+"]="+arr2[i]);
		}

	}
}