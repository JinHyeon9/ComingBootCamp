
public class Test2 {
	
	public static void main(String[] args) {
		/*
		 * [5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
		 * 변수의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		 * 단 가능한 한 적은 수의 동전으로 거슬러 주어야한다.
		 * (1) 에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		 * [Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		 *
		 * [실행결과]
		 * money = 2680
		 * 500원 : 5
		 * 100원 : 1
		 * 50원 : 1
		 * 10원 : 3
		 */
		int[] coinUnit = {500, 100, 50, 10};
		
		int money = 2680;
		
		System.out.println("money = " + money);
		
		for(int i = 0; i < coinUnit.length; i++) {
			// 각 동전이 몇 개가 필요한지 출력 : 금액을 동전단위로 나눈 몫 계산
			System.out.println(coinUnit[i] + "원 : " + (money / coinUnit[i]));
			
			// 동전 갯수를 계산한 후에는 계산된 동전만큼을 차감(= 잔액 계산)
			// => 금액을 동전단위로 나눈 나머지 계산
			money = money % coinUnit[i]; 
		}
	}
	
}












