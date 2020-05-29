
public class Ex3 {
	public static void main(String[] args) {
		/*
		 * 생성자 오버로딩 
		 * - 클래스 내에서 생성자 여러개를 정의하는 것 (=> 파라미터를 달리함)
		 * - 일반 메서드 오버로딩과 동일
		 * - 생성자 내에서 다른 생성자를 이름으로 호출 할 수 없다
		 */
		
		
		// 인스턴스 생성 시 Mydate() 생성자 호출
		MyDate d1 = new MyDate();
		//System.out.println(d1.year + "/" + d1.month + "/" + d1.day);
		// 인스턴스 d1 내의 printDate() 메서드 호출
		// d1.printfDate();
		System.out.println("------------------------------------");

		// 인스턴스 생성 시 Mydate2() 생성자 호출
		MyDate d2 = new MyDate(2020);
		//System.out.println(d2.year + "/" + d2.month + "/" + d2.day);
		//d2.printfDate();
		System.out.println("------------------------------------");
		
		// 인스턴스 생성 시 MyDate(int year, int month) 생성자 호출
		MyDate d3 = new MyDate(2010, 5);
		//System.out.println(d3.year + "/" + d3.month + "/" + d3.day);
		//d3.printfDate();
		System.out.println("------------------------------------");

		// 인스턴스 생성 시 MyDate(int year, int month, int day) 생성자 호출
		MyDate d4 = new MyDate(1999, 9, 8);
		//System.out.println(d4.year + "/" + d4.month + "/" + d4.day);
		//d4.printfDate();
	}
}


// 날짜를 관리하는 MyDate 클래스
class MyDate{
	// 연도(year), 월(month), 일(day) - 정수형 변수로 선언
	
	int year;
	int month;
	int day;
	
	// MyDate() 생성자 오버로딩
	// 1. 파라미터가 없는 생성자(기본 생성자) MyDate() 정의
	public MyDate(){
		System.out.println("MyDate() 생성자 호출됨!");
		// 1900년 1월 1일로 초기화
		
		year = 1900;
		month = 1;
		day = 1;
		
		 printfDate();
		 
		 
		 // 생성자 내에서 메서드 호출과 동일하게 다른 생성자를 호출 할 수 없다!
		 
		
	}
	
	// 2. 파라미터 1개(연도)를 전달받아 초기화하는 생성자 MyDate(int) 정의 = 오버로딩
	// => 연도(newYear)를 전달받아 멤버변수 year 을 초기화하고, 나머지는 1월 1일로 초기화함
	
	public MyDate(int newYear) {
		year = newYear; // 전달받은 연도를 사용하여 초기화
		month = 1;
		day = 1;
		
		printfDate();
	}
	
	// 3. 파라미터 1개(연도)를 전달받아 초기화하는 생성자 MyDate(int) 정의 = 오버로딩
	// => 연도(newYear), 월(newMonth)를  전달받아 멤버변수를 초기화하고, 나머지는 1월 1일로 초기화함	
	public MyDate(int newYear, int newMonth) {
		year = newYear; 
		month = newMonth;
		day = 1;
		
		printfDate();
	}
	
	// 4. 파라미터 1개(연도)를 전달받아 초기화하는 생성자 MyDate(int) 정의 = 오버로딩
	// => 연도(newYear), 월(newMonth)를  전달받아 멤버변수를 초기화하고, 나머지는 1월 1일로 초기화함	
	// public MyDate(int newYear, int newMonth, int newDay) {
	//	year = newYear; 
	//	month = newMonth;
	//	day = newDay;
		
	//	printfDate();
	// }
	
	// 생성자 자동 생성 단축키 : Alt + Shift + S - > O
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	
	
	// 일반메서드 printfDate() 정의
	// => 파라미터 : 없음, 리턴값 없음 
	// => "연도/월/일" 형태로 날짜출력
	
	public void printfDate(){
		System.out.println(year + "/" + month + "/" + day);
		
		// 메서드 내에서도 생성자 호출 불가능
		// MyDate(1999.1.1)
	}


	
	
}