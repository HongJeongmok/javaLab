package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
		int intValue = byteValue;  //자동타입 변환 : int(4bytes) <- byte(1byte)
		System.out.println(intValue); // 10
		
		char charValue = '가';
		intValue = charValue; // 자동타입 변환 : int(4bytes) <- char(2bytes)
		System.out.println("가의 유니코드="+ intValue); // 44032
		
		intValue = 500;
		long longValue = intValue; // 자동타입 변환 : long(8bytes) <- int(4bytes)
		System.out.println(longValue); //500
		
		double doubleValue = intValue; // 자동타입 변환 : double(8bytes) <- int(4bytes)
		System.out.println(doubleValue); //500.0

	}

}
