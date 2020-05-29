
public class Ex1 {
public static void main(String[] args) {
	/*
	 * 다중 if ~ else if문
	 * - 두 가지 이상의 조건식을 사용하여 세 가지 이상의 경우의 수를 판별하는 if문
	 * - 모든 조건이 만족하지 않았을 때 실행할 문장을 작성하려면 else 문을 이용
	 * 
	 * 
	 * <기본 문법>
	 * if(조건식) {
	 * 		// 조건식1의 결과가 true 일때 실행할 문장들 }
	 * else if(조건식2) {
	 * 		// 조건식 1의 결과가 false이고 조건식 2의 결과가 true 일 때 }
	 * 
	 * 주의! 
	 */
	
	
	// 홀수, 짝수, 0에 대한 판별
	
	int num = 5;
	
	if(num%2 == 1) {
		System.out.println(num+ "홀수");
	} else if (num%2 == 0) {
		System.out.println(num + "짝수");
	} else  {
		System.out.println(num + "0입니다");
	}
	
	
	
	if(num%2 == 1) {
		System.out.println(num+ "홀수");
	} else if (num == 0) {
		System.out.println(num + "0입니다");
	} else  {
		System.out.println(num + "짝수");
	}
	
	System.out.println("---------------------------");
	
	num = 15;
	



	if(num>5 ) { //num이 5보다 클 경우
		System.out.println("num이 5보다 크다");
	} else if (num>10) { //num이 10보다 클 경	우
		System.out.println("num이 10보다 크다");
		// => num > 5 조건식에 포함되는 조건이므로 실행될 수 없다
	} else
		System.out.println();
	}
	}
