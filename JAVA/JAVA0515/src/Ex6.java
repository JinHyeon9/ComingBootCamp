
public class Ex6 {
public static void main(String[] args) {
	/*
	 * 배열 (Array)
	 * - 같은 타입의 여러개의 변수를 하나의 묶음으로 다루는 메모리 공간
	 * 
	 * [ 특징 ]
	 * 1. 같은 타입의 값들만 저장 가능함
	 * 2. 기본 데이터 타입 참조 데이터타입 모두 배열로 저장 가능
	 * 3. 여러 개의 변수가 연속된 공간에 차례대로 생성
	 * 	    =>한번 생성된 변수는 크기 변경 불가능
	 * 4. 배열은 선언, 생성, 초기화 3단계의 과정을 거쳐서 사용함
	 * 5. 배열 생성 시 자동적으로 기본값으로 초기화 됨
	 * 		(int형 기본값 : 0, double 기본값: 0.0, boolean 기본값 : false)
	 * 6. 배열 생성시 인덱스 번호가 자동으로 부여되며 인덱스 번호는 0 ~ 배열크기-1 까지 사용된다.
	 * 7. 배열 명을 사용하여 배열을 관리할 수 있다 (인덱스 번호 지정)
	 * 8. 배열 크기는 배열명.length 속성을 사용하여 알아낼 수 있다.
	 * 
	 * all the movies are in my head all the people all my friends
	 * i hope they all get the happy ending
	 * 
	 * 
	 * < 배열 선언 기본 문법 >
	 * 데이터타입[] 변수명:
	 * => 변수 선언 방법과 유사하나 데이터 타입 뒤에 [] 기호를 붙여서 배열을 표시
	 * => 배열 공간이 생성되기 전이므로 아직 데이터 저장은 불가능
	 * 
	 * < 배열 생성 >
	 * 변수명 = new 데이터타입[배열크기];
	 * => new 키워드를 사용하여 배열 공간을 생성하는데
	 * 		데이터 타입 뒤의 대괄호 안에 배열 크기 명시
	 * => 생성된 배열의 위치(주소값)를 선언된 배열 타입 변수에 저장
	 * => 실제 메모리 공간이 실제 되므로 데이터 저장이 가능해짐
	 * => 생성된 배열에는 자동으로 인덱스 번호가 부여되며 0부터 차례대로 인덱스가 부여됨
	 * 		(즉, 배열 인덱스는 배열크기-1)
	 * 
	 * < 배열 접근 기본 문법 >
	 * 변수명[인덱스 번호] 형태로 배열 공간에 접근
	 * => 지정된 배열의 인덱스에 접근하여 데이터 저장 또는 가져오기 가능
	 * 
	 * < 배열 선언 및 생성을 하나의 문장으로 결합한 문장>
	 * 데이터타입[] 변수명 = new 데이터타입[변수명]
	 * 
	 * < 배열의 모든 요소(인덱스)에 접근하는 반복문 공식>
	 * for (int i = 0; i < 배열명.length; i++){
	 * 		 // 배열 인덱스 접근
	 * 
	 * 		}
	 */
	
			// 학생 점수 5개를 변수에 저장해야할 경우
			// => 각각의 변수를 별도로 선언하여 각 데이터를 저장해야함
			int score1 = 90, score2 = 50, score3 = 40, score4 = 30, score5 = 2;
			System.out.println(score1);
			System.out.println(score2);
			System.out.println(score3);
			System.out.println(score4);
			System.out.println(score5);
			System.out.println("------------------------------------");
			
			// 학생 점수 5개를 저장할 배열 선언 및 생성, 초기화
			// 1. 배열 선언
			
			int [] score; // int형 배열이 저장될 배열 변수 score 선언
							
			// 2. 배열 생성
			score = new int[10]; // 5개의 int형 정수가 저장될 연속적인 공간이 생성되고
									    // 생성된 공간의 메모리 주소값이 변수 스코어에 저장 된다.
										// => 이때, 5개의 공간에는 각각의 인덱스 주소가 생성된다.
			
			// 3. 배열 접근 및 초기화 (기본 값으로 자동으로 초기화 되어 있음)
//			System.out.println(score); // 배열명을 사용하여 그냥 출력할 경우 주소값이 출력됨. (데이터 X)
			System.out.println(score[0]); // score 배열의 0번 인덱스를 출력하는 코드
			System.out.println(score[1]);
			System.out.println(score[2]);
			System.out.println(score[3]);
			System.out.println(score[4]);
			// 생성된 배열의 인덱스 범위를 벗어나는 배열에 접근할 경우 오류 발생
			// => 문법적으로는 오류가 없으므로 실행 시점에서 오류가 발생
//			System.out.println(score[5]); // 오류 발생!
			// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
			// at Ex6.main(Ex6.java:72)
			// => 배열 범위를 벗어난 인덱스 5 때문에 문제가 발생함. Ex6.java 파일의 69번 라인에 문제.
			
			// 배열에 데이터 저장 (초기화)
			score[0] = 90;
			score[1] = 80;
			score[2] = 70;
			score[3] = 60;
			score[4] = 50;
			
			// 반복문을 사용하여 배열의 모든 인덱스에 접근하는 방법
			// => 배열의 인덱스 번호 자리를 변수로 대체 가능하다!
			
			//		for (int i = 0; i<5; i++) {
			//			System.out.println(i + "번 배열 인덱스 데이터" + score[i]);
			//			}
			//			

			System.out.println("배열 score의 크기 : " + score.length); 

			
			// 반복문 사용 기본 공식
			for (int i = 0; i<score.length; i++) { //배열크기-1 까지 접근 가능
					System.out.println(i + "번 배열 인덱스 데이터" + score[i]);
			}

			System.out.println("배열 score의 크기 : " + score.length); 
			
			System.out.println("================================");
			
			// int형 배형 arr 선언 및 5개 공간 선언
			//	int [] arr;
			//	arr = new int[10];
			// 위의 두 문장을 하나로 결합
			int [] arr = new int [5];
}
	
			
}
