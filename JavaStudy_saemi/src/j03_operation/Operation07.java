package j03_operation;

public class Operation07 {

	public static void main(String[] args) {
		/*
		 * 4의 배수 && 이면서 100의 배수가 아니거나 || 400의 배수인것
		 * 참이면 윤년
		 * 거짓이면 윤년이 아님
		 */
		int year = 1999;
		
		String result = year % 4 == 0 
				&& year % 100 != 0 
				|| year % 400 == 0 ? "윤년" : "윤년이 아님"; //조건 연산자
		
		System.out.println("결과: " + result);
	}

}
