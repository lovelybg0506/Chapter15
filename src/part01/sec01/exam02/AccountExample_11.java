package part01.sec01.exam02;

class Account{
	private long balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: "+(money-balance)+"모자람");
		}
		balance-=money;
	}
	
}

class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {}

	public BalanceInsufficientException(String message) {	//2개의 생성자중 2번째 생성자에서 매개변수를 받고 , super(부모)로 넘김
		super(message);	// 생성자 안에서의 super는 부모생성자 호출 (Exception을 상속받아야함)
	}
	
}

public class AccountExample_11 {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
	
		try {
			account.withdraw(30000);	// 일부러 예외발생시키기
		}catch(BalanceInsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}




