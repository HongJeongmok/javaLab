package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액 : "+ account.getBalance());
		
		// 출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();  // 예외객체의 메시지만 반환한다.
			System.out.println(message);
			System.out.println();
			e.printStackTrace();  // 예외객체에 대한 자세한 정보(메시지, 예외 클래스, 위치)를 출력해준다.
		}

	}

}
