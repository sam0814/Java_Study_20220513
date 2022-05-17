package j04_Input;

import java.util.Scanner; //Scanner import

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //ctrl + shift + O 눌러서 import 해주기
//		//참조자료형
//		System.out.print("값 입력: "); //10을 입력
//		int num = scanner.nextInt(); //10이라는 입력을 받아서 sysout 출력문으로 값을 보냄
//		
//		System.out.println("입력한 값: " + num);
		
		System.out.print("년도를 입력하세요: ");
		
		int year = scanner.nextInt(); //입력 한 값을 변수 year에 담음
		
		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.";
		// 변수 year 안에 담긴 값이 4의 배수이면서 100의 배수가 아니거나 400의 배수 일때 윤년이라는 값 출력
		//아니면 윤년이 아닙니다 라는 값 출력
		
		System.out.println(year + "년은 " + result);
		

	}

}
