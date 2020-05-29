
public class Test2 {
	public static void main(String[] args) {
		// for문과 if 문을 조합하여
		// 1에서 10까지의 정수 중에서 짝수만 누적하기

//		 int total = 0;
//		 
//		 for (int i=1; i<=10; i++) {
//			 if (i % 2 == 0) {
//				 total += i;			 
//				 }
//			 System.out.println(total);
//			 }

		// 1에서 10까지의 정수 중에서 짝수는 evenTotal, 홀수는 oddTotal에 누적 후 출력

		int oddTotal = 0, evenTotal = 0;

		int i;

		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수일 때
				evenTotal += i;
			} else
				oddTotal += i; // 홀수 일 때
		}

		System.out.println("1 ~ 10까지의 홀수 합 : " + oddTotal); // 25
		System.out.println("1 ~ 10까지의 짝수 합 : " + evenTotal); // 30
	}
}
