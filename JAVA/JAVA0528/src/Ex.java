
public class Ex {

	public static void main(String[] args) {
		/*
		 * 레퍼러스 this (안에 주소값이 들어감)
		 * - 인스턴스 생성 시 생성된 인스턴스 주소가 자동으로 저장되는 레퍼런스 변수
		 *   (단, 개발자가 선언하는 것이 아닌 자바에 의해 자동으로 선언된 레퍼런스)
		 * - 생성자나 메서드 등에서 로컬변수를 선언했을 때, 
		 *   로컬변수 이름과 인스턴스 변수 이름이 같을 경우 
		 *   인스턴스 변수를 지정하기 위한 용도로 사용 
		 *   사용법 : s.인스턴스명 = this, 인스턴스변수명 형태로 사용
		 */
		
		Student s = new Student(1, "홍길동");
		System.out.println(s.id + ", " + s.name);
		s.showStudentInfo();
		
		System.out.println("------------------");
		Student s2 = new Student(2, "이순신");
		s2.showStudentInfo();
	}

}

class Student {
	// 인스턴스(멤버) 변수
	int id;
	String name;
	
	//              로컬변수 로컬변수
	public Student(int id, String name) {
		// 로컬변수와 인스턴스변수의 이름이 같을 때, 
		// 로컬변수가 선언된 메서드 내에서 변수명 지정 시 로컬변수로 인식 됨
		// id = id; // 잘못된 코드(오류는 X) => 로컬변수 값을 다시 로컬변수에 전달하는 코드
		// name = name; // 잘못된 코드(오류는 X) => 로컬변수 값을 다시 로컬변수에 전달하는 코드
		
		// 인스턴스 변수를 로컬변수와 구별하기 위해 레퍼런스 this 키워드를 사용해야 함
		// => 인스턴스 변수명 앞에 this
		this.id = id;
		this.name = name;
		//          여기에 있는 id와 name은 로컬변수!
	}
	
	public void showStudentInfo() {
		// 로컬변수 이름과 중복되지 않는 경우에는 레퍼런스 this 생략할 수 있다
		System.out.println("아이디 : "+ this.id); //
		System.out.println("이름 : "+ name); // 생략해도 됨(중복되는 이름이 없기 때문에)
		
	}
	
}















