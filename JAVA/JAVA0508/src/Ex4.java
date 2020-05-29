
public class Ex4 {
	public static void main(String[] args) {
			/* 
			 * 2. if ~ else 문
			 * - 특정 조건식 판별 결과가 true 일 때와 false 일 때 서로 다른 블록을 실행
			 * - 삼항 연산자와 유사한 형태로 수행되나 삼항연산자보다 유연함
			 * 
			 * <기본문법>
			 * 문장1:
			 * 
			 * if(조건문) {
			 * 		문장2: // 조건 결과가 true일 때 수행할 문장들
			 * } else {
			 * 		문장3: 조건식 결과가 false 일때 수행할 문장들
			 * }
			 * 
			 * 문장4:
			 */
		
		int num2 = 2;
		
		if (num2<0) {
			System.out.println( "num이 음수이므로 양수로 변환");
			num2 = -num2;
		} else {
			System.out.println("num이 양수이므로 변환 필요 없음");
		}
		System.out.println("num2의 절대값 : " + num2);
		
		System.out.println("------------------------------");
		
		// 정수 num에 대해 홀수, 짝수 판별
		
		if(num2%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
		
	}}
