
public class Test2 {

	public static void main(String[] args) {
		// 1. 파라미터도 없고, 리턴값도 없는 메서드 호출
		// => "Hello, World!" 문자열을 10번 반복 출력하는 메서드 hello() 호출
		hello();
		
		// => 구구단을 2단 ~ 9단까지 차례대로 출력하는 메서드 gugudan() 호출
		gugudan();
		
		System.out.println("-----------------------");
		
		// 2. 파라미터는 없고, 리턴값만 있는 메서드 호출
		// => "아이티윌 부산교육센터" 문자열을 리턴하는 메서드 itwill() 호출
		//    => 리턴되는 문자열을 변수 result 에 저장한 후 출력
		String result = itwill();
		System.out.println(result);
		
		System.out.println("------------------------");
		
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		// => hello2() 호출하여 반복할 횟수를 전달
		hello2(10); // "Hello, World!" 문자열이 5번 출력되도록 지정
		
		System.out.println("------------------------");
		
		//4. 파라미터도 있고, 리턴값도 있는 메서드
		
		String snack = sister_4(200);
		System.out.println("동생이 사다준 것 : " + snack);
		
	} // main() 메서드 끝

	
	
	
	// --------- 1. 파라미터도 없고, 리턴값도 없는 메서드 정의 ---------
	// => "Hello, World!" 문자열을 10번 반복 출력하는 메서드 hello() 정의
	public static void hello() {
		// "Hello, World!" 문자열을 10번 반복 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	// => 구구단을 2단 ~ 9단까지 차례대로 출력하는 메서드 gugudan() 정의
	public static void gugudan() {
		// 구구단 출력
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(" < " + dan + "단 >");
			
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			}
			
			System.out.println();
		}
	}
	
	// ---------- 2. 파라미터는 없고, 리턴값만 있는 메서드 정의 -----------
	// => 문자열 "아이티윌 부산교육센터" 를 리턴하는 메서드 itwill() 정의
	public static String itwill() {
//		return "아이티윌 부산교육센터";
		
		String result = "아이티윌 부산교육센터";
		return result;
	}
	
	
	// --------- 3. 파라미터만 있고, 리턴값은 없는 메서드 정의 ---------
	// => 정수값(num) 전달받아 "Hello, World!" 를 num 값 만큼 반복 출력하는 메서드 hello2() 정의
	public static void hello2(int num) {
		// "Hello, World!" 문자열을 num 번 반복 출력
		for(int i = 1; i <= num; i++) {
			System.out.println("Hello, World!");
		}
	}
	
	// 4. 파라미터도 있고, 리턴값도 있는 메서드
	public static String sister_4 (int sister_money) {
		System.out.println("오빠가 새우깡 사오라고 " + sister_money + "원을 줬다");
		return "새우깡";
	}
	

} // 클래스 끝













