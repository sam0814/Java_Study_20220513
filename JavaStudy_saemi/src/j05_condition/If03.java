package j05_condition;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		/*
		 * 0보다 작거나 100보다 크면 계산 할 수 없는 점수 입니다 출력.
		 */
		Scanner scanner  = new Scanner(System.in); //Scaner 객체 생성
		
		int score = 0;
		
		System.out.print("점수를 입력하세요: ");
		score = scanner.nextInt(); //입력 받은 값을 score 변수에 담음
		
		if(score < 0  || score > 100) { //점수가 0보다 작거나 100보다 큰지 먼저 체크
			System.out.println("계산 할 수 없는 점수 입니다."); //거짓 일 경우 출력
		}else if(score > 89) {
			System.out.println("A");
		}else if(score > 79) {
			System.out.println("B");
		}else if(score > 69) {
			System.out.println("C");
		}else if(score > 59) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
