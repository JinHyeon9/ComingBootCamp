
public class test2_0508 {
	public static void main(String[] args) {
		
		// 1. 삼항 연산자를 사용하여 양수 or 음수 판별
		//	   => 정수 num이 양수(0 이상)이면 "num = 양수" 출력, 아니면 "num=음수" 출력
		int num = 10;
		System.out.println(num>=0? num + "양수" : num + "음수");
		System.out.println("---------------------------");
		
		// 2. 홀수 or 짝수 판별
		// => 정수 num 을 2로 나눈 나머지가 1이면 "num=홀수" 아니면 "num=짝수" 출력
		System.out.println(num%2==1? "num  = 홀수" : "num = 짝수");
		System.out.println("---------------------------");
		
		// 3. 20대 판별
		int age = 20;
		boolean result = (age>=20 && age<30);
		System.out.println(age + "은(는)은 20대입니까?" + result);
		System.out.println(age>=20 && age<30? "20대입니다" : "20대가 아닙니다");
		System.out.println("---------------------------");
		
		// 4. 삼항연산자를 이용하여 "양수", "음수", "0" 판별
		num = 2;
		System.out.println(num==0 ? "0" : num>0 ? num +" = 양수" : num +  "= 음수");
		
	}
}
