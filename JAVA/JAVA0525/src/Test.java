
public class Test {

	public static void main(String[] args) {
		// Calculator 인스턴스 생성
		Calculator cal = new Calculator();
		
		// 2개, 3개, 4개 파라미터 메서드를 호출하여 각각 계산 수행
//		cal.add(1, 2);
//		cal.add(1, 2, 3);
//		cal.add(1, 2, 3, 4);
		
		// 연산자(기호) 1개와 연산에 사용될 피연산자(데이터)를 2 ~ 4개까지 전달하여
		// 해당 연산자에 맞는 연산을 수행하여 결과를 출력
		cal.calc('+', 1, 2); // 1 + 2 = 3
		cal.calc('+', 1, 2, 3); // 1 + 2 + 3 = 6
		cal.calc('+', 1, 2, 3, 4); // 1 + 2 + 3 + 4 = 10
		
		cal.calc('-', 10, 2); // 10 - 2 = 8
		cal.calc('-', 10, 2, 3); // 10 - 2 - 3 = 5
		cal.calc('-', 10, 2, 3, 4); // 10 - 2 - 3 - 4 = 1
		
		System.out.println("===========================");
		
		Account acc1 = new Account(); // 인스턴스 생성
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

/*
 * 은행계좌(Account)
 * - 기존의 은행계좌와 동일
 * - 출금 메서드인 withdraw() 메서드에 출금할 금액과 함께 boolean 타입 데이터(isMinusAccount)를 전달받아
 *   isMinusAccount 가 true 이면 현재잔고가 부족하더라도 출금을 수행하도록 함 = 마이너스 통장
 *   
 */
class Account {
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
		System.out.println("출금할 금액 : " + amount + "원");
		
		if(balance < amount) {
			System.out.println("잔고가 부족합니다.");
			System.out.println("현재잔고 : " + balance + "원");
			
			// 리턴할 금액(amount)을 0원으로 설정
			amount = 0;
		} else if(balance >= amount) {
			balance -= amount;
			System.out.println("현재잔고 : " + balance + "원");
		}
		
		// 최종금액을 리턴
		return amount;
	}
	
	// 4. withdraw() 메서드 오버로딩
	// => 출금금액(amount)과 마이너스통장여부(isMinusAccount) 를 전달받기
	// => isMinusAccount 가 true 일 경우 현재잔고와 상관없이 무조건 출금 수행
	public int withdraw(int amount, boolean isMinusAccount) {
		System.out.println("출금할 금액 : " + amount + "원");
		
//		if(isMinusAccount) { // isMinusAccount == true 와 동일
//			balance -= amount;
//			System.out.println("현재잔고 : " + balance + "원");
//		}
		
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


/*
 * 계산기(Calculator)
 * - 정수를 전달받아 덧셈만 수행하는 add() 메서드 정의
 * 1. 정수 2개를 전달받아 덧셈 결과 출력
 * 2. 정수 3개를 전달받아 덧셈 결과 출력
 * 3. 정수 4개를 전달받아 덧셈 결과 출력
 * 
 */
class Calculator {

//	public void add(int a, int b) {
//		System.out.println(a + " + " + b + " = " + (a + b));
//	}
//	
//	public void sub(int a, int b) {
//		System.out.println(a + " - " + b + " = " + (a - b));
//	}
//	
//	public void add(int a, int b, int c) {
//		System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
//	}
//	
//	public void add(int a, int b, int c, int d) {
//		System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + (a + b + c + d));
//	}
	
	
	// 연산자 1개, 피연산자 2 ~ 4개를 전달받아 연산 수행 결과를 출력하는 메서드 오버로딩
	// 1. 피연산자 2개를 전달받아 연산
	public void calc(char opr, int a, int b) {
		if(opr == '+') { // 덧셈일 경우
			System.out.println(a + " + " + b + " = " + (a + b));
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.println(a + " - " + b + " = " + (a - b));
		} 
	}
	
	// 2. 피연산자 3개를 전달받아 연산
	public void calc(char opr, int a, int b, int c) {
		if(opr == '+') { // 덧셈일 경우
			System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.println(a + " - " + b + " - " + c + " = " + (a - b - c));
		}
	}
	
	// 3. 피연산자 4개를 전달받아 연산
	public void calc(char opr, int a, int b, int c, int d) {
		if(opr == '+') { // 덧셈일 경우
			System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + (a + b + c + d));
		} else if(opr == '-') { // 뺄셈일 경우
			System.out.println(a + " - " + b + " - " + c + " - " + d + " = " + (a - b - c - d));
		}
	}
	
	
}



















