package j04_Input;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int a = 0;
//		int b = 0;
//		
//		System.out.print("두 수를 입력하세요: ");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		
//		System.out.println("두 수의 합은: " + (a + b));
		
		int a = 0;
		int b = 0;
		
		System.out.print("두 수를 입력하세요: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a > b ? ">" : a < b ? "<" : "==" );
		
		
	}

}
