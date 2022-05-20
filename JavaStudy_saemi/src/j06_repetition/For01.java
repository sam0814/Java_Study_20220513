package j06_repetition;

public class For01 {
	/*
	 * for 규칙적인 반복
	 * while 자유로운 반복
	 */

	public static void main(String[] args) {
		
			//선언(한번만 실행)	 //조건   //조건 변화 수식
		for(int i = 0;   		 i < 10;   i++) {
			System.out.println(i + 1);
		}
		
		for(int i = 0; i < 10; i++) { //10번 반복
			System.out.println(10 - i);
			
		}
	}

}
