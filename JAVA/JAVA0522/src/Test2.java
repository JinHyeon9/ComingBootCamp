
public class Test2 {

	public static void main(String[] args) {
		// Car 클래스 인스턴스 생성 후 다음과 같이 멤버변수 초기화하여 출력
		// 차종 : SONATA
		// 차량번호 : 12가1234
		// 최대속력 : 240 km/h
		// 현재속력 : 0 km/h
		Car car = new Car();
		car.carName = "SONATA";
		car.carNumber = "12가1234";
		car.maxSpeed = 240;
//		car.speed = 0; // 기본값이 0 이므로 생략 가능
		
//		System.out.println("차종 : " + car.carName);
//		System.out.println("차량번호 : " + car.carNumber);
//		System.out.println("최대속력 : " + car.maxSpeed + " km/h");
//		System.out.println("현재속력 : " + car.speed + " km/h");
		
		// 차량 정보를 출력하는 carInfo() 메서드 호출하여 차종, 번호, 속력 정보 출력
		car.carInfo();
		
		// 차량 속력 증가를 위해 speedUp() 메서드를 호출하여 증가시킬 속력값 전달
		car.speedUp(50); // 현재속력 0 + 증가속력 50 = 50 km/h 출력
		System.out.println("--------------");
		car.speedUp(250); // 현재속력 50 + 증가속력 250 = 최대속력 도달했으므로 240 km/h 출력
		System.out.println("--------------");
		car.speedUp(100); // 최대속력 도달했으므로 240 km/h 출력
		System.out.println("--------------");
		
		
		// 차량 속력 감소를 위해 speedDown() 메서드를 호출하여 감소시킬 속력값 전달
		car.speedDown(100);
		car.speedDown(300);
		car.speedDown(50);
	}

}

/*
 * 자동차(Car) 클래스 정의
 * 
 * 멤버변수
 *   - 차종명(carName, 문자열)
 *   - 차량번호(carNumber, 문자열)
 *   - 최대속력(maxSpeed, 정수)
 *   - 현재속력(speed, 정수)
 *   
 * 메서드
 *   - carInfo() 메서드 정의 : 파라미터 없음, 리턴값 없음
 *     => 차종, 차량번호, 최대속력, 현재속력을 출력
 *   
 *   - speedUp() 메서드 정의 : 파라미터 있음(속력값 value 전달), 리턴값 없음
 *     => 전달받은 속력값(value)을 현재속력(speed)에 누적하고, "현재 속력 : XXX km/h" 출력
 *     => 단, 증가한 현재속력(speed)이 최대속력(maxSpeed)보다 클 경우
 *        "최대 속력 도달!" 출력 후 현재속력(speed)을 최대속력(maxSpeed)으로 변경
 *   
 *   - speedDown() 메서드 정의 : 파라미터 있음(속력값 value 전달), 리턴값 없음
 *     => 전달받은 속력값(value)을 현재속력(speed)에서 차감하고, "현재 속력 : XXX km/h" 출력
 *     => 단, 감소한 현재속력(speed)이 0보다 작거나 같을 경우
 *        "차량 정지!" 출력 후 현재속력(speed)을 0으로 변경
 */
class Car {
	String carName;
	String carNumber;
	int maxSpeed;
	int speed;
	
	// 차종, 차량번호, 최대속력, 현재속력을 출력하는 메서드 carInfo() 정의
	public void carInfo() {
		System.out.println("차종 : " + carName);
		System.out.println("차량번호 : " + carNumber);
		System.out.println("최대속력 : " + maxSpeed + " km/h");
		System.out.println("현재속력 : " + speed + " km/h");
	}
	
	// 속력증가 메서드 speedUp() 정의
	public void speedUp(int value) {
		speed += value; // 현재속력에 전달받은 속력 누적
		
		// 현재속력 > 최대속력 일 경우 현재속력을 최대속력으로 고정
		if(speed > maxSpeed) {
			System.out.println("최대속력 도달!");
			speed = maxSpeed;
		}
		
		System.out.println("현재속력 : " + speed + " km/h");
	}
	
	// 속력감소 메서드 speedDown() 정의
	public void speedDown(int value) {
		speed -= value; // 현재속력에서 전달받은 속력 차감
		System.out.println("현재속력 : " + speed + " km/h");
			
			// 현재 속력 <= 0 일 경우 현재 속력을 0으로 고정
			if(speed<=0) {
				System.out.println("차량 정지!");
				speed = 0;
			}
			System.out.println("현재속력 : " + speed + " km/h");

	}
	
}





























