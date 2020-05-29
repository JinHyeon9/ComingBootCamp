
public class test4 {
	public static void main(String[] args) {

		// 1. 문자 ch가 대문자일 대 "대문자!" 출력, 아니면 "대문자 아님!" 출력
		char ch = 'A';

		if (ch >= 'A' && ch <= 'Z') { // ch=>'65'&&ch<='90'과 동일
			System.out.println("대문자!");

		} else {

			System.out.println("대문자 아님!");
		}

		// 2. 문자 ch가 소문자일 때 대문자로 변환하여 출력하고 아니면 그대로 출력
		// ex) ch = 'r ' 일 때 'R' 출력, ch='A' 일 때 'A' 출력
		// 힌트. 소문자와 대문자의 아스키코드 값 차이는 32이다!
//					(소문자 -> 대문자로 변환시 아스키코드 값 32만큼 빼야함)

		if (ch >= 'a' && ch <= 'z') {
			// 소문자일 때 대문자로 변환하기 위해서 ch 값을 32만큼 감소시킴
			ch -= 32;
//			System.out.println("소문자 -> 대문자 변환 후 : " + ch); }
		} else {
//			System.out.println("변환되지 않은 문자 : " + ch); 
		}

		// if문과 else 문에서 출력문이 중복되므로 if문 판별종료 후 출력문을 작성하면 중복 제거
		System.out.println(ch);

	}
}
