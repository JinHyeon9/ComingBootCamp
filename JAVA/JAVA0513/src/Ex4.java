
public class Ex4 {
public static void main(String[] args) {
	/*
	 * 반복문?
	 * - 특정 조건에 따라 문장들을 반복 실행하는 문
	 * 
	 * 1. for문
	 * - 가장 기본적인 반복문
	 * - 초기식, 조건식, 증감식의 위치가 정해져 있어, 초보자가 익히기 쉬움
	 * - 반복 횟수가 정해져 있는 경우 주로 사용
	 * - 초기식에서는 반복 횟수를 판별하기 위한 조건식에서 사용됨
	 * 	  제어변수를 선언하거나 초기화하는 문장을 기술
	 * - 조건식에서는 반복 여부를 결정하기 위한 조건식을 결과가 true/false 가 되도록 기술
	 * - 증감식에서는 반복을 위한 조건식에 맞춰 제어변수가 변하도록 증가/감소 시키는 문장 기술
	 * 
	 * < 기본 문법 >
	 * for ( 초기식 : 조건식 : 증감식 ) {
	 * 			// 조건식의 결과가 true 일 때 반복 실행할 문장들
	 */
	
	
		System.out.println("1 Hello World!");
		System.out.println("2 Hello World!");
		System.out.println("3 Hello World!");
		System.out.println("4 Hello World!");
		System.out.println("5 Hello World!");
		System.out.println("6 Hello World!");
		System.out.println("7 Hello World!");
		System.out.println("8 Hello World!");
		System.out.println("9 Hello World!");
		System.out.println("10 Hello World!");
		
		
		
		System.out.println("====================");
		
		
		
		// 위의 문장 10개를 반복문을 사용하여 압축
		// => 제어변수 i가 1부터 10보다 작거나 같을 동안 1씩 증가하면서 반복
		//    "Hello, World!" 문자열을 출력
		// => 초기식 : 제어변수 i를 1로 초기화
		//    조건식 : 제어변수 i가 10보다 작거나 같다
		//    증감식 : 제어변수 i를 1씩 증가
		
		for (int i=1; i<=10; i++) {
			System.out.println("hello world!");
		}
		
		System.out.println("====================");
		
		
		/*
		 * 위의 for문에 대한 디버깅(Debugging) 과정
		 * ------------------------------------------------
		 *    초기식(i)       조건식( i <= 10)       실행결과              증감식(i++)
		 *       1                    true               "1: Hello World"              2
		 *       2                    true               "2: Hello World"              3
		 *       3                    true               "3: Hello World"              4
		 *       4                    true               "4: Hello World"              5
		 *       5                    true               "5: Hello World"              6
		 *       6                    true               "6: Hello World"              7
		 *       7                    true               "7: Hello World"              8
		 *       8                    true               "8: Hello World"              9
		 *       9                    true               "9: Hello World"              10
		 *     10                    true               "10: Hello World"             11
		 *     11                    false              for문을 종료하고 빠져나감             
		 */
		
		System.out.println("====================");
		
		
		// i가 1 ~ 10 가지 1씩 증가하면서 출력 => 1 2 3 4 5 6 7 8 9 10
		
		for (int i=1; i<11; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(" "); //줄바꿈 역할
		System.out.println("====================");
		
		// i가 2~10까지 2씩 증가하면서 출력 (홀수 출력) => 1 3 5 7 9
		
		for (int i=2; i<11; i+=2) {
			System.out.print(i + " ");
		}

		System.out.println(" "); //줄바꿈 역할
		System.out.println("====================");
		
		// i가 10 ~ 1 까지 1씩 감소하면서 출력 => 10 9 8 7 6 5 4 3 2 1 
		
		for (int i=10; i>0; i-=1) {
			System.out.print(i + " ");
		}
		
		/*
		 * 위의 for문에 대한 디버깅(Debugging) 과정
		 * ------------------------------------------------
		 *    초기식(i)       조건식( i>0)       실행결과              증감식(i-=1)
		 *       10                  true                   9                       9
		 *       9                    true                   8                       8               
		 *       8                    true                   7                       7              
		 *       7                    true                   6                       6               
		 *       6                    true                   5                       5              
		 *       5                    true                   4                       4              
		 *       4                    true                   3                       3            
		 *       3                    true                   2                       2              
		 *       2                    true                   1                       1             
		 *       1                    false                  0                       0              
		 *       0                    false              for문을 종료하고 빠져나감             
		 */
		
		
		
}
}
