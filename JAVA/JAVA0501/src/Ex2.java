
public class Ex2 {
	public static void main(String[] args) {
		
		char ch = 'A';
		System.out.println(ch);
		
//		ch= 'AB'; // 작은 따옴표 사이에는 한개의 문자만 사용 가능
//		ch = ''; // 작은 따옴표 사이에는 반드시 1개의 문자 필수
		ch=65;
		System.out.println(ch);
		
		ch = '\u0041'; // \ 기호와 u를 조합하여 뒤에 4자리 16진수 표현 시 유니코드로 취급됨
		System.out.println(ch);
		
		System.out.println("------------------------------------------------");
		
		String s = "Hello World!";
		System.out.println(s);
		
		s = ""; // 문자열은 null string 표현이 가능
		s = "A";
		System.out.println(s);
		
		//연습문제
		long regNo = 9909082122716L;
		System.out.println(regNo);
		
		//연습문제2
		int i = 100;
		long l = 100L;
		final float PI = 3.14f;
		
		// 리터럴(실제로 사용하는 데이터): 100, 100L, 3.14f, 변수: i,l, 상수:int, long, final, float,Pl
		
		//연습문제3 : 다음 중 기본형이 아닌 것은? A. int B.double  C. Byte  D.boolean 답:c
	}

}
