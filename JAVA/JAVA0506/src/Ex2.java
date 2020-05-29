
public class Ex2 {
	public static void main(String[] args) {
	
		int a = 10;
		int b = a;
		
		System.out.println(b);
		
		// a + b의 결과를 a의 저장
		a += b ;; // a = a+b;와 동일
		System.out.println(a);
		
		a -= b ;;  // a = a-b;와 동일
		System.out.println(a);
		
		a *= b ;;  // a = a*b;와 동일
		System.out.println(a);
		
		a %= b ;;  // a = a%b;와 동일
		System.out.println(a);
		
		System.out.println("_________________________________");
		
		char ch = 'A';
		// ch의 값을 2만큼 증가 시키기
		//	ch = ch+2; 오류 발생! char + int = int + int = int 이므로 형변환 필수!
		
		// 형변환 연산자를 사요하여 명시적 형변환을 수행하는 방법
		ch = (char)(ch+2);
		System.out.println(ch);
		// 복합 대입연산자를 사용하면 연산 과정에서의 자동 형변환이 일어나지 않는다.
		ch += 2; // char 타입 변수 ch 값을 2만큼 증가시킴 => int형으로 형변환이 일어나지 않는다!
		System.out.println(ch);
		
		System.out.println('1'+'2');
		
		
	}

}
