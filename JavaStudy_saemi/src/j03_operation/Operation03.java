package j03_operation;

public class Operation03 {

	public static void main(String[] args) {
		/*
		 * year = 1999
		 * 
		 * result = False
		 * 
		 * 년도가 4의 배수이면 true 아니면 false
		 * 
		 * 윤년이면 true 아니면 false
		 * 4의 배수 이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
		 * 
		 */
		
		int year = 2000;
		boolean result = year % 4 == 0 && year % 100 != 0 || year % 400 == 0; // year을 4로 나눴을때 나머지가 0이 되면 4의 배수이기 때문에 true이다.
		
		System.out.println("result: " + result); //1999 % 4 == 0 이 아니기 때문에 출력 값은 false
	}

}
