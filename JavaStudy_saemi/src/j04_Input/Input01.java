package j04_Input;

import java.util.Scanner; //Scanner import

public class Input01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //입력을 받기 위해 Scanner 라는 객체 생성, ctrl + shift + O 눌러서 import 해주기

		//참조자료형
		System.out.print("첫번째 값 입력: "); //println을 쓰게되면 밑줄에 입력을 받기 때문에 ln을 붙이지 않음
		int num1 = scanner.nextInt(); //입력한 값이 변수 num1에 들어가게 된다. 값을 입력 받는 역할 
									
		
		System.out.print("두번째 값 입력: "); //입력 받은 값을 sysout 출력문으로 값을 보냄
		int num2 = scanner.nextInt();
		
		System.out.println("두 수를 더한 값: " + (num1 + num2));
		
		scanner.next();					//문자열(String)
		scanner.nextLine();				//문자열(String)
		scanner.next().charAt(0);		//문자(char)
		scanner.nextInt();				//정수(int)
		scanner.nextDouble();			//실수(double)
		
		/*
		 * 문제
		 * 년도를 입력 받아 윤년인지 아닌지 값 출력
		 */
		
//		System.out.print("년도를 입력하세요: ");
//		
//		int year = scanner.nextInt(); //입력 한 값을 변수 year에 담음
//		
//		String result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.";
//		// 변수 year 안에 담긴 값이 4의 배수이면서 100의 배수가 아니거나 400의 배수 일때 윤년이라는 값 출력
//		//아니면 윤년이 아닙니다 라는 값 출력
//		
//		System.out.println(year + "년은 " + result);
		

	}

}
