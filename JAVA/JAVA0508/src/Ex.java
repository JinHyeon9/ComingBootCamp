
public class Ex {
	public static void main(String[] args) {
	/*
	 * 논리연산자 (&, |, !, ^) 
	 * - boolean 타입 피연산자에 대한 논리적인 판별을 수행하는 연산자
	 * 
	 * 1. AND 연산자 (&,&&) => A&&B
	 * 		- 두 피연산자가 모두 true일 때 결과값이 true, 하나라도 false이면 false
	 * 		
	 * 2. OR 연산자 (|,||) => A||B
	 * 		- 두 피연산자 중 하나라도 true이면 결과값이 true, 둘 다 false 이면 false
	 * 
	 * 3. NOT 연산자 (!) = 논리부정 => !A
	 * 		- 단항연산자이므로, 피연산자 1개에 대해 연산을 적용
	 * 		   현재 피연산자 값을 반대로 반전시킴
	 * 		   => true 일 때 false, false일 때 true
	 * 
	 * 4. XOR 연산자(^) = 배타적(exclusive) OR = 배타적 논리합 = A^B
	 * 		   - 두 피연산자가 다르면 true, 같으면 false
	 */
		
		boolean a = false, b = true;
		
		System.out.println(a && a);
		System.out.println(a && b);
		System.out.println(b && a);
		System.out.println(b && b);
		
		System.out.println("----------------------------------");
		
		System.out.println(a || a);
		System.out.println(a || b);
		System.out.println(b || a);
		System.out.println(b || b);

		System.out.println("----------------------------------");
		
		System.out.println(!a);
		System.out.println(!b);	
		
		System.out.println("----------------------------------");
		
		System.out.println(a ^ a);
		System.out.println(a ^ b);
		System.out.println(b ^ a);
		System.out.println(b ^ b);
		
		System.out.println("----------------------------------");
		
		//논리연산자는 주로 관계연산자 등의 다른 연산자와 조합해서 사용
		
		int num1=30, num2=20;
		
		// 1. num1이 10보다 크거나 같고 20보다 작거나 같은지를 판별
		System.out.println(num1>=10 );
		System.out.println(num1<=20);
		// 위의 두 문장을 논리연산자를 사용하여 하나의 문장으로 결합할 수 있음
		// AND 연산자 : ~이면서, ~이고, 그리고 등의 단어를 사용 
		System.out.println(num1>=10 && num1<=20 );
		// 보통 범위를 검색할 때 주로 AND 연산자가 쓰임 
		// EX) 나이를 입력했을 때 20대인지 판별하는 것, 아이디 패스워드 둘 다 맞아야할 때
		
		System.out.println("----------------------------------");
	
		// 2. num2가 10보다 작거나, 15보다 큰 지 판별
		System.out.println(num2<10);
		System.out.println(num2>15);
		// 위의 두 문장을 논리 연산자를 사용하여 하나의 문장으로 결합할 수 있음
		// OR 연산자 : ~하거나, 또는 등의 단어를 사용
		System.out.println(num2<10||num2>15);
		// EX) 놀이공원 입장시 5세 미만 혹은 66세 이하일 경우에 무료입장
	
		System.out.println("----------------------------------");
		
		// 3. num2가 10보다 작거나, 15보다 크면 false, 아니면 true
		System.out.println(!(num2<10||num2>15));
		
	
	
	
	
	
	
	
	
	
	}}
