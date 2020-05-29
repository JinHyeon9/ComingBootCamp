
public class Test {
public static void main(String[] args) {
	/*
	 * String 타입 배열 생성 및 다음 문자열로 초기화
	 * "홍길동" "이순신" "강감찬" "김태희" "전지현"
	 */
	
	String[] names = {"홍길동", "이순신", "강감찬", "김태희", "전지현"};
	
	// 기본 for문
	for (int i = 0; i<names.length; i++) {
		System.out.println(names[i]);
	}
	
	System.out.println("---------------------------------");

	// 향상된 for문
	
	for (String num : names) {
		System.out.println(num);
	}
	
	System.out.println("---------------------------------");

}
}
