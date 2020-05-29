
public class Ex2 {
	public static void main(String[] args) {
		/*
		 * 삼항연산자(조건연산자) ?:
		 * - 연산에 참여하는 항이 3개인 연산자
		 * - 앞에 오는 식에 대한 판별 결과가 true 일 때와 false 일 때 각각 다른 값을 선택
		 * 
		 * <기본문법>
		 * 평가식 ? 값1 : 값2;
		 * => 평가식 부분에는 결과가 TRUE 또는 FALSE에 해당하는 식 또는 값만 올 수 있음\
		 * => 평가식 결과가 TRUE일 경우 값1 부분의 값을 선택하여 사용하고
		 *      FLASE일 경우 값 2 부분을 선택하여 사용 (리턴)
		 */
		
		System.out.println(5 - 5 > 0 ? "0보다 크다" : "0보다 크지않다");
		// => 판별 결과가 true 일 경우 "0보다 크다!" 문자열이 리턴되므로
		//     System.out.println("0보다 크다") 이 문장의 실행 결과와 동일하게 실행
		// => 판별 결과가 false 일 경우 "0보다 크지않다!" 문자열이 리턴되므로
		//     System.out.println("0보다 크지않다") 이 문장의 실행 결과와 동일하게 실행
		
		int num = 10;
		System.out.println(num>=10 ? "num은 10이상이다" : "num은 10이상이 아니다");
		
		String result =  num>=10 ? "num은 10이상이다" : "num은 10이상이 아니다";
		System.out.println(result);
		
		/*
		 * 삼항연산자의 중첩 사용
		 * - 삼항 연산자의 값 1 또는 값 2 부분에서 다시 한 번 평가식을 평가하여
		 * 	   또 다른 값 1과 값 2를 선택하도록 하면 3가지 경우의 수가 나올 수 있다
		 * 
		 * <기본 문법>
		 * 평가식1 ? 값1 : 평가식2 ? 값2 : 값3
		 * => 평가식1 결과가 true이면 값1 선택
		 *      평가식1 결과가 false이고 평가식2 결과가 true이면 값2 선택
		 *      평가식1 결과가 false이고 평가식2 결과가 flase이면 값3 선택
		 */
		
		num = 11;
		System.out.println(
				num>10 ? "num은 10보다 크다" : num<10 ? "num은 10보다 작다" : "num은 10과 같다" );
	}
}
