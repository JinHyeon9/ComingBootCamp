
public class Ex3 {
	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 조건식 결과에 따라 실행할 문장이 달라지는 문
		 * - if문 계열과 switch ~ case 문으로 구분 됨
		 * 
		 * 1. if문
		 * 		- 가장 단순한 조건문
		 * 		- 조건식 판별 결과가 true 일 때 특정 문장(블록)을 추가로 실행하는 if문
		 * 
		 * <기본 문법>
		 * 문장1:
		 * 
		 * if(조건식) {
		 * 		// 조건식 판별 결과가 true 일 때
		 * 			문장2 :
		 * }
		 * 
		 * 문장3;
		 * 
		 * => 조건식 판별 결과가 true 일 때 : 문장 1 -> 조건식(true) -> 문장2 -> 문장3
		 * => 조건식 판별 결과가 false 일 때 : 문장1 -> 조건식(false) -> 문장3
		 * 
		 */
		System.out.println("프로그램 시작");
		
		int num = 4;
		
		if (num < 5) { //조건식
			// 이 블록 내의 문장(또는 문장들)은 num이 5보다 작을 때 (true일 때)만 실행됨
			System.out.println("num이 5보다 작다"); //문장2
		}
		
		System.out.println("프로그램 종료"); //문장3
		
		System.out.println("------------------");
		
		int num2 = -15;
		
		if (num2<0) {
			System.out.println( num2=-num2);
		}
		System.out.println("num2의 절대값 : " + num2);
		
		System.out.println("-------------------");
		
		System.out.println("아이티윌로 걸어서 출발!");
		
		int money = 6000;
		
		// 만약, 돈(money)이 5천원 이상일 경우 "택시타고 가기!" 출력
		
		if (money>5000) {
			System.out.println("택시타고 가기!");
		}
		
		System.out.println("아이티윌에 도착!");
		
		
		
		
		
	}
}
