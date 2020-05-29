
public class Ex2 {
	public static void main(String[] args) {
		/*
		 *  반복문을 사용한 합계 계산 (= 연산의 누적)
		 *  1. 연산을 누적할 누적변수를 선언 및 초기화
		 *  2. 반복문을 사용하여 특정 범위 반복
		 *  3. 반복문 내에서 특정 데이터를 누적 변수에 누적
		 *  4. 반복문 종료 후 누적데이터 변수를 출력
		 */
		
		
		// 1 ~ 10까지의 합(total)을 계산하여 출력
		int total = 0; //누적 변수 선언 및 초기화 (합계 계산을 위해 0으로 초기화)
//		
//		for (int i=1; i<=100; i++) {
//			// 누적변수 total에 i값을 누적
//			total += i; // total = total + i
//			System.out.println("1부터" +i+ "까지의 합 : " +total);
		
		int num = 1; //누적 변수 선언 및 초기화 (합계 계산을 위해 0으로 초기화)
		
		for (int i=1; i<=10; i++) {
			// 누적변수 total에 i값을 누적
			total += num;
			num++;
			System.out.println("1부터" +i+ "까지의 합 : " +total);
		}
	}
}
