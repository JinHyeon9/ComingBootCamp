
public class Ex3 {
public static void main(String[] args) {
	/*
	 * 메서드 호출 시 값 전달 방식에 따른 차이
	 * 1. Pass by value (값에 의한 전달)
	 *	  - 메서드 호출 시 값(실제 데이터)을 복사해서 전달 = 기본형 전달
	 *	  - 호출된 메서드 내에서 전달받은 값을 변경하더라도 원래 데이터에는 영향이 없다
	 * 
	 * 
	 * 2. Pass by reference (참조에 의한 전달)
	 * 	  - 메서드 호출 시 참조값(주소)을 복사해서 전달 = 기본형 전달
	 * 	  - 호출된 메서드 내에서 전달받은 주소값에 접근하여 값을 변경하면
	 * 	  - 같은 주소를 참조하는 대상은 동일한 영향을 받음
	 */
	
	 PassByTest pbt = new PassByTest();
	 
	 System.out.println("원래 PassByTest 인스턴스의 원본 데이터 : "+ pbt.memberVar);
	 System.out.println("==========================================");
	 
	 // 1. 메서드 파라미터로 기본형 변수를 전달했을 경우
	 System.out.println("change1() 메서드 호출 전 memberVar : " + pbt.memberVar);
	 // PassByTest 인스턴스 멤버변수(기본형) 값을 change1 메서드에 전달 => 실제데이터 값 복사
	 pbt.change1(pbt.memberVar); // 기본형 변수값이므로 실제 데이터를 복사해서 전달
	 // 호출된 메서드 내에서 전달받은 데이터(복사한 실제 데이터)를 변경하더라도
	 // 원본데이터에는 아무런 영향이 없음
	 
	 System.out.println("change1() 메서드 호출 후 memberVar : " + pbt.memberVar);
	 System.out.println("==========================================");

	 // 2. 메세드 파라미터로 참조형 변수를 전달했을 경우
	 System.out.println("change2() 메서드 호출 전 memberVar : " + pbt.memberVar);
	 
	 // PassByTest 인스턴스 주소값(참조형)을 change2 메서드에 전달
	 pbt.change2(pbt);  // 참조형 변수값이므로 주소값을 복사해서 전달
	
	 // 호출된 메서드 내에서 전달받은 데이터(복사한 주소값)에 접근할 경우
	 // 원본 데이터와 동일한 주소값에 접근하므로
	 // 한쪽에서 데이터를 변경하게 되면 원본 데이터에 그대로 적용되어
	 // 동일한 주소값을 참조하는 다른 변수에도 영향이 있다.
	 
	 System.out.println("change2() 메서드 호출 후 memberVar : " + pbt.memberVar);
	 // => change2() 메서드에서 인스턴스의 memberVar 값을 20으로 변경하면
	 // 현재 위치에서 pbt의 memberVar 값도 변경되어 있음
	 //  => 변경된 곳의 인스턴스 변수를 공유하므로 동일하게 적용을 받음!
	 
	 
	}
}

class PassByTest {
	int memberVar = 20;
	
	// 값에 의한 전달
	public void change1(int var) { 
		var += 10;
		System.out.println("change1의 var : " + var);
	}
	
	// 참조에 의한 전달
	public void change2(PassByTest reference) {
		// PassByTest 타입 인스턴스의 주소값인 참조형 데이터를 전달받음
		reference.memberVar += 10; //전달받은 참조형 주소값에 접근하여 데이터를 변경
		System.out.println("change2의 memberVar : "+reference.memberVar);
		
	}
	

}
