package verify.exam00;

// 사용자 정의 예외로 작성하세요.
public class MyZeroException extends Exception {
	// 작성 위치
	public MyZeroException(String message){
		super(message);
	}
	public MyZeroException(){
		this("0으로 나누지 마라");
	}

}
