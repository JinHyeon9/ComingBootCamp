
public class Test1 {

	public static void main(String[] args) {
		// 메서드 정의 및 호출 복습

		// 1. 1 ~ 10 까지 정수를 차례대로 출력하는 print() 메서드 호출
		// => 파라미터 없음, 리턴값 없음
		print();

		System.out.println("--------------");

		// 2. 1 ~ 10 까지 정수의 합을 리턴하는 total() 메서드 호출 후 리턴값 출력
		// => 파라미터 없음. 리턴값 있음(int형)
		int total = total();
		System.out.println("합계 : " + total);

		System.out.println("--------------");

		// 3. 정수 num 을 전달받아 1 ~ num 까지 차례대로 출력하는 print2() 메서드 호출
		// => 파라미터 있음(정수 1개), 리턴값 없음
		print2(100);

		System.out.println("--------------");

		// 4. 정수 num을 전달받아 1 ~ num 까지 정수의 합을 리턴하는 total2() 메서드 호출
		// => 파라미터 있음(정수 1개). 리턴값 있음(int형)
		//	int total2 = total2(100);
		//	System.out.println("합계 : " + total2);

		System.out.println("합계 : " + total2(100));

		System.out.println("--------------");

		// 5. 정수 a 와 b 를 전달받아 a ~ b 까지 정수의 합을 리턴하는 total3() 메서드 호출
		// => 파라미터 있음(정수 2개), 리턴값 있음(int형)
		System.out.println("합계 : " + total3(1, 10));

	}

	// 1. 1 ~ 10 까지 정수를 차례대로 출력하는 print() 메서드 정의
	// => 파라미터 없음, 리턴값 없음
	public static void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	// 2. 1 ~ 10 까지 정수의 합을 리턴하는 total() 메서드 정의
	// => 파라미터 없음. 리턴값 있음(int형)
	public static int total() {
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
		}

		return total;
	}

	// 3. 정수 num 을 전달받아 1 ~ num 까지 차례대로 출력하는 print2() 메서드 정의
	// => 파라미터 있음(정수 1개), 리턴값 없음
	public static void print2(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

	// 4. 정수 num을 전달받아 1 ~ num 까지 정수의 합을 리턴하는 total2() 메서드 정의
	// => 파라미터 있음(정수 1개). 리턴값 있음(int형)
	public static int total2(int num) {
		int total = 0;

		for (int i = 1; i <= num; i++) {
			total += i;
		}

		return total;
	}

	// 5. 정수 a 와 b 를 전달받아 a ~ b 까지 정수의 합을 리턴하는 total3() 메서드 정의
	// => 파라미터 있음(정수 2개), 리턴값 있음(int형)
	public static int total3(int a, int b) {
		int total = 0;
		for (int i = a; i <= b; i++) {
			total += i;
		}

		return total;
	}

}
