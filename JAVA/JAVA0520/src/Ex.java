
public class Ex {
public static void main(String[] args) {
	/*
	 * 향상된 for문 
	 */
	
	// 정수형 데이터 5개를 저장하는 배열(arr) 생성 및 1,2,3,4,5로 초기화
	
	int arr[] = {1,2,3,4,5};
	int total = 0;
	
	for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		total += arr[i];
	}
	
	System.out.println(total);
	
	System.out.println("---------------------------------");
	
	// 향상된 for문 사용하기
	
	total = 0;
	
	for (int num : arr) { //배열의 arr의 각 인데스별 데이터를 차례대로 정수형 변수 num에 저장한다
		System.out.println(num);
		total += num;
	}
	System.out.println(total);
	System.out.println("---------------------------------");
}
}
