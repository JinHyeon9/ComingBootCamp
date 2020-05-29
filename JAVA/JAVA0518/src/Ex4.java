
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * - 1차원 배열이 여러개의 묶음으로 관리되는 배열
		 * - 행과 열로 이루어진 테이블 구조와 유사함
		 *   => 행, 열의 인덱스는 1차원 배열과 동일(0번부터 시작)
		 * - 2차원 배열에서 행 크기는 배열명.length 를 사용하여 알아낼 수 있으며,
		 *   열 크기는 배열명[행번호].length 를 사용하여 각 열의 크기를 알아낼 수 있다.
		 * 
		 * < 2차원 배열 선언 및 생성 기본 문법 >
		 * 데이터타입[][] 배열명 = new 데이터타입[행크기][열크기];
		 * 
		 * < 2차원 배열 접근 기본 문법 >
		 * 배열명[행번호][열번호]
		 * 
		 * < 2차원 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법 >
		 * 데이터타입[][] 배열명 = {
		 * 		{값1, 값2, ..., 값n}, // 0행(0열 데이터, 1열 데이터, ..., n열 데이터)
		 * 		{값1, 값2, ..., 값n}, // 1행(0열 데이터, 1열 데이터, ..., n열 데이터)
		 *           ..생략..
		 * 		{값1, 값2, ..., 값n}  // n행(0열 데이터, 1열 데이터, ..., n열 데이터)
		 * };
		 * 
		 */
		
		/*
		 * int형 2차원 배열 arr 생성하고 다음과 같은 형태로 데이터 저장
		 *  1(0,0)  2(0,1)  3(0,2)
		 *  4(1,0)  5(1,1)  6(1,2)
		 * => 2행 3열의 배열 필요
		 */
		int[][] arr = new int[2][3]; // 2행 3열 구조의 배열 생성
		// => 배열 변수 arr 에는 2행에 대한 주소값이 저장됨
		//    따라서, 배열 변수 arr을 따라가면 행에 해당하는 공간 생성되어 있음
		// => 배열 변수 arr 의 각 행에는 각 열에 대한 주소값이 저장됨
		//    따라서, 배열변수명[행번호] 를 따라가면 열에 해당하는 공간 생성되어 있음
		//    열 공간에는 실제 데이터가 저장됨
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 4;
//		arr[1][1] = 5;
//		arr[1][2] = 6;
		
		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		// 배열 크기 알아내기
		// 1. 배열의 행 크기 알아내기 = 배열명.length 사용
		System.out.println("배열 arr 의 행 크기 : " + arr.length);
		
		// 2. 배열의 각 행에 대한 열의 크기 알아내기 : 배열명[행번호].length 사용
		System.out.println("배열 arr 의 0번 행의 열 크기 : " + arr[0].length);
		System.out.println("배열 arr 의 1번 행의 열 크기 : " + arr[1].length);
		
		System.out.println("-----------------------------------");
		
		// 반복문을 사용하여 2차원 배열의 모든 요소에 접근하기
		for(int i = 0; i < 2; i++) { // 바깥쪽 for문 = 행 반복
			
			for(int j = 0; j < 3; j++) { // 안쪽 for문 = 열 반복
//				System.out.println(i + ", " + j);
				// i 와 j 를 사용하여 2차원 배열 행, 열에 해당하는 인덱스 지정
				System.out.println(arr[i][j]);
			}
			
		}
		
		// ------------ 위의 중첩 for문을 사용하여 2차원 배열 접근하는 다른 방법 ------------
		// => length 속성 활용하는 공식!
		// => 행크기는 배열명.length, 열크기는 배열명[행번호].length 를 활용하여 반복 수행
		for(int i = 0; i < arr.length; i++) { // 바깥쪽 for문 = 행 반복
			
			for(int j = 0; j < arr[i].length; j++) { // 안쪽 for문 = 열 반복
				System.out.println(arr[i][j]);
			}
			
		}
		
		System.out.println("===================================");
		
		// 2차원 배열 선언, 생성 및 초기화를 한꺼번에 수행
		int[][] arr2 = {
				{1, 2}, // 0번 행(0열 데이터, 1열 데이터)
				{3, 4}, // 1번 행(0열 데이터, 1열 데이터)
				{5, 6}  // 2번 행(0열 데이터, 1열 데이터)
		};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.println(arr2[i][j]);
			}
				
		}
		
		System.out.println("==================================");
		
		/*
		 * 학생 점수를 2차원 배열(score)에 다음과 같이 저장 후 출력
		 *         국어  영어  수학  
		 * 홍길동   80    70    80   
		 * 이순신   90    90    90
		 * 강감찬   50    60    77
		 * 김태희  100   100   100
		 * 전지현   80    80    60
		 * -------------------------
		 * < 학생별 총점 >
		 * 홍길동 : 230점    
		 * 이순신 : 270점
		 * 강감찬 : 187점
		 * 김태희 : 300점
		 * 전지현 : 220점
		 * -------------------------
		 * < 과목별 평균 >
		 * 
		 */
			
		// 학생 5명의 국어, 영어, 수학 점수 저장하는 2차원 배열 생성
		int[][] score = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60}
		};
		
		// 학생별 총점을 저장하는 1차원 배열(studentTotal) 생성
		int[] studentTotal = new int[5]; // 자동으로 0으로 초기화 됨
		/*
		 * 홍길동   80(0,0)  70(0,1)  80(0,2) => studentTotal[0] 배열에 누적
		 * 이순신   90(1,0)  90(1,1)  90(1,2) => studentTotal[1] 배열에 누적
		 * 강감찬   50(2,0)  60(2,1)  77(2,2) => studentTotal[2] 배열에 누적
		 * 김태희  100(3,0) 100(3,1) 100(3,2) => studentTotal[3] 배열에 누적
		 * 전지현   80(4,0)  80(4,1)  60(4,2) => studentTotal[4] 배열에 누적
		 */
