
public class Test3 {
	public static void main(String[] args) {
		// 바깥쪽 for문 i의 값이 1 ~ 10 까지 반복할 동안,
		// 안쪽 for문 j값이 1 ~ 5까지 반복

		for (int i = 1; i <= 10; i++) {
//			System.out.println(" i = " +i);
			for (int j = 1; j <= 5; j++)
				System.out.println(" i = " + i + " j = " + j);
		}

		/*
		 * 타이머 (XX분 XX초) => 분 (min : 0 ~ 59분), 초(sec : 0 ~ 59초)
		 */
		for (int min = 0; min <= 60; min++) {
			for (int mit = 0; mit <= 60; mit++)
				System.out.println(min + "분" + mit + "초");
		}

		System.out.println("-----------------------");

		/*
		 * 중첩 for문을 이용하여 구구단 2단부터 9단 출력
		 * 
		 * => 단(dan)이 2 ~ 9 까지 1씩 증가 이 때, 각 단에서 i 값이 1 ~ 9 씩 증가
		 */

		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("<" + dan + "단" + ">");
			for (int dan2 = 1; dan2 <= 9; dan2++) {
				int sum = dan * dan2;
				System.out.println(dan + " * " + dan2 + " = " + sum);
			}
			System.out.println(" ");
		}

	}
}
