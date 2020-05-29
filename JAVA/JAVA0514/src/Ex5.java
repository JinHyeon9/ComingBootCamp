
public class Ex5 {
	public static void main(String[] args) {
		/*
		 * while문 - for문과 마찬가지로 특정 조건식 결과가 true일 동안 반복 수행하는 반복문 - for문과 달리 조건식 위치만
		 * 정해져있고, 초기식과 증감식 위치는 유동적 - for문은 주로 반복 횟수가 정해져 있는 경우 사용하며, while문은 주로 반복 횟수가
		 * 정해져 있지 않은 경우 사용
		 * 
		 * 
		 * <기본 문법> 초기식 :
		 * 
		 * while(조건식) { //조건식 결과가 true이 때 반복할 문장 // 증감식 (반복할 문장보다 위에 위치할 수도 있다 }
		 */

		for (int i = 1; i <= 10; i++) {
			System.out.println("Hello World!");
		}

		// 위의 for문을 while문으로 변환
		int i = 1; // 초기식

		while (i <= 10) {
			System.out.println(i + "Hello World!"); // 조건식 결과가 true일 때 실행할 문장
			i++; // 증감식
		}

		System.out.println("=================================");

		// 1 ~ 10 까지 1씩 증가하면서 반복 => 1 2 3 4 5 6 7 8 9 10

		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}

		// 위의 for문을 while문으로 변환

		System.out.println();
		System.out.println("================================");

		i = 1;

		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();
		System.out.println("================================");

		// 1 ~ 10 까지 2씩 증가하면서 홀수 출력 => 1 3 5 7 9

		i = 1;

		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		

		System.out.println();
		System.out.println("================================");

		// 2 ~ 10 까지 2씩 증가하면서 짝수 출력 => 2 4 6 8 10
		i = 2;

		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		System.out.println("================================");

		// 10 ~ 1 까지 1씩 감소하면서 i 출력 => 10 9 8 7 6 5 4 3 2 1
		i = 10;

		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}

	}
}
