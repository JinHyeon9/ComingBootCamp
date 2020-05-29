
public class Ex5 {
	public static void main(String[] args) {
		/*
		 * 반복문의 제어 - break 문과 continue 문을 사용하여 반복문을 제어 
		 * - 주로 if문과 조합하여 사용
		 * 
		 * 1. break 문
		 * - 반복문을 빠져나가기 위해 사용
		 * 
		 * 2. continue문
		 * - 반복문의 continue 문장 아래쪽 문장을 실행하고, 다음 반복을 진행
		 */

		for (int i = 0; i <= 10; i++) {
			System.out.println("Hello World!");

			// "i가 5일 때 반복을 종료합니다" 출력
			if (i == 3) {
				System.out.println("반복을 종료합니다");
				break; // for문 바깥으로 빠져나가서 for문 종료
				// => i가 5일 때 for문 종료
			}
		}

		System.out.println("for문 종료");
		
		System.out.println("=====================");
		
		for (int i = 0; i <= 10; i++) {

			// "i가 5일 때 반복을 종료합니다" 출력
			if (i == 5 ) {
				System.out.println("continue : 현재 반복을 생략합니다");
				continue; // 현재 문장 아래쪽의 나머지 문장 실행을 생략하고, 다음 반복 (i++)을 진행
				// => i가 5일 때 출력을 생략하고 6부터 다시 출력
			}
			System.out.println("Hello World!");
		}
		System.out.println("for문 종료");
		
		System.out.println("=====================");

		EXIT_FOR_I:
		for(int i = 1; i <= 10; i++) {  //바깥쪽 for문
			
			EXIT_FOR_J:
		for(int j = 1; j <= 10; j++) { // 안쪽 for문
			
			if ( j == 5) {
//				break // 안쪽 for문을 종료하고 빠져나감
//				continue; // 현재 안쪽 for문 반복을 생략하고 다음 안쪽 for문 반복 실행
				
				//EXIT_FOR_J 레이블을 지정하여 BREAK 혹은 CONTUNE 사용 시 기본과 동일
//				break EXIT_FOR_J;
//				continue EXIT_FOR_J;
				
//				break EXIT_FOR_I; // EXIT_FOR_I 레이블 지정 시 바깥쪽 FOR문 빠져나감
				continue EXIT_FOR_I; // 바깥쪽 for문 다음 반복 실행 = 다음 반복실행
			}
			
			System.out.println("i = " + i + ", j = " + j);
			
		}
		
	}
	}
}








