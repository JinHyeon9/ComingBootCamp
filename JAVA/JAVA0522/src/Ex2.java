
public class Ex2 {

	public static void main(String[] args) {
		// Animal 클래스 인스턴스 생성
		// 클래스명 참조변수명 = new 클래스명();
		Animal ani = new Animal();
		
		// Animal 인스턴스의 멤버변수에 데이터 저장 후 출력
		// => 이름 : "멍멍이", 나이 : 3
		// 참조변수명.멤버변수명 형태로 변수에 접근
		ani.name = "멍멍이";
		ani.age = 3;
		System.out.println("이름 : " + ani.name);
		System.out.println("나이 : " + ani.age);
		
		// Animal 인스턴스의 메서드 cry() 호출
		// => 파라미터 없음, 리턴값 없음
		ani.cry();
		
		
		// 또다른 Animal 클래스의 인스턴스 생성(ani2)
		// => 이름: "야옹이", 나이 : 2 초기화 및 출력, cry() 메서드 호출
		Animal ani2 = new Animal();
		ani2.name = "야옹이";
		ani2.age = 2;
		System.out.println("이름 : " + ani2.name);
		System.out.println("나이 : " + ani2.age);
		ani2.cry();
		
		
		System.out.println("---------------------------");
		
		// Person 클래스 인스턴스 생성
		Person p = new Person();
		// 이름 : 철수, 나이 : 20 로 초기화(배고픔(isHungry)은 초기화하지 않음)
		p.name = "철수"; 
		p.age = 20;
		System.out.println("이름 : " + p.name);
		System.out.println("나이 : " + p.age);
		// => 인스턴스 변수는 별도로 초기화하지 않으면 기본값으로 자동으로 초기화 됨
		System.out.println("배고픔 : " + p.isHungry); // 기본값 false 출력됨
		
		// Person 인스턴스의 work() 메서드 호출
		p.work();
		System.out.println("배고픔 : " + p.isHungry);
		
		// Person 인스턴스의 eat() 메서드 호출
		p.eat();
		System.out.println("배고픔 : " + p.isHungry);
		
		System.out.println("----------------");
		
		// 또 다른 Person 인스턴스 생성(p2)
		Person p2 = new Person();
		p2.name = "영희";
		p2.age = 30;
		
		System.out.println("이름 : " + p2.name);
		System.out.println("나이 : " + p2.age);
		System.out.println("배고픔 : " + p2.isHungry);
		
	}

}

// Person 클래스
// 멤버변수 : 이름(name, 문자열), 나이(age, 정수형), 배고픔상태(isHungry, boolean형)
// 메서드
// 1) work() : 파라미터 없음, 리턴값 없음. "일한다" 출력 후 isHungry 변수값을 true 로 변경
// 2) eat() : 파라미터 없음, 리턴값 없음. "밥 먹는다" 출력 후 isHungry 변수값을 false 로 변경
class Person {
	// 클래스 내에서 선언하는 멤버변수(인스턴스변수)들은 클래스 내의 대부분의 위치에서 접근 가능
	String name; // 만약 초기화하지 않으면 null 이 기본값
	int age; // 0 기본값
	boolean isHungry; // false 기본값
	
	public void work() {
		System.out.println("일한다!");
		isHungry = true; // 메서드 내에서 멤버변수 접근 시 변수명만으로 바로 접근 가능
	}
	
	public void eat() {
		System.out.println("밥 먹는다!");
		isHungry = false;
	}
	
}


// -----------------------------------------------

// Animal 클래스 정의
// => class 클래스명 {}
class Animal {
	// 멤버변수 이름(name, 문자열), 나이(age, 정수) 선언
	String name;
	int age;
	
	// 메서드 정의
	// "동물 울음 소리!" 문자열을 출력하는 cry() 메서드 정의
	// => 파라미터 없음, 리턴값 없음
	// public 리턴타입 메서드명([파라미터...]) {}
	public void cry() {
		System.out.println("동물 울음 소리!");
	}
	
}

















