package j03_operation;

public class Operation01 {

	public static void main(String[] args) {
		int num = 10;
		
		num = num + 1;
		//num++; //후 증가 => 증감 연산식 ++/--을 변수 뒤에 붙여주면 다음에 출력시 증(가)감(소)가 된 값으로 출력 된다.
		
		
		System.out.println(++num);  //선 증가 => 증감 연산식 ++/-- 을 변수 앞에 붙여주면 증(가)감(소)가 먼저 일어난 후 출력 된다.
		System.out.println(num);
		
		System.out.println(--num); //선 증가
		System.out.println(num--); //후 증가
		System.out.println(num);
	}

}
