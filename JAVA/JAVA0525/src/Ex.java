
public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 메서드 오버로딩(Method Overloading) = 메서드 다중정의
		 * - 동일한 이름의 파라미터가 다른 메서드를 여러번 정의하는 것
		 * - 동일한 기능을 수행하지만, 전달받는 파라미터가 달라야 할 경우
		 *   메서드 이름을 각각 따로 지정해야하지만, 오버로딩을 사용하여 정의하면
		 *   메서드 이름을 동일하게 정의하고 파라미터만으로 각각의 메서드를 구별할 수 있게 됨
		 * - 주의사항! 메서드 시그니쳐(이름, 리턴타입, 파라미터, 접근제한자) 중에서
		 *   파라미터를 제외한 나머지는 동일하게 정의함
		 *   => 외부에서 호출할 때 메서드 파라미터(소괄호()) 데이터만으로 각 메서드를 구분하도록 함
		 *
		 * < 메서드 오버로딩 규칙(택 1) >
		 * 1. 메서드 파라미터의 타입이 달라야함
		 * 2. 메서드 파라미터의 갯수가 달라야함
		 */
		
		NormalMethod nm = new NormalMethod();
		nm.add(10, 20);
		
//		nm.add(1.0, 2.2); // 파라미터가 int, int 이므로 double, double 전달 불가
		nm.addDouble(1.0, 2.2);
		
		System.out.println("=================");
		
		OverloadingMethod om = new OverloadingMethod();
		// 오버로딩 된 메서드 호출 시 파라미터를 전달하면 파라미터 타입에 맞는 메서드가 자동 호출됨
		// => 단, 메서드를 호출하는 시점에서 데이터의 구분이 되어야 오버로딩 성립됨
		om.add(10, 20); // add(int num1, int num2) 메서드를 실행
		om.add(1.0, 2.2); // add(double num1, double num2) 메서드를 실행
		om.add(10L, 20L); // add(long, long) 메서드는 정의되어 있지 않지만, 
		                  // add(double, double) 메서드를 실행하여 자동 형변환 수행
		
		om.add(1, 2, 3);
	}

}

class OverloadingMethod {
	// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	// => 메서드 오버로딩을 활용하여 동일한 이름의 파라미터가 서로 다른 메서드 여러번 정의
	// 1. 정수 2개를 전달받아 덧셈
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 주의! 파라미터의 변수명만 다를 경우 오버로딩이 성립되지 않는다! => 오류 발생!
//	public void add(int a, int b) {
//		System.out.println(a + b);
//	}
	
	// 주의! 리턴타입만 다를 경우 오버로딩이 성립되지 않는다! => 오류 발생!
//	public int add(int num1, int num2) {
//		return num1 + num2;
//	}
	
	
	// 2. 실수 2개를 전달받아 덧셈
	// => int형 파라미터 2개를 전달받는 메서드 add() 와 모두 동일하고 파라미터 타입만 다름
	//    파라미터 갯수가 동일하더라도 타입이 달라지므로 오버로딩 성립됨
	public void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	
	// 3. 정수 3개를 전달받아 덧셈
	// => add(int, int) 메서드와 파라미터 갯수가 달라지므로 오버로딩 성립됨
	public void add(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
}


class NormalMethod {
	// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
	// => 메서드에서 파라미터는 다르지만 수행하는 작업이 동일함
	//    그러나, 식별자 중복이 불가능하므로 서로 다른 이름의 메서드로 정의해야함
	// 1. 정수 2개를 전달받아 덧셈
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 2. 실수 2개를 전달받아 덧셈 => addDouble() 메서드 정의
	public void addDouble(double num1, double num2) {
		System.out.println(num1 + num2);
	}
	
}

















