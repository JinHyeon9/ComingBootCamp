
public class test2 {
public static void main(String[] args) {
	
	
	boolean powerStatus = true;
	
	//전원이 켜져있을 때 : "전원이 켜져있습니다" 출력
	//전원이 꺼져있을 때 : "전원이 꺼져있습니다" 출력
	
	
	if(powerStatus) { //powerStatus == true와 동일
		System.out.println("전원이 켜져있습니다");
	} else {
		System.out.println("전원이 꺼져있습니다");
	}
	
	if(!powerStatus) { //powerStatus == false와 동일
		System.out.println("전원이 켜져있습니다");
	} else {
		System.out.println("전원이 꺼져있습니다");
	}
	
}
}
