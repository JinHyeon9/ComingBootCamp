
public class Ex4 {
	public static void main(String[] args) {
		/*
		 * do ~ while 문 - while 문과 달리 조건식을 먼저 판별하지 않고 반복문을 먼저 한 번 실행(do)한 후 마지막 조건식을
		 * 판별하는 while문 do~while문은 무조건 한 번의 실행은 보장함
		 * 
		 * < 기본 문법 > 초기식:
		 * 
		 * do{ // 반복할 문장 증감식 } while(조건식); => 마지막에 실행할 문장
		 */

		int i = 11;

		while (i <= 10) {
			// 조건식 판별 결과가 false 이므로 while 블록 내의 문장은 한 번도 실행되지 않는다
			System.out.println("Hello World!");
			i++;
		}
		System.out.println(i);
		System.out.println("-------------------------------");
		
		i = 11;
		
		do {
			// 조건식 판별 결과는 false 이지만 do 문장을 만나 무조건 한번 실행한 후
			// 마지막에 조건식을 판별하여 false가 되면 종료함
			System.out.println(i + " : Hello World!");
			i++;
		} while (i <= 10);
		System.out.println(i);
	}
}
