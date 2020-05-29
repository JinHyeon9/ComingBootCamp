
public class Ex {

	public static void main(String[] args) {
		/*
		 * 정의된 클래스에 대한 인스턴스(객체) 생성 = 구현단계 - 힙(Heap) 메모리 공간에 인스턴스를 생성하여, 생성된 인스턴스의 주소값을
		 * 참조형 변수에 저장하여, 참조변수를 통해 인스턴스에 접근하도록 함.
		 * 
		 * <기본 문법> 클래스명 참조변수명 = new 클래스명(); 
		 * => new 키워드를 통해 인스턴스가 Heap 공간에 생성되고 참조변수에 생성된
		 * 인스턴스 주소가 저장됨
		 * 
		 * <인스턴스의 멤버에 접근하는 기본 문법> 
		 * 참조변수명, 멤버변수명 또는 참조변수명.메서드() 형태로 접근
		 */

		
		
		
		
//		Animal 클래스의 인스턴스 생성
//		Animal ani; // Animal 클래스 타입 참조변수 선언
//		ani = new Animal(); 참조변수명 = new 클래스명();
//							Animal 인스턴스 생성
		
// 		=> 한줄로 압축
		Animal ani = new Animal();
		
		// 참조변수를 사용하여 생성된 인스턴스에 접근한 뒤 인스턴스 변수 값 변경
		ani.name = "멍멍이"; // 인스턴스 내의 변수 name 값을 "멍멍이"로 변환
		ani.age = 3; // 인스턴스 내의 변수 age 값을 3으로 변경
		
		System.out.println(ani.name);
		System.out.println(ani.age);
		
		// 멍멍이에 해당하는 인스턴스가 생성된 상태
		
		System.out.println("-------------------------------------------------------");
		
		// 멍멍이는 그대로 두고 새로 야옹이에 해당하는 인스턴스 발생
		
		Animal ani2  = new Animal();
		
		ani2.name = "야옹이";
		ani2.age = 3;
		
		System.out.println(ani2.name);
		System.out.println(ani2.age);
		
		// Animal 타입 ani2 인스턴스가 생성되더라도
		// 기존의 ani 인스턴스는 그대로 유지됨
		
		
		System.out.println(ani.name);
		System.out.println(ani.age);
		
		System.out.println("-------------------------------------------------------");

		
		// Studnet 클래스의 인스턴스 생성 (참조변수명 : s)
		
		Student s = new Student();
		s.id = 20201111;
		s.name = "홍길동";
		s.className = "빅데이터";
		
		
		System.out.println(s.id +" "+ s.name +" "+  s.className);
		
		System.out.println("-------------------------------------------------------");

		Student jin = new Student();
		jin.id = 12345;
		jin.className = "JAVA CODING!";
		jin.name = "JIN HYEON";
		
		System.out.println(jin.id + " " + jin.className + " " +jin.name);
	}

}



// 하나의 java 파일에 여러개의 클래스를 정의할 수도 있다
// 단,java 파일 이름과 동일한 클래스 앞에 public이 붙지만
// 그 외의 클래스는 punblic 키워드를 제외하고 클래스 정의 해야함

// 학생(student) 클래스 정의
// 속성 : 학번(id, 정수형), 이름(name, 문자열), 학과명(className, 문자열)
class Student{
	
	int id;
	String name;
	String className;
	
	
	
	
}

















