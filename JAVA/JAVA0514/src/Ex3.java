
public class Ex3 {
	public static void main(String[] args) {
		
		/*
		 * 중첩 for문
		 * - for 문 안에 또 다른 for문을 기술하는 것
		 * 바깥쪽 for문과 안쪽 for문으로 구분됨
		 * => 바깥쪽 for문이 1바퀴 돌 때 안 쪽 for문은 여러바퀴를 돈다
		 * 		(= 즉, 안쪽 for문 반복 횟수가 바깥쪽 for문 반복횟수보다 많다)

		 * <기본 문법>
		 * 		for (초기식1; 조건식; 증감식1) { // 바깥쪽 for문
		 * 
		 * 		   문장1; // 조건식1이 true 일 때 실행되는 문장
		 * 
		 * 
		 * 			 // 조건식1 이 true일 때 실행되는 문장2 (안쪽 for문을 지정된 횟수만큼 반복 실행)
		 * 			 for (초기식2; 조건식2' 증감식2) { // 안쪽 for문
		 * 
		 * 				문장2;  // 전체 반복 횟수 : 안쪽 for 문 * 바깥쪽 for 문 반복횟수
		 * 			}
		 * 
		 * 		}
		 *  문장 3; // 안쪽 for문 반복된 후 종료된 후 실행되는 문장 
		 */
		
		
		// 바깥쪽 for문 : i 값이 1 ~ 3까지 1씩 증가하면서 반복
			for (int i=1; i<=3; i++) {
				System.out.println(" i = " + i);
				// 안쪽 for문 : j값이 1 ~ 2 까지 1씩 증가하면서 반복
				for (int j=1; j<=2; j++) {
					System.out.println(" ----------------------> j = " + j);
				}
				
				System.out.println("안쪽 for문 반복 종료");
			}
				System.out.println("바깥쪽 for문 반복 종료");			
			
			

		
	}
}
