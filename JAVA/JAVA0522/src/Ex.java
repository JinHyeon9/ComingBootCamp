
public class Ex {

	public static void main(String[] args) {
		// 파라미터가 2개 이상인 메서드
		// 메서드 호출 시 전달할 파라미터들을 콤마(,)로 구분하여 전달
		System.out.println("동생아 1000원이랑 새우깡 사온 거 가지고 가서 쿠쿠다스로 바꿔온나!");
		int money = 1000;
		String snack = "새우깡";
		snack = sister_5(money, snack); // int형, String형 두 가지 데이터드를 메서드에 전달
		System.out.println("동생이 바꿔다 준 것 : " + snack);
	}

	// 파라미터가 2개 이상인 메서드 정의
	// => 전달받는 데이터를 순서대로 저장할 변수 선언 (각 변수끼리 콤마로 구분)
	// (메서드 호출 시 전달하는 데이터 변수명과 파라미터 변수 이름은 달라도 ㄱㅊ)
	// => 리턴 값 있음 (문자열 있음)

	public static String sister_5(int sisterMoney, String sisterSnack) {

		System.out.println("동생 : 오빠가 " + sisterSnack + "원을 쿠쿠다스로 바꾸라고" + sisterSnack + "을 줬다");

		sisterMoney -= 800;
		return sisterSnack;
	}

	// 주의사항 = > 파라미터는 복수계 지정이 가능하지만 리턴타입은 한개만 지정이 가능하며
	// 리턴값도 한개만 가능함. 단, String 타입이 리턴될 경우 문자열 결합으로는 리턴 가능함

//	public static int sister_6() {
//		return 100, 200; // return 문 뒤에 2개 이상의 리턴값 불가
//	}

	public static String sister_6() {
		return "새우깡" + "쿠쿠다스";
	}

	// --------------------------------------------------------------------------
	// if문의 조건에 따른 return문 사용 시 주의사항
	// return문은 항상 실행되어어야 함.
	//	public static String method(int num) {
	//		// 메서드 종료 시점에서 반드시 String형 데이터 1개 리턴 필요
	//		if (num % 2 == 0) { // 짝수일 때 짝수를 리턴
	//			return "짝수";
	//
	//		} else if (num % 2 == 1) {// 홀수일 때 홀수를 리턴
	//			return "홀수";
	//		}
	//		

	// 문제점 : if문 사용 시 모든 조건이 만족하지 않을 때 return 문이 없을 경우
	// 반드시 return문이 실행되어야 하는 조건이 성립되지 않는다
	// 해결책1) else 문을 작성하여 나머지 경우에 return이 되도록 실행한다

	//	public static String method(int num) {
	//		// 메서드 종료 시점에서 반드시 String형 데이터 1개 리턴 필요
	//		if (num % 2 == 0) { // 짝수일 때 짝수를 리턴
	//			return "짝수";
	//
	//		} else if (num % 2 == 1) {// 홀수일 때 홀수를 리턴
	//			return "홀수";
	//		} else { // 위의 모든 조건을 만족하지 않을 때 리턴
	//			return "기타";
	//		}
	//		}
	//}

	// 해결책2) if문 내에서 return문을 사용하지 않고 return 값을 생성하기만 하고
	// if문 종료 후에 후에 return문을 실행하도록 함

	public static String method(int num) {
		// 메서드 종료 시점에서 반드시 String형 데이터 1개 리턴 필요
		String result = "";
		if (num % 2 == 0) { // 짝수일 때 짝수를 리턴
			result = "짝수";

		} else if (num % 2 == 1) {// 홀수일 때 홀수를 리턴
			result = "홀수";
		}
		// 위의 두 가지 조건을 만족하지 않더라도 null string 값 실행
		return result;
	}
}
