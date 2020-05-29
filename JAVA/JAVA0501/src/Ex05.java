
public class Ex05 {

	public static void main(String[] args) {
	
		System.out.println(2147483647); 
//		System.out.println(2147483647); // int형의 표현 범위를 벗어난 정수는 사용불가
		System.out.println(2147483648L); // long형
		
		byte b = 100;
		System.out.println(b);
		
		b=127;
		// b=128  byte 타입 변수에 저장 가능한 정수는 -128~127까지
				
		short s = 128;
		s= 32767;
		// s = 32768; // short 타입 범위 -32768~32767까지
		
		int i = 32768;
		i = 2147483647;
		// i = 2147483648; 오류발생! 
		// i = 2147483648L 오류발생! long 형 데이터는 int형 변수에 저장 불가
		
		long l = 2147483648L;
		//실수형의 기본 데이터타입은 double형이므로
		//double형 데이터를 float 타입 변수에 저장불가		
		float f = 3.14F; // 접미사 F 필요함
		double d = 3.14;
		
		//---------------------------
		System.out.println(1234); //10진수 정수
		
		// 접두사 ob를 붙이면 2진수 정수로 취급 됨
//		System.out.println(0b1234); //2진수가 아닌 숫자 사용불가
		System.out.println(0b1010);
		
		// 접두사 0을 붙이면 8진수로 취급됨
		System.out.println(0567); //8진수 567
//		System.out.println(05678); //8진수가 아닌 숫자 사용불가
		
		// 접두사 0x를 붙이면 16진수 정수로 취급됨
		System.out.println(0xFF); // 16진수 FF = 10진수 255
//		System.out.println(0x1G); //16진수가 아닌 숫자 사용 불가
		
		//-------------------------------------------
		// boolean 형 : true와 flase만 사용 가능
		boolean bool = true;
//		bool = TRUE; //대문자사용불가
//		bool = 1; //C언어에선 되지만 정수로 대체 불가
		
	}

}
