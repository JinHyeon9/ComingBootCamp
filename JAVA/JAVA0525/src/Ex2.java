
public class Ex2 {

	public static void main(String[] args) {
		WalkTestBad wtb = new WalkTestBad();
		wtb.walk();
		wtb.walk(999);
		wtb.walk(50, "inch");
		
		System.out.println("==============");
		
		WalkTestGood wtg = new WalkTestGood();
		wtg.walk();
		wtg.walk(800);
		wtg.walk(50, "inch");
	}

}

class WalkTestBad {
	// 각각 다른 파라미터를 전달받아 이동하는 walk() 메서드 오버로딩
	// => 파라미터에 따라 작업이 달라질 수 있으나 이동하는 출력문(기능)은 동일함
	//    동일한 출력문 수행 작업이 중복되므로 비효율적인(중복되는) 코드가 사용됨
	public void walk() {
//		System.out.println("100cm 이동");
		
		int distance = 100;
		System.out.println(distance + "cm 이동");
	}
	
	// 메서드 오버로딩
	public void walk(int distance) {
		System.out.println(distance + "cm 이동");
	}
	
	// 메서드 오버로딩
	public void walk(int distance, String unit) {
		switch(unit) { // unit 문자열 판별하여 단위에 따른 계산 수행
			case "cm" : 
				break; // switch 문을 빠져나감
			case "inch" : 
				distance *= 2.54; // inch -> cm 로 환산
				break;
			default :
				System.out.println("잘못된 단위!");
				distance = 0;
		}
		
		System.out.println(distance + "cm 이동");
	}
	
}


// 코드(메서드) 재사용을 통해 중복 코드를 제거할 수 있다!
class WalkTestGood {
	public void walk() {
		int distance = 100;
//		System.out.println(distance + "cm 이동");
		// 오버로딩 된 다른 메서드를 호출하여 필요한 데이터를 전달하면 중복 작업을 대신 처리
		walk(distance, "cm"); // walk(int, String) 메서드를 호출하여 거리, 단위 전달
	}
	
	public void walk(int distance) {
//		System.out.println(distance + "cm 이동");
		walk(distance, "cm"); // walk(int, String) 메서드를 호출하여 거리, 단위 전달
	}
	
	// 외부로부터 데이터를 전달받거나, 다른 메서드로부터 데이터를 전달받아
	// 공통적인 작업들을 하나의 메서드 내에서만 처리하므로 코드의 중복을 제거할 수 있다!
	public void walk(int distance, String unit) {
		switch(unit) { // unit 문자열 판별하여 단위에 따른 계산 수행
			case "cm" : 
				break; // switch 문을 빠져나감
			case "inch" : 
				distance *= 2.54; // inch -> cm 로 환산
				break;
			default :
				System.out.println("잘못된 단위!");
				distance = 0;
		}
		
		System.out.println(distance + "cm 이동");
	}
	
}















