	

/*
		 * Account 클래스 정의 - 
		 * 
		 * 멤버 변수 
		 * 
		 * 1) 계좌번호(accountNo, 문자열) 
		 * 2) 예금주명(ownerName, 문자열) 
		 * 3) 현재잔고(balance, 정수)
		 * 
		 * - 기본 생성자를 정의 
		 * =>
		 * 
		 * - Getter/Setter 정의 
		 * =>
		 */


public class Test {
	public static void main(String[] args) {

	account acc = new account();// 인스턴스 생성 시점에서 Account() 생성자가 호출된다
	
	
	// 멤버 변수 초기화 시 private 접근제한자로 인해 직접 접근이 불가능하므로
	// Setter 를 통해 간접적으로 초기화 필요
	
	// acc.setAccountNo("111-111-111");
	// acc.setOwnderName("111-111-111");
	// acc.setBalance(1111);
	
	System.out.println("계좌번호 : " + acc.getAccountNo());
	System.out.println("예금주명 : " + acc.getOwnderName());
	System.out.println("현재잔고 : " + acc.getBalance());
	
	}
}

class account {

	// 멤버변수 선언
	private String accountNo;
	private String ownderName;
	private int balance;
	
	// 생성자 정의
	public account() {		
		 System.out.println("생성자 Account 호출됨!");
		 // 멤버변수의 값을 초기화
		 accountNo = "JinHyeonBank";
		 balance = 1000000;
		 ownderName = "JinHyeon";
	}
	
	
	// Getter/Setter 정의
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnderName() {
		return ownderName;
	}

	public void setOwnderName(String ownderName) {
		this.ownderName = ownderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
