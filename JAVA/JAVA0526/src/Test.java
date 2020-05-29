import javax.print.attribute.IntegerSyntax;

public class Test {

	public static void main(String[] args) {
		/*
		 * 가변인자를 활용한 계산기
		 * - 연산자 1개(char 타입 opr)와 피연산자(정수 x개)를 전달받아
		 *   덧셈, 뺄셈, 곱셈, 나눗셈을 처리하는 calc() 메서드 정의
		 */
		// Calculator 인스턴스 생성
		Calculator cal = new Calculator();
		
		// 연산자(기호) 1개와 연산에 사용될 피연산자(데이터)를 2 ~ 4개까지 전달하여
		// 해당 연산자에 맞는 연산을 수행하여 결과를 출력
		cal.calc('+', 1, 2); // 1 + 2 = 3
		cal.calc('+', 1, 2, 3); // 1 + 2 + 3 = 6
		cal.calc('+', 1, 2, 3, 4); // 1 + 2 + 3 + 4 = 10
		
		System.out.println("-----------------------------");
		
		cal.calc('-', 10, 2); // 10 - 2 = 8
		cal.calc('-', 10, 2, 3); // 10 - 2 - 3 = 5
		cal.calc('-', 10, 2, 3, 4); // 10 - 2 - 3 - 4 = 1
		
		System.out.println("-----------------------------");
		
		cal.calc('*', 1, 2); // 1 * 2 = 2
		cal.calc('*', 1, 2, 3); // 1 * 2 * 3 = 6
		cal.calc('*', 1, 2, 3, 4); // 1 * 2 * 3 * 4 = 24
		
		System.out.println("-----------------------------");
		
		cal.calc('/', 10, 2); // 10 - 2 = 5
		cal.calc('/', 10, 2, 3); // 10 - 2 - 3 = 1
		
	}

}

class Calculator {
	
	public void calc(char opr, int...nums) {
		int total = nums[0]; // 첫번째 인자(데이터)를 누적 변수에 저장
		// 첫번째 피연산자를 출력하고 시작
		System.out.print(nums[0]);
		
		if(opr == '+') {
			
			for(int i = 1; i < nums.length; i++) {
				System.out.print(" + " + nums[i]);
				total += nums[i];
			}
			
		} else if(opr == '-') {
			
			for(int i = 1; i < nums.length; i++) {
				System.out.print(" - " + nums[i]);
				total -= nums[i];
			}
			
		} else if(opr == '*') {
			
			for(int i = 1; i < nums.length; i++) {
				System.out.print(" * " + nums[i]);
				total *= nums[i];
			}
			
		} else if(opr == '/') {
			
			for(int i = 1; i < nums.length; i++) {
				System.out.print(" / " + nums[i]);
				total /= nums[i];
			}
			
		}
		
		System.out.println(" = " + total);
		
	}
	
}









