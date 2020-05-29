
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 기본형 변수와 참조형 변수(배열)의 차이점 - 기본형(Primitive Type) 변수는 스택 공간의 변수에 데이터를 직접 저장 -
		 * 참조형(Reference Type) 변수는 스택 공간의 변수에 데이터를 직접 저장하지 않고, 힙 공간에 생성된 실제 데이터가 저장된 공간의
		 * 주소값을 스택 공간의 변수에 저장한다. (ex. 배열, String 타입 문자열 등) => 저장된 주소값을 "참조"하여 실제 데이터에
		 * 접근하는 방식 => 저장된 주소값이 없을 경우, 참조 값이 없다는 의미의 null 이라는 특수 데이터 사용 (참조형 변수의 기본값이
		 * null 이다!)
		 * 
		 */

		int a1 = 10; // 변수 a 는 기본형 변수로, 변수에 데이터가 직접 저장됨
		System.out.println(a1); // 10 출력

		int[] arr = { 10 }; // 변수 arr 은 참조형 변수로, 데이터가 저장된 공간의 주소값이 저장됨
		System.out.println(arr); // [I@15db9742 출력(결과는 다름)
		// => 배열명만 지정하여 출력할 경우 배열이 생성된 곳(Heap 메모리)의 주소값이 출력됨
		// => 따라서, 배열명만 지정하지 않고, 반드시 배열명 뒤에 배열의 인덱스 지정 필수!

		System.out.println(arr[0]); // 배열 arr 이 가리키는 주소의 0번 인덱스 데이터 접근

		// String 타입 배열 공간에 데이터 초기화를 수행하지 않으면 기본 값 null로 초기화
		String[] str = new String[3];
		System.out.println(str[0]);

		System.out.println("============================================");

		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = { 7, 8, 9 };

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		b = a; // 참조형 변수 a 의 주소값을 참조형 변수 b 에 전달(복사)
		// => 기존에 b가 가리키던 4, 5, 6 이 저장된 배열 공간은
		//    더 이상 참조되지 않으므로, 가비지 컬렉터(GC)에 의해 제거됨(메모리 공간 자동 확보됨)
		for(int i = 0; i < a.length; i++) {
			System.out.println("a = " + a[i] + ", b = " + b[i] + ", c = " + c[i]);
		}
		
		System.out.println("--------------");
		
		a = c; // 참조형 변수 c 의 주소값을 참조형 변수 a 에 전달(복사)
		// => a가 1, 2, 3 을 가리키고 있다가, c 가 가리키는 7, 8, 9 공간을 가리키고
		//    b는 여전히 1, 2, 3 을 가리키고 있으므로 1, 2, 3 공간은 제거 대상이 아니다!
		for(int i = 0; i < a.length; i++) {
			System.out.println("a = " + a[i] + ", b = " + b[i] + ", c = " + c[i]);
		}
		
	}
}
