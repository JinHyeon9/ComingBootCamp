
public class Test2 {

	public static void main(String[] args) {
		Account2 acc1 = new Account2(); // 인스턴스 생성
		acc1.accountNo = "111-1111-111";
		acc1.ownerName = "홍길동";
		acc1.balance = 100000;
		
		// Account 클래스 내에 정의된 showAccountInfo() 메서드 호출하여 변수 값 출력
		acc1.showAccountInfo();
		
		System.out.println("----------");
		// 입금
		acc1.deposit(5000);
		System.out.println("----------");
		acc1.deposit(800000);
		
		System.out.println("----------");
		// 출금
		int myMoney = acc1.withdraw(500000);
		System.out.println("출금된 금액 : " + myMoney + "원");
		System.out.println("----------");
		myMoney = acc1.withdraw(500000); // 잔고부족으로 출금 불가
		System.out.println("출금된 금액 : " + myMoney + "원");
		System.out.println("----------");
		myMoney = acc1.withdraw(5000000, true); // 잔고부족으로 출금 불가
		System.out.println("출금된 금액 : " + myMoney + "원");
	}

}

class Account2 {
	String accountNo; // 계좌번호
	String ownerName; // 예금주명
	int balance; // 현재잔고
	
	// 1. showAccountInfo() : 계좌번호, 예금주명, 현재잔고 출력하는 메서드 
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 2. deposit() : 입금 기능 => 파라미터(입금금액 amount, 정수형), 리턴값 X
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 3. withdraw() : 출금기능 => 파라미터(출금할금액 amount, 정수형), 리턴타입 정수형
	public int withdraw(int amount) {
		// => withdraw(int, boolean) 메서드와 작업이 중복되므로
		//    해당 메서드를 호출하여 데이터만 전달하면 코드 중복이 제거됨
		// => 메서드 호출 후 리턴되는 값을 amount 변수에 저장한 뒤 다시 리턴
		amount = withdraw(amount, false);
		return amount;
	}
	
	// 4. withdraw() 메서드 오버로딩
	// => 출금금액(amount)과 마이너스통장여부(isMinusAccount) 를 전달받기
	// => isMinusAccount 가 true 일 경우 현재잔고와 상관없이 무조건 출금 수행
	public int withdraw(int amount, boolean isMinusAccount) {
		System.out.println("출금할 금액 : " + amount + "원");
		
		// 마이너스 통장이거나 잔고가 출금금액보다 크거나 같으면 출금
		// 아니면 잔고 부족 수행
		if(isMinusAccount) { // 마이너스 통장일 경우(주의! 출금불가 경우보다 먼저 판별해야함)
			System.out.println("마이너스 통장이므로 무조건 출금 실행!");
			balance -= amount;
			System.out.println("현재잔고 : " + balance + "원");
		} else if(balance < amount) { // 마이너스 통장이 아니고, 출금이 불가능할 경우
			System.out.println("잔고가 부족합니다.");
			System.out.println("현재잔고 : " + balance + "원");
			
			// 리턴할 금액(amount)을 0원으로 설정
			amount = 0;
		} else if(balance >= amount) { // 마이너스 통장이 아니고, 출금이 가능할 경우
			balance -= amount;
			System.out.println("현재잔고 : " + balance + "원");
		}
		
		// 최종금액을 리턴
		return amount;
	}
	
}