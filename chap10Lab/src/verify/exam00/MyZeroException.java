package verify.exam00;

// ����� ���� ���ܷ� �ۼ��ϼ���.
public class MyZeroException extends Exception {
	// �ۼ� ��ġ
	public MyZeroException(String message){
		super(message);
	}
	public MyZeroException(){
		this("0���� ������ ����");
	}

}
