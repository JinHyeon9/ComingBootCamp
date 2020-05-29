
public class Ex2 {
	public static void main(String[] args) {

		/*
		 * if문을 사용하여 점수에 따른 학점 판별 "A"학점 : 점수가 90 ~ 100 "B"학점 : 점수가 80 ~ 89 "C"학점 : 점수가
		 * 70 ~ 79 "D"학점 : 점수가 60 ~ 69 "F"학점 : 그 외의 점수 단, 점수(score)가 0~100 사이가 아닐 경우
		 * "점수 오류" 출력하고 학점 계산 중단
		 */

		int score = 120;
		String grade = "";

		if (score >= 0 && score <= 100) { // 점수가 0에서 100 사이인지를 판별

			if (score >= 90 && score <= 100) {
				grade = "A";
			} else if (score >= 80 && score <= 89) {
				grade = "B";
			} else if (score >= 70 && score <= 79) {
				grade = "C";
			} else if (score >= 60 && score <= 69) {
				grade = "D";
			} else {
				grade = "F";
			}

			System.out.println(score + " 점의 학점 : " + grade);
		} else {
			System.out.println("점수 입력 오류!");
		}
		
		

	}
}
