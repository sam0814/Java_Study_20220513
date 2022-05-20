package j04_Input;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		/*
		 * 				
		 * 문자열1 입력: nextLine()				안녕
		 * 문자열2 입력: next()					hi
		 * 문자 입력: next().charAt(0)			A
		 * 정수 입력: nextInt()					10
		 * 실수 입력: nextDouble()				3.14
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String a = null; //변수들은 맨 위에 한꺼번에 정리
		String b = null;
		char c = 0;
		int d = 0;
		double e = 0;
		
		System.out.print("문자열1 입력:");
		a = scanner.nextLine();
		System.out.print("문자열2 입력:");
		b = scanner.next();
		System.out.print("문자 입력:");
		c = scanner.next().charAt(0);
		System.out.print("정수 입력:");
		d = scanner.nextInt();
		System.out.print("실수 입력:");
		e = scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
