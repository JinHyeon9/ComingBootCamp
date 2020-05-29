
public class Ex4 {
	public static void main(String[] args) {
		/*
		 * ♥♥♥♥♥ 
		 * ♥♥♥♥♥ 
		 * ♥♥♥♥♥ ♥♥♥♥♥ ♥♥♥♥♥
		 * 
		 */

		for (int line = 1; line <= 5; line++) { // 전체 라인 수

			for (int i = 1; i <= 5; i++) { // 한 라인에서 출력할 별표의 개수
				System.out.print("♥");
			}
			System.out.println(" "); // 줄 바꿈
		}

		System.out.println("=============================");

		/*
		 * ♥ 
		 * ♥♥ 
		 * ♥♥♥ 
		 * ♥♥♥♥
		 * ♥♥♥♥♥
		 * 
		 * 
		 * ==========< 디버깅>==========
		 * 				  line               i
		 * 				   1               1~1
		 *  			   2               1~2
		 *  			   3               1~3
		 * 				   4               1~4
		 * 				   5               1~5
		 * 
		 */

		for (int line = 1; line <= 5; line++) {

			for (int i = 1; i <= line; i++) {
				System.out.print("♥");
			}
			System.out.println(" ");
		}
		
		System.out.println("=============================");
		
		/*
		 *  *****   =>  1번 라인 : 5개(5 4 3 2 1)   (1 2 3 4 5)
		 *  ****    =>  2번 라인 : 4개(5 4 3 2)      (1 2 3 4)
		 *  ***     =>  3번 라인 : 3개(5 4 3)         (1 2 3)
		 *  **      =>  4번 라인 : 2개(5 4)            (1 2)
		 *  *       =>  5번 라인 : 1개(5)               (1)
		 *  
		 * ==========< 디버깅>==========
		 * 				  line               i
		 * 				   5               5~4
		 *  			   4               4~3
		 *  			   3               3~2
		 * 				   2               2~1
		 * 				   1               1
		 */

		
		for (int line = 1; line <= 5; line++) {
			for (int i = 5; i >= line; i--) {
				System.out.print("♥");
			}
			System.out.println(" ");
		}

		System.out.println("=============================");

		
		

	}
}
