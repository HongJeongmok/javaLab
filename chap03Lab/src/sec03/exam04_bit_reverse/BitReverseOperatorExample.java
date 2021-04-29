package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;    // 0000000000000000000000000001010 = 10
		int v2 = ~v1;  // 1111111111111111111111111110101 = -11
		System.out.println(v1);
		System.out.println(v2);

	}

}
