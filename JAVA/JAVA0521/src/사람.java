
/*
 *  클래스(class) 정의
 *  - 객체 분석 결과물을 토대로 설계도에 해당하는 클래스를 정의
 *  - 클래스 내에는 객체의 속성을 저장할 멤버변수을 선언하고, 객체의 동작을 저장할 메서드를 정의한다.
 *  - 아직 실체를 갖는 객체(=인스터스)가 아니므로 값을 저장할 필요는 없다
 *    (단, 필요에 따라 저장도 가능)
 *  <기본 문법>
 *  [접근제한자] class 클래스명 {
 *  			// 멤버변수
 *  			// 메서드
 *  }
 *  
 *  
 *  
 *  ex) 사람 클래스 정의
 *  	- 속성 : 이름, 나이, 키
 */

public class 사람 {
	// 객체의 속성을 저장하는 멤버변수 선언
	String 이름;
	int 나이;
	double 키;

}
