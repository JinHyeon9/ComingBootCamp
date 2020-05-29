
public class Test2 {

	public static void main(String[] args) {
		Account2 acc1 = new Account2();
//		System.out.println("계좌번호 : " + acc1.getAccountNo());
//		System.out.println("예금주명 : " + acc1.getOwnerName());
//		System.out.println("현재잔고 : " + acc1.getBalance() + "원");
		acc1.showAccountInfo();
		
		System.out.println("-----------------");
		
		// 계좌번호를 전달받는 생성자 Account2(String) 호출
		Account2 acc2 = new Account2("555-5555-555");
		acc2.showAccountInfo();
		
		System.out.println("-----------------");
		
		// 계좌번호, 예금주명을 전달받는 생성자 Account2(String, String) 호출
		Account2 acc3 = new Account2("777-7777-777", "이순신");
		acc3.showAccountInfo();

		System.out.println("-----------------");
		
		// 계좌번호, 예금주명, 현재잔고를 전달받는 생성자 Account2(String, String, int) 호출
		Account2 acc4 = new Account2("777-7777-777", "이순신", 99999);
		acc4.showAccountInfo();
	}

}

class Account2 {
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account2() {
		this("111-1111-111", "홍길동", 0);
	}
	
	public Account2(String accountNo) {
		this(accountNo, "홍길동", 0);
	}

	public Account2(String accountNo, String ownerName) {
		this(accountNo, ownerName, 0);
	}

	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 계좌정보를 출력하는 showAccountInfo() 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	
}