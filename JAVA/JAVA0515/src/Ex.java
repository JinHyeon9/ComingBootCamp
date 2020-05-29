
public class Ex {

	public static void main(String[] args) {
		// while 문을 사용하여 구구단 2단 출력
		int dan = 2;
		
		System.out.println(" < " + dan + "단 >");
		
		int i = 1;
		
		while(i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
		}
		
		System.out.println("============================");
		
		// while 문을 사용하여 정수 1 ~ 10 까지의 합 계산
		int total = 0; // 합계를 누적할 누적 변수
		int num = 1;
		while (num <= 10) {
			total += num;
			num++;
		} 	System.out.println("1 ~ 10까지의 합은 : " + total);
		
		
	}

}