//		studentTotal[0] += score[0][0];
//		studentTotal[0] += score[0][1];
//		studentTotal[0] += score[0][2];
//		studentTotal[1] += score[1][0];
//		studentTotal[1] += score[1][1];
//		studentTotal[1] += score[1][2];
//		studentTotal[2] += score[2][0];
//		studentTotal[2] += score[2][1];
//		studentTotal[2] += score[2][2];
//		studentTotal[3] += score[3][0];
//		studentTotal[3] += score[3][1];
//		studentTotal[3] += score[3][1];
//		studentTotal[4] += score[4][0];
//		studentTotal[4] += score[4][1];
//		studentTotal[4] += score[4][2];
		
		// 과목별 평균 계산을 위해 과목별 총점 누적
		int[] subjectTotal = new int[3]; // 0번 : 국어, 1번 : 영어, 2번 : 수학
		/*
		 *                국어           영어           수학
		 * 홍길동        80(0,0)        70(0,1)        80(0,2)
		 * 이순신        90(1,0)        90(1,1)        90(1,2)
		 * 강감찬        50(2,0)        60(2,1)        77(2,2)
		 * 김태희       100(3,0)       100(3,1)       100(3,2)
		 * 전지현        80(4,0)        80(4,1)        60(4,2)
		 * -------------------------------------------------------
		 *          subjectTotal[0] subjectTotal[1] subjectTotal[2]
		 */
		
		for(int i = 0; i < score.length; i++) { // 바깥쪽 for문(행반복)
			
			for(int j = 0; j < score[i].length; j++) { // 안쪽 for문(열반복)
				System.out.print(score[i][j] + "  ");
				
				// 각 학생별 점수를 studentTotal 배열에 누적
				// => 학생 점수의 행번호(i)와 학생별 총점의 인덱스가 동일함
				studentTotal[i] += score[i][j]; // 제어변수 i값을 총점 배열 인덱스로 활용
				
				// 각 과목별 총점을 subjectTotal 배열에 누적
				subjectTotal[j] += score[i][j];
			}
			
			System.out.println(); // 줄바꿈
			
		}
			
		System.out.println("--------------------");
		
		System.out.println("< 학생별 총점 >");
		System.out.println("홍길동 : " + studentTotal[0] + "점");
		System.out.println("이순신 : " + studentTotal[1] + "점");
		System.out.println("강감찬 : " + studentTotal[2] + "점");
		System.out.println("김태희 : " + studentTotal[3] + "점");
		System.out.println("전지현 : " + studentTotal[4] + "점");
		System.out.println("--------------------");
		
		System.out.println("< 과목별 평균 >");
		System.out.println("국어 : " + (subjectTotal[0] / (double)studentTotal.length) + "점");
		System.out.println("영어 : " + (subjectTotal[1] / (double)studentTotal.length) + "점");
		System.out.println("수학 : " + (subjectTotal[2] / (double)studentTotal.length) + "점");
		
		
		
	}

}

















