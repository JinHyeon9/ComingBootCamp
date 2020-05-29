
public class Ex1 {
	public static void main(String[] args) {
		/*
		 *  for문을 사용하여 특정 단의 구구단 출력
		 *  
		 *  <2단>
		 *  2 * 1 = 2
		 *  2 * 2 = 4
		 *  2 * 3 = 6
		 *  2 * 4 = 8
		 *  2 * 5 = 10
		 *  2 * 6 = 12
		 *  2 * 7 = 14
		 *  2 * 8 = 16
		 *  2 * 9 = 18
		 */
		
		int dan = 2;
		int  i = 1;
		
		System.out.println(" < " + dan + "단 >");

		
		for (i=1; i<=9; i++ ) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
	}
}
