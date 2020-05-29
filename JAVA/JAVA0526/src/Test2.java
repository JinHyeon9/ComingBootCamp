
public class Test2 {

	public static void main(String[] args) {
		/*
		 * Account 인스턴스 생성 및 초기화 후 다음과 같이 출력
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원
		 */
		
		Account acc = new Account(); // 인스턴스 생성
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 100000;
		
		// Setter 호출하여 변수 초기화
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
//		acc.setBalance(100000); // => 대신 deposit() 메서드를 호출하여 입금 기능 사용
		acc.deposit(100000);
		
		// Getter 호출하여 변수값 출력
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance());
		
	}

}

class Account {
	// 계좌번호, 예금주명, 현재잔고 멤버변수를 private 접근제한자로 지정 => Getter/Setter 정의
	private String accountNo; // 계좌번호
	private String ownerName; // 예금주명
	private int balance; // 현재잔고
	
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

	// 입금기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
}

















