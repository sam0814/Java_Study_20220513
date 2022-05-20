package j04_Input;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String summary = null;
		String director = null;
		String grade = null;
		String performance = null;
		String plot1 = "지금껏 본적 없는 마블의 극한 상상력!";
		String plot2 = "광기의 멀티버스가 깨어난다";
		
		System.out.print("개요: ");
		summary = scanner.next();
		scanner.nextLine();
		System.out.print("감독: ");
		director = scanner.nextLine();
		System.out.print("등급: ");
		grade = scanner.nextLine();
		System.out.print("흥행: ");
		performance = scanner.nextLine();
		
		System.out.println("개요: " + summary);
		System.out.println("감독: " + director);
		System.out.println("등급: " + grade);
		System.out.println("흥행: " + performance);
		System.out.println(plot1);
		System.out.println(plot2);
		
		

    }
}
