
public class Test {
	public static void main(String[] args) {

		// 4-2. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오

		int total = 0;
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				System.out.println("2의 배수도 아니고 3의 배수도 아닌 수 : " + i);
				total += i;
			}
		}
		System.out.println("합계 :" + total);

		// 4-8 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++)
				if ((2 * i + 4 * j) == 10) {
					System.out.println("x = " + i + "y =" + j);
				}
		}

//		 5-1 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.

//		 a. int[] arr[] // 대괄호 위치가 분산되어도 동일하게 취급 됨 = 2차원 배열
//		 b. int arr = {1,2,3}; //초기화 데이터만 입력됐을 경우 데이터가 없는 것으로 간주되므로, 즉, 3개의 데이터가 저장되는 배열이 생성됨
//		 c. int arr = new int [5];
//		 d. int arr[5];
//		 e. int arr = new int[5] {1,2,3,4,5} 

		// 5-2

	}
}
