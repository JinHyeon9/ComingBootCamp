
public class Exam3_1 {

    public static void main(String[] args) {
        // [3-1] 다음 연산의 결과를 적으시오.
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        
        System.out.println(1 + x << 33);
        // 1 + x = 3 이므로 3 << 33 이 된다.
        // 이 때, 좌측 33 쉬프트는 33 - 32 = 1 쉬프트와 동일하므로
        // 3 << 1 = 6
        
        System.out.println(y >= 5 || x < 0 && x > 2);
        // x < 0 && x > 2 의 결과 false
        // y >= 5 결과 true
        // y >= 5 || x < 0 && x > 2 일 때 y >= 5 결과가 true 이므로 바로 true
        
        System.out.println(y += 10 - x++);
        // 1. 10 - x 를 수행하므로 x가 2이므로 10 - 2 = 8 이 됨(x++ 후행연산자이기 때문에)
        // 2. x++ 수행하여 x 가 2 -> 3 으로 증가
        // 3. y += 10 - x++ 수행하므로 y += 8 의 결과값이 5 += 8 => 13이 됨
        
        System.out.println(x += 2); 
        // 이전 연산에서 x++ 연산에 의해 x 값이 2 -> 3 으로 변경됐으므로 3 + 2 = 5
        
        System.out.println(!('A' <= c && c <='Z'));
        // 'A' <= c && c <='Z' 연산 결과가 true 이므로 !('A' <= c && c <='Z') = !true 와 같다. 
        // 즉 false 가 됨
        
        System.out.println('C' - c); // char - char = int 이므로 67 - 65 = 2 가 출력됨
        
        System.out.println('5' - '0'); // char - char = int 이므로 53 - 48 = 5 가 출력됨(5 - 0 = 5)
        
        System.out.println(c + 1); // char + int = int 이므로 65 + 1 = 66
        
        System.out.println(++c); // c 가 'A'(65) 이며, 증감연산자에 의해 1 증가됨. 
        // 단, 증감연산자 사용 시 자동형변환 일어나지 않으므로 문자 'B' 그대로 출력됨
        
        System.out.println(c++); // c 를 출력한 후 1 증가시키므로 현재 값인 'B' 출력됨 => 이후 1 증가시킴
        
        System.out.println(c); // 1 증가된 값 'C' 출력됨
    }

}









