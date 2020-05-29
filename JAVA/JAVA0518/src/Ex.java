
public class Ex {
public static void main(String[] args) {
	/*
	 * < 배열 생성과 동시에 리터럴을 지정하여 초기화를 수행하는 방법 >
	 * 데이터타입[] 배열명 = {값1, 값2, ..., 값n};
	 * => 값의 갯수에 따라 자동으로 배열을 생성하고 초기화 수행(0번 인덱스부터 차례대로 부여)
	 * => 주의! 다음 문장 형태는 사용 불가!
	 *    데이터타입[] 배열명 = new 데이터타입[배열크기]{값1, 값2, ..., 값n};
	 * => 주의! 문장을 분리하여 사용할 경우 다음 문장 형태 사용 불가!
	 *    데이터타입[] 배열명; // 배열 변수 선언을 먼저 한 뒤
	 *    배열명 = {값1, 값2, ..., 값n}; // 초기화 문장을 따로 분리할 수 없음!
	 * 
	 * < 배열 생성 후 별도로 값을 한꺼번에 초기화를 수행하는 방법 >
	 * 데이터타입[] 배열명;
	 * 배열명 = new 데이터타입[]{값1, 값2, ..., 값n};
	 * => 배열 변수를 별도로 선언한 후 배열 생성 코드를 사용하여 한꺼번에 초기화 가능
	 *    단, 데이터타입 뒤에 [배열크기] 를 직접 명시하면 오류 발생하므로 배열크기 생략!
	 *
	 */
	
	// int형 배열 arr 을 선언하면서 변수 1,2,3,4,5 로 초기화
	
	int [] arr = {1,2,3,4,5}; // 5개짜리 int형 배열 공간이 생성되면서 자동 초기화
	
	// 배열 arr의 모든 요소 출력
	for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	// int형 배열 arr2를 선언 후 별도로 정수 1,2,3,4,5로 한꺼번에 초기화
	
	int [] arr2;
	arr2 = new int[]{1,2,3,4,5};
	for (int i=0; i<arr2.length; i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("====================================");
	
	// String 타입 배열 strs에 문자열 hello, world, java를 초기화후 출력
	
	String [] strs = {"Hello", "world", "Java"};
	for (int i=0; i<strs.length; i++) {
		System.out.println(strs[i]);
	}
	
	System.out.println("====================================");
	
	// 배열 선언 시 [] 위치에 따른 차이점
	// 다음 두 문장은 둘 다 배경을 선언하는 방법
	int [] arr3; // 자바에서 주로 사용
	int arr4[]; // C에서 주로 사용
	
	// 다음 두 문장은 배열 선언 결과가 다른 문장
	int[] arr5, a66; // arr5, arr6 모두 배열 타입 변수
	int arr7, arr8[]; 
	
	
	System.out.println("=======================================");
	
	int[] gugudan2 = new int[9];
	
	int dan = 2;
	
	for(int i = 0; i < gugudan2.length; i++) {
//		System.out.println(dan + " * " + (i + 1) + " = " + (dan * (i + 1)));
		// 배열의 각 인덱스에 구구단 결과값을 차례대로 저장
		// 0번 인덱스 : 2 * 1 = 2 결과 저장
		// 1번 인덱스 : 2 * 2 = 4 결과 저장
		// ...
		// 8번 인덱스 : 2 * 9 = 18 결과 저장
		gugudan2[i] = dan * (i + 1);
		System.out.println(gugudan2[i]);
	}


}
}
