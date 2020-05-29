
public class Ex {

	public static void main(String[] args) {
		/*
		 * Variable Arguments(VARARGS) = 가변 인자 = 비정형 인자 
		 * - 메서드 파라미터의 인자가 변하는 형태(갯수의 제한이 없는 인자)
		 * - 메서드 선언부의 파라미터 부분에 변수 선언 시 가변인자 기호(...)를 사용하여 표현
		 *   => 파라미터의 데이터타입 뒤에 ... 기호를 붙임
		 * - 가변인자를 사용하여 메서드를 정의하면 메서드 호출 시 파라미터 갯수에 제한이 없어짐
		 *   => 단, 같은 타입의 인자만 전달 가능
		 * - 전달받은 데이터는 변수명에 해당하는 1차원 배열로 자동으로 생성됨
		 * - 주의! 가변인자는 마지막 파라미터로 단 한 번만 지정 가능
		 * 
		 * < 기본 문법 >
		 * 제한자 리턴타입 메서드명(데이터타입... 변수명) {}
		 */
		
		NormalArguments na = new NormalArguments();
		na.normalArguments(1, 2);
		na.normalArguments(1, 2, 3);
//		na.normalArguments(1, 2, 3, 4); // 전달인자 4개를 받는 파라미터 4개 메서드가 없음
		
		System.out.println("-------------");
		
		VariableArguments va = new VariableArguments();
		va.variableArguments(); // 가변인자의 경우 데이터 전달 없이 빈 메서드 호출도 가능
		// 가변인자가 사용된 메서드는 파라미터의 갯수에 제한을 받지 않음
		// => 별도의 오버로딩 없이 여러개의 파라미터를 한꺼번에 처리 가능하게 됨
		va.variableArguments(1, 2, 3);
		va.variableArguments(1, 2, 3, 4, 5);
		va.variableArguments(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
	}

}

class NormalArguments {
	// 일반적인 파라미터를 사용할 경우
	public void normalArguments(int a, int b) {
		System.out.println(a + " " + b);
	}
	
	public void normalArguments(int a, int b, int c) {
		System.out.println(a + " " + b + " " + c);
	}
	
}

class VariableArguments {
	// 가변인자(비정형인자)를 사용할 경우
	public void variableArguments(int... nums) { 
		// 전달받는 데이터를 갯수에 상관없이 nums 배열로 관리
		// 1. 일반 for문 사용
//		for(int i = 0; i < nums.length; i++) {
//			System.out.print(nums[i] + " ");
//		}
		
		// 2. 확장 for문 사용
		for(int i : nums) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
	}
}












