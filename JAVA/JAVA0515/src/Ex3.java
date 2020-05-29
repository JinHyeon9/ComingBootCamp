
public class Ex3 {
	public static void main(String[] args) {
		/*
		 * 변수의 적용 범위
		 * - 특정 메서드 내에서 선언된 변수를 로컬 변수라고 한다
		 *    이 변수는 선언된 시점부터 아래쪽 메서드 중괄호가 끝나는 지점까지만 유효함
		 */

		for (int i = 0; i <= 10; i++) {
			// for문에서 선언된 제어변수 i는 for문이 종료되면 제거 됨 (사용 불가능)
			System.out.println("hello world");
		} 	
//		System.out.println(i);
//		오류 발생! 변수 i는 for문 종료시 제거 되므로 존재하지 않는 변수

		
		int i = 0; // main() 메서드 내에서 선언된 변수로 현재 지점부터 끝나는 중괄호까지는 사용 가능함
		
		while(i <= 10) {
//			int num = 0 // 로컬변수 num은 while문 내에서만 사용 가능한데
							 // 조건식보다 아래쪽에 위치하므로 조건식에서는 접근이 불가능하며
							// while문이 한 바퀴 반복할 때 마다 새로운 변수 num이 매번 생성됨
			System.out.println("Hello World!");
			i++;
		}
				System.out.println(i); // while문보다 위에 선언된 변수이므로 while문이 끝나도 사용 불가능
	}
}
