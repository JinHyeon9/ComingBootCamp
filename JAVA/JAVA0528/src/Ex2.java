
public class Ex2 {
	/*
	 * 생성자 this()
	 * - 생성자 내에서 오버로딩 된 다른 생성자를 호출
	 *   => 생성자 오버로딩 시 중복 코드를 제거하기 위해 사용
	 *   - 생성자 이름 대신 this를 사용하여 생성자 호출 형태를 갖추고 필요한 파라미터를 전달하면 됨
	 * - 주의! 생성자 this()는 생성자 내에서 첫번째로 실행되어야 하며 단 한번만 사용가능
	 */
	
	public static void main(String[] args) {
		MyDate d= new MyDate();
		d.printDate();
		MyDate c=new MyDate(1999);
		c.printDate();
		MyDate f=new MyDate(1999,9);
		f.printDate();
		MyDate r=new MyDate(1999,9,8);
		r.printDate();
	}
}




class MyDate {
	int year;
	int month;
	int day;
	
	
	public MyDate() {
		// 인스턴스 변수를 초기화하는 코드가 중복됨
//		this.year = 1900;
//		this.month = 1;
//		this.day = 1;
		
		// 파라미터 3개를 전달받는 생성자를 호출하여 대신 초기화하면 코드 중복 제거가 가능하다
		// MyDate(int, int, int) 생성자를 호출하여 초기화할 값을 전달 후 대신 초기화 수행
//		MyDate(1900, 1, 1); // 오류 발생! 생성자를 생성자명으로 직접 호출이 불가능!
		
		// 생성자 this 를 사용하여 파라미터 3개짜리 생성자를 호출할 수 있다!
		this(1900, 1, 1);
		
		System.out.println("MyDate() 생성자 호출됨!");
	
		
//		this(1900, 1, 1); // 오류 발생! 생성자 this() 는 생성자 내에서 첫번째로 실행되어야 한다!
	}
	
	public MyDate(int year) {
		this(year, 1, 1);
		System.out.println("MyDate(int) 생성자 호출 됨!");
		// this.year = year;
		// this.month = 1;
		// this.day = 1;
	}
	
	public MyDate(int year, int month) {
		this(year, month, 1);
		System.out.println("MyDate(int int) 생성자 호출 됨!");
		
		// this.year = year;
		// this.month = month;
		// this.day = 1;
	}
	
	public MyDate(int year, int month, int day) {
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public void printDate() {
		System.out.println(year + "/" + month + "/" + day);
	}
}
