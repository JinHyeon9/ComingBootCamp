
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 접근제한자(Access Modifier = 접근제어자)
		 * - 대상에 대한 접근 범위를 제어하는 키워드
		 * - 클래스, 메서드, 변수 등에 사용 가능
		 * - 종류
		 *   1. public - 어디서든(누구나) 접근 가능
		 *   2. private - 자신의 클래스 내에서만 접근 가능(다른 클래스에서 접근 불가)
		 * 
		 * Getter/Setter 메서드
		 * - 클래스 내에서 private 접근제한자로 선언된 인스턴스 변수 등에 접근하기 위해
		 *   클래스 내에서 제공하는 중개 역할의 메서드
		 *   1. Getter : 내부 인스턴스 변수의 값을 외부로 리턴하는 메서드
		 *      => getXXX() 형식의 이름을 사용하여 메서드 정의
		 *         (XXX 은 접근할 인스턴스 변수의 이름 사용 => ex. 변수명 num = getNum())
		 *      => 파라미터는 없고, 리턴값만 있는 메서드 형태로 정의
		 *   2. Setter : 외부로부터 값을 전달받아 내부 인스턴스 변수에 저장하는 메서드
		 *      => setXXX() 형식의 이름을 사용하여 메서드 정의
		 *         (XXX 은 접근할 인스턴스 변수의 이름 사용 => ex. 변수명 num = setNum())
		 *      => 파라미터만 있고, 리턴값은 없는 메서드 형태로 정의
		 * - 접근제한자는 public 으로 선언
		 *   
		 */
		// Student 인스턴스 생성
		// id : "20201111", 이름 : "홍길동", 점수 : 80
		Student s = new Student();
		// private 접근제한자가 선언된 인스턴스 변수들은 참조변수를 통해 외부 접근이 불가능
//		s.id = "20201111";
//		s.name = "홍길동";
//		s.score = 80; // The field Student.score is not visible
		// => 클래스 내에서 private 으로 선언된 인스턴스 변수는 외부 접근 불가능(= 보이지 않음)
		
		// Getter/Setter 를 사용하여 인스턴스 변수에 접근하기
		// 1. Setter 를 사용하여 인스턴스 변수 초기화
		s.setId("20201111");
		s.setName("Jin");
		s.setScore(100);
		
//		System.out.println("id : " + s.id + ", 이름 : " + s.name + ", 점수 : " + s.score);
		
		// 2. Getter 를 사용하여 인스턴스 변수 데이터 출력
		System.out.println("id : " + s.getId());
		System.out.println("name : " + s.getName());
		System.out.println("score : " + s.getScore());
		
	}

}

class Student {
	
	
	// 인스턴스 변수에 접근제한자 private 지정 시 다른 클래스에서 접근 불가능
	// => 현재 자신의 클래스(Student) 내에서만 접근 가능함
	
	
//	// 외부에서 접근 불가능한 인스턴스 변수에 대신 접근하는 Getter/Setter 메서드 정의
//	// 1. 변수 id 에 대한 Getter/Setter 정의
//	public String getId() {
//		// 인스턴스 변수 id 값을 외부로 리턴
//		return id;
//	}
//	
//	public void setId(String newId) {
//		// 외부로부터 전달받은 id 값을 인스턴스 변수 id 에 저장
//		id = newId;
//	}
//	
//	// 2. 변수 name 에 대한 Getter/Setter 정의
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String newName) {
//		name = newName;
//	}
//	
//	// 3. 변수 score 에 대한 Getter/Setter 정의
//	public int getScore() {
//		return score;
//	}
//	
//	public void setScore(int newScore) {
//		score = newScore;
//	}
	
	
	
	//	------------------------------------------------------
	// Getter/Setter를 자동 정의 생성 방법
	// => 클래스 내에 커서를 투고 단축키 Alt+Shift+S 를 누름
	
	private String id;
	private String name;
	private int score;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	} 
}



















