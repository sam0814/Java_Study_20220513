package j03_operation;

public class Operation05 {

	public static void main(String[] args) {
		int num = 10;
		num = num + 2;
		
		num += 2; //복합 대입연산자 num = num + 2; 출력 값은 14
		
		num %= 3; //14 % 3 =2
		
		System.out.println(num);
	}

}
