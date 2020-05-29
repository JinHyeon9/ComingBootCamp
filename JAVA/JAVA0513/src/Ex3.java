
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * switch ~ case 문
		 * - if문처럼 특정 조건에 대해 여러가지 판별을 수행하여 각각 다른 문장을 수행하는 조건문
		 *   => 단, if문과 달리 범위에 대한 판별 등이 불가능하고, 동등 비교만 가능
		 * - switch 문의 조건식에는 연산식 또는 변수 또는 리터럴이 올 수 있으나
		 *   반드시 정수 또는 문자열(또는 Enum 상수) 이어야만 사용 가능
		 * - case 문의 값은 조건식 결과와 비교할 리터럴 1개만 명시 가능
		 * - 일치하는 case 문이 없을 때에는 default 문을 찾아서 실행함
		 * - break 문을 만나면 switch ~ case 문을 빠져나감
		 *   => break 문이 없을 경우 다음 break 문을 만나거나 switch 문이 종료될 때 까지
		 *      현재 문장 아래쪽의 문장들을 조건식 결과와 관계없이 차례대로 실행함
		 * - if문과 달리 case 문끼리의 순서는 상관없이 값만 나열하면 된다.
		 * - if문은 프로그램 실행 시점에서 실행할 위치가 결정되지만,
		 *   switch ~ case 문은 프로그램 컴파일(번역) 시점에서 실행 위치가 결정되므로 
		 *   실행 속도가 빠름
		 * 
		 * 
		 * < 기본 문법 >
		 * switch(조건식) {
		 * 		case 값1 : 
		 * 			// 조건식 결과가 값1 과 일치하는 경우 실행할 문장들...
		 * 			[break;]
		 * 		case 값2 : 
		 *			// 조건식 결과가 값2 와 일치하는 경우 실행할 문장들...
		 * 			[break;]
		 * 		case 값n : 
		 *			// 조건식 결과가 값n 과 일치하는 경우 실행할 문장들...
		 * 			[break;]
		 * 		default : 
		 * 			// case 문 중 일치하는 값이 없을 경우 실행할 문장들...
		 * }
		 */
		
		int num = 3;
		
		switch(num) { // switch 문의 조건식 부분에는 정수 또는 문자열만 올 수 있다!
			case 1 : 
				System.out.println("num = 1");
				break; // switch ~ case 문을 빠져나감
			case 2 : 
				System.out.println("num = 2");
				break; // switch ~ case 문을 빠져나감
			case 3 : 
				System.out.println("num = 3");
				break; // switch ~ case 문을 빠져나감
			default :
				// 모든 case 문에서 일치하는 값이 없을 경우 실행할 문장들...
				System.out.println("num = 기타");
//				break; // 마지막 default 문(default 가 없을 경우 마지막 case 문)에는 break 생략 가능
		}
		
		System.out.println("switch ~ case 문 종료!");
		
		System.out.println("------------------------");
		
		num = 2;
		
		switch(num) { // switch 문의 조건식 부분에는 정수 또는 문자열만 올 수 있다!
			case 1 : 
				System.out.println("num = 1");
			case 2 : 
				System.out.println("num = 2");
			case 3 : 
				System.out.println("num = 3");
			default :
				System.out.println("num = 기타");
		}
		
		System.out.println("switch ~ case 문 종료!");
		
		// => num = 2 일 때 case 2 의 문장을 실행한 후 break 문이 없으므로
		//    다음 break 문을 만나거나 switch 문이 끝날 때 까지
		//    아래쪽의 문장들을 조건과 관계없이 실행하게 된다.
		// => 따라서, num = 2 가 출력된 후 num = 3 출력, num = 기타 문장도 출력됨
		
		System.out.println("==================================");
		
		int score = 88;
		
		switch(score) {
			case 100 : System.out.println("A학점"); break;
			case 99 : System.out.println("A학점"); break;
			case 98 : System.out.println("A학점"); break;
			// .... 생략 ....
			case 89 : System.out.println("B학점"); break;
			case 88 : System.out.println("B학점"); break;
		}
		
		// switch ~ case 문으로 학점 계산 시 범위 지정이 불가능하므로 점수 각각의 비교 필요
		// 단, 위의 코드를 짧게 줄이기 위해 연산식을 사용할 수 있음
		switch(score / 10) {
			case 10 : // 결과값이 10일 때 break 문이 없으므로 case 9 문장을 실행
			case 9 : System.out.println("A학점"); break;
			case 8 : System.out.println("B학점"); break;
			case 7 : System.out.println("C학점"); break;
			case 6 : System.out.println("D학점"); break;
			case 5 : // 결과값이 1 ~ 5 일 때
			case 4 : // 실행할 문장이 0과 동일하므로
			case 3 : // break 문 없이 빈 문장으로 놔둔 후
			case 2 : // 마지막 case 0 에 실행할 문장 작성 시
			case 1 : // case 0 ~ 5 까지 하나의 문장으로 처리됨
			case 0 : System.out.println("F학점");
		}
		// => 문제점 101 ~ 109 점까지의 점수가 A 학점으로 취급됨
		// => switch ~ case 문 판별 전 if문을 사용하여 0 ~ 100 사이의 점수만 계산에 사용
		System.out.println("=====================");
		
		score = 108;
		
		if(score >= 0 && score <= 100) {
			// 점수가 0 ~ 100 사이일 때만 switch 문을 실행
			switch(score / 10) {
				case 10 : // 결과값이 10일 때 break 문이 없으므로 case 9 문장을 실행
				case 9 : System.out.println("A학점"); break;
				case 8 : System.out.println("B학점"); break;
				case 7 : System.out.println("C학점"); break;
				case 6 : System.out.println("D학점"); break;
				default : System.out.println("F학점");
				// => F 학점은 정상 범위 내에서 D 학점보다 점수가 작은 모든 점수는 F 학점이므로
				//    default 문을 사용하면 F 학점에 대한 모든 판별이 가능함
			}
		} else {
			System.out.println(score + " : 점수 입력 오류!");
		}
	
		
	}

}

























