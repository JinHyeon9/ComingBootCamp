
public class test {

	public static void main(String[] args) {
		char ch = '!';
		System.out.println("문자 ch = " + ch);
		
		// 문자 ch 에 대한 대소문자 상호 변환
		// 문자 ch 가 대문자일 경우 소문자로 변환하여 출력하고,
		// 소문자일 경우 대문자로 변환하여 출력하고,
		// 그 외에는 그대로 출력
		if(ch >= 'A' && ch <= 'Z') { // 대문자 판별
			System.out.println("대문자를 소문자로 변환!");
			ch += 32;
		} else if(ch >= 'a' && ch <= 'z') { // 소문자 판별
			System.out.println("소문자를 대문자로 변환!");
			ch -= 32;
		} else {
			System.out.println("기타 문자이므로 변환 없음!");
		}
		
		System.out.println(ch);
		
		System.out.println("===============================");
		
		int score = 70; // 점수를 저장할 변수
		String grade = ""; // 학점을 저장할 변수
		
		/*
		 * if문을 사용하여 점수에 따른 학점 판별
		 * "A"학점 : 점수가 90 ~ 100
		 * "B"학점 : 점수가 80 ~ 89
		 * "C"학점 : 점수가 70 ~ 79
		 * "D"학점 : 점수가 60 ~ 69
		 * "F"학점 : 그 외의 점수
		 */
		
		
		if (score>=90 && score<=100) {
			grade="A";
		}
		else if (score>=80 && score<=89) {
			grade="B";
		}
		else if (score>=70 && score<=79) {
			grade="C";
		}
		else if (score>=60 && score<=69) {
			grade="D";
		} else System.out.println("그 외의 점수");
		
		System.out.println(score + " 점의 학점 : " + grade);
		
	}

}










