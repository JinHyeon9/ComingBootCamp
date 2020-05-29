
public class Test {

	public static void main(String[] args) {
		/*
		 * 1. 정수형 배열 arr 에 1 ~ 10 까지 차례대로 저장 후 출력
		 * 2. 정수형 변수 total 에 배열 내의 모든 데이터 합 계산하여 저장(= 합계 누적) 후 출력
		 * 3. 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
		 *    정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
		 * 
		 */
		
		int total = 0, evenTotal = 0, oddTotal = 0;
		
		// 1. 정수형 배열 arr 에 1 ~ 10 까지 차례대로 저장 후 출력
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		// 1-2. 다른 방법
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------");
		// 2. 정수형 변수 total 에 배열 내의 모든 데이터 합 계산하여 저장(= 합계 누적) 후 출력
		for(int i = 0; i < arr.length; i++) {
			total += arr[i]; // 배열의 i번 인덱스 데이터를 total 에 누적
		}
		
		System.out.println(total);
		
		System.out.println("-----------------------");
		// 3. 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장
		//    정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) { // 짝수
				evenTotal += arr[i]; // 짝수 합 누적
			} else { // 홀수
				oddTotal += arr[i]; // 홀수 합 누적
			}
		}
		
		System.out.println("짝수 합 : " + evenTotal);
		System.out.println("홀수 합 : " + oddTotal);
		
	}

}














