
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 파라미터 생성자 정의
		 * - 일반 메서드와 동일하게 선언부 소괄호() 안에 파라미터 변수를 선언하는 생성자
		 * - 주의! 파라미터 생성자를 하나라도 정의하게 되면, 기본 생성자가 자동으로 생성되지 않음
		 *   => 따라서, 인스턴스 생성 시 기본 생성자 호출 코드가 있으면 오류 발생하게 됨!
		 *      (파라미터가 일치하지 않는 메서드를 호출하는 것과 동일한 상황)
		 */
		
//		Student2 s = new Student2(); // 기본생성자 Student2() 호출 => 오류 발생!
		// => 파라미터 생성자가 정의되어 있으므로 기본생성자가 자동 생성되지 않음
		
		// 메서드와 동일하게 파라미터 갯수 및 타입이 일치하도록 데이터 전달 실시!
		Student2 s = new Student2(20201111, "홍길동");
		System.out.println("아이디 : " + s.id + ", 이름 : " + s.name);
		
	}

}

class Student2 {
	int id;
	String name;
	
	// Student2() 기본 생성자 정의
//	public Student2() {
//		id = 20201111;
//		name = "홍길동";
//	}
	
	
	public Student2() {
		
	}
	
	// Student2() 파라미터 생성자 정의
	// => 생성자를 직접 정의했기 때문에, 기본 생성자는 더이상 자동으로 생성되지 않는다!
	public Student2(int newId, String newName) {
		// 아이디(newId)와 이름(newName)을 전달받아 멤버변수를 초기화
		System.out.println("Student2(int, String) 생성자 호출됨!");
		id = newId;
		name = newName;
	}
	
	
}






















