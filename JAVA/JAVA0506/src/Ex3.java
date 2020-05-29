
public class Ex3 {
	public static void main(String[] args) {
//		비교(관계) 연산자 (>,>=,<,<=,==,!=)
//		- 두 연산자의 대소관계를 비교하는 연산자
//		연산 결과로 true 또는 false 형태의 boolean 타입 결과가 리턴됨 (=전달됨)
//		주의!! >=등의 연산자 기호 순서를 바꿀 수 없다.
		
		int a = 10, b = 3;
		
		System.out.println(a == b); //false
		System.out.println(a != b); //true
		System.out.println(a > b); //true
		System.out.println(a >= b); //true
		System.out.println(a < b); //flase
		System.out.println(a <= b); //flase
		
		// 비교 연산 결과를 boolean 타입 변수에 저장도 가능하다
		boolean result = a>b;
		System.out.println(result);
		
		System.out.println("---------------------");
		
		// char 타입의 비교 연산 시 유니코드 (정수)로 변경하여 연산 수행
		System.out.println('A' > 'B'); // 65>66 = false
		
		// int형 이하의 연산 시 int형으로 자동 형변환 되는 것은 동일함
		System.out.println('A' == 65);
		
		// 두 피연산자 중 큰 타입으로 자동 형변환 되는 것도 동일함
		System.out.println(3 == 3.0); // int 타입 3을 double 타입 3.0으로 변환 후 연산 수행
		
		
		// ----------------------------------------
		//		주의사항
		//		실수형의 경우 비교 연산에서도 정확도에 따른 문제점이 발생
		System.out.println("0.1과 0.1f는 같은가?" + (0.1 == 0.1f)); // false
		System.out.println("0.5과 0.5f는 같은가?" + (0.5 == 0.5f)); // true
		
		double d1 = 0.1;
		float f1 = 0.1f;		
		System.out.println(d1 == f1);
		
		// 해결방법! 정수형으로 변환하여 연산을 수행하면 문제가 해결된다.
		//	=> 실수의 모든 자릿수를 정수로 변환하기 위해 정수로 곱한 후 int형으로 형변환
		int i1 = (int)(d1*10);
		int i2 = (int)(f1*10);
		System.out.println(i1==i2);
		
		System.out.println("------------------------------------");
	
		// 동등비교연산자(==)의 경우 문자열 비교도 가능
		String s1 = "JAVA";
		String s2 = "java";
		String s3 = "java";
		
		System.out.println(s1 == s2); 
		System.out.println(s3 == s2);
	
		
	}
}
