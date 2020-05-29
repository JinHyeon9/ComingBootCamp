
public class Test3 {

	public static void main(String[] args) {
		Account3 acc1 = new Account3();
//		System.out.println("계좌번호 : " + acc1.getAccountNo());
//		System.out.println("예금주명 : " + acc1.getOwnerName());
//		System.out.println("현재잔고 : " + acc1.getBalance());
		acc1.showAccountInfo();
		
		System.out.println("-----------------");
		
		// 계좌번호를 전달받는 생성자 Account3(String) 호출
		Account3 acc2 = new Account3("555-5555-555");
		acc2.showAccountInfo();
		
		System.out.println("-----------------");
		
		// 계좌번호, 예금주명을 전달받는 생성자 Account3(String, String) 호출
		Account3 acc3 = new Account3("777-7777-777", "이순신");
		acc3.showAccountInfo();

		System.out.println("-----------------");
		
		// 계좌번호, 예금주명, 현재잔고를 전달받는 생성자 Account3(String, String, int) 호출
		Account3 acc4 = new Account3("777-7777-777", "이순신", 99999);
		acc4.showAccountInfo();
		
	}

}

/*
 * 은행계좌(Account3) 클래스 정의
 * 
 * 인스턴스변수 선언
 * 계좌번호(accountNo, 문자열), 예금주명(ownerName, 문자열), 현재잔고(balance, 정수)
 * => 접근제한자를 private 으로 선언
 * 
 * 생성자 정의
 * 1) 파라미터가 없는 기본 생성자 정의
 *    계좌번호 : 111-1111-111, 예금주명 : 홍길동, 현재잔고 : 0 으로 초기화
 * 2) 파라미터 1개 => 계좌번호를 전달받은 데이터로 초기화
 *                    예금주명 : 홍길동, 현재잔고 : 0 으로 초기화
 * 3) 파라미터 2개
 *    => 계좌번호, 예금주명을 전달받은 데이터로 초기화, 현재잔고 : 0 으로 초기화                                        
 * 4) 파라미터 3개
 *    => 계좌번호, 예금주명, 현재잔고를 전달받은 데이터로 초기화
 * 
 * Getter/Setter 정의
 */
class Account3 {
	// 인스턴스 변수
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 생성자
	public Account3() {
		System.out.println("Account3() 생성자 호출됨!");
		this.accountNo = "111-1111-111";
		this.ownerName = "홍길동";
		this.balance = 0;
	}
	
	public Account3(String accountNo) {
		System.out.println("Account3(String) 생성자 호출됨!");
		this.accountNo = accountNo;
		this.ownerName = "홍길동";
		this.balance = 0;
	}
	
	public Account3(String accountNo, String ownerName) {
		System.out.println("Account3(String, String) 생성자 호출됨!");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = 0;
	}
	
	public Account3(String accountNo, String ownerName, int balance) {
		System.out.println("Account3(String, String, int) 생성자 호출됨!");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	
	// Getter/Setter
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
















