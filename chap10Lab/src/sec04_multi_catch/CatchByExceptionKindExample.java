package sec04_multi_catch;

public class CatchByExceptionKindExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
		} catch(ArrayIndexOutOfBoundsException/*Exception 상위 개념 위(X)*/ e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch(NumberFormatException/*Exception 상위 개념을 아래(O)*/ e) {
			e.printStackTrace();
			// System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
		

	}

}
