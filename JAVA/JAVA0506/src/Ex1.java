
public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 산술 연산 시의 형변환
		 * - 산술 연산 수행 전 피연산자의 타입을 일치시킨 후 연산을 진행함
		 * 
		 * 규칙1. int형보다 작은 타입끼리의 연산 시 int형으로 자동으로 변환 후 연산 
		 *    ex) byte + byte = (int)byte + (int)byte = int
		 *    ex2) byte + short = (int)byte + (int)short = int
		 *    
		 * 규칙2. int형 이상의 타입과 연산 시 피연산자 중 큰 타입으로 자동으로 변환 후 연산
		 *    ex) char + int = (int)char + int = int
		 *    ex2) byte + long = (long)byte + long = long
		 *    ex3) long + float = (float)long + float = float
		 */	
	byte b1 = 10;
	byte b2 = 20;
	
//	byte b3 = b1 + b2; // 오류 발생! byte + byte = int
	// => b1 을 int형으로 변환, b2 를 int형으로 변환 후 덧셈 연산을 수행하기 때문에
	//    b1 + b2 의 결과가 byte 타입이 아닌 int 타입으로 계산됨
	//    따라서, 연산 결과를 byte 타입 변수 b3 에 저장하려면 명시적 형변환이 필요함
	
	byte b3 = (byte)(b1+b2);
	System.out.println(b3);
	
	char ch = 'A';
	System.out.println(ch);
	System.out.println(ch+2); // char + int = int 이므로 C가 아닌 67이 출력된다.
	System.out.println((char)(ch+2)); // ch+2 결과를 char 타입으로 형변환하여 'C'가 출력됨
//	char = ch + 2 // 오류 발생! 결과값이 int형이므로 char 타입에 저장 불가!
	ch = (char)(ch+2); // 연산결과를 다시 char  타입으로 변환해야함
	System.out.println(ch);
	
	float f = 3.14f;
	long l = 100L;
//	long d2 = l+f; // long+float = float 이므로  long 타입으로 강제 현변환 필요
	long l2 = (long)(l+f);
	System.out.println(l2);
	
	System.out.println(10/3); // int/int 이므로 int로 출력.
	// => 만약 10/3 연산을 실수 형태의 결과로 출력하고자 하는 경우 
//	두 피연산자 중 최소 하나의 피연산자를 실수형으로 변환해야함
	
//	정수 리터럴을 실수형으로 변환하는 방법 2가지
	System.out.println(10 / 3f); // 1) 실수형 \
	System.out.println(10 / (float)3); 
	System.out.println(10/3.0); // int/double 이므로 출력결과도 double로 출력됨.  (ps: 기본 실수형은 double임, no float)
	
	System.out.println("____________________");
	
	byte b = 10 + 20;
	short s = 100 + 200;
	
	// 피연산자의 크기가 4byte 미만 즉 int 미만일 경우 모두 int형으로 자동형변환된다.
	System.out.println('A' + 'B'); // char + char = int 이므로 131출력
	System.out.println('1' + 2); // char + int = int 이므로 51 출력
	System.out.println('1' + '2'); // char + char = int 이므로 99 출력
	// => '1' + '2' 결과를 정수가 아닌 char 타입 문자로 출력할 경우
	System.out.println((char)('1' + '2'));
	}
}
