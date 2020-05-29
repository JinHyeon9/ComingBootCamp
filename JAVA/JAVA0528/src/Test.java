
public class Test {
	public static void main(String[] args) {

	}
}




class Account {
	// 인스턴스 변수 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
//	public Account(String accountNo,String ownerName,int balance) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
//	}
	
	public Account() {
		this.accountNo = "111-111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}

	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// Getter Setter 선언
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
	
	
	
}



