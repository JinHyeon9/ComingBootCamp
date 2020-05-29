
public class test0508 {
	public static void main(String[] args) {
		// 논리연산자의 활용
		// 1. 나이(age)를 입력받아 20대를 판별
		// => 20대란? 나이(age)가 20살 이상이고, 29살 이하
		//				     나이가 19살 초과이고 30살 미만
		
		int age = 30;
		boolean result = (age>=20 && age<30);
		System.out.println(age + "은(는)은 20대입니까?" + result);

		
		System.out.println("---------------------------");
		
		//2. 나이(age)를 입력받아 놀이동산 무료입장 여부 판별
		//=> 무료입장 대상 : 나이(age)가 5세 미만이거나 65세 이상
		age = 70;
		result = (age<=5 || age>=65);
		System.out.println(age + "은(는)은 무료입장 대상입니까?" + result);
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
	}
}
