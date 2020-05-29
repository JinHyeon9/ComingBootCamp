
public class Practice {
public static void main(String[] args) {
	for(int i = 1; i <= 100; i++) { // 정수 1 ~ 100 까지 반복
		int count = 0;

		for(int j = 1; j <= i; j++) { // 정수를 1 부터 자기자신까지 반복
			if(i % j == 0) { // 정수i 가 1부터 자기자신까지 차례대로 나누어 떨어질 때
				count++; // 카운트 증가
			}
		}
		
		if(count <= 2) { // 나누어 떨어지는 숫자가 2개 이하일 때
			System.out.print(i + " ");
		}}
	
}

}
