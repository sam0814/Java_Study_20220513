package j06_repetition;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		/*
		 * 반복 할 횟수를 입력하세요:5
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		
		System.out.print("반복 할 횟수를 입력하세요: ");
		num = scanner.nextInt();
		
		while(i < num) {
			System.out.println(i + 1);
			i++;
		}
		
		i = 0;
		
		while(i < num) {
			System.out.println(num - i);
			 i++;
		}
		
	}

}