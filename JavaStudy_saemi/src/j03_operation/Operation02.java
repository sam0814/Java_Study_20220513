package j03_operation;

/*
 * 논리 연산자
 * 
 * AND => && - 곱 
 * => 모든 조건이 참 일때, True의 결과를 가짐.
 * => 하나라도 거짓이면, False의 결과를 가짐.
 * 
 * OR => || - 합
 * => 모든 조건이 거짓일 때 False의 결과를 가짐.
 * => 라나라도 참이면 True의 결과를 가짐.
 * 
 * NOT => ! - 부정
 * => !(t && t) => f(0)
 * => !(f || f) => t(1)
 * 
 * 0(false)
 * !0(true)
 * 
 * t(1) && t(1) => true
 * t(1) && f(0) => f(0)
 * 
 * t(1) || t(1) => t(1)
 * t(1) || f(0) => t(1)
 * f(0) || f(0) => f(0)
 * 
 * 
 */
public class Operation02 {

	public static void main(String[] args) {
		int num = 10;
		
		boolean result1 = num > 5; //관계 연산자 결과는 T || F
		boolean result2 = num == 10; //대입 연산자 num과 10이 같은가?
		
		System.out.println("result1: " + result1); //num > 5 => true
		System.out.println("result2: " + result2); // num == 10 => true
		
		System.out.println("result1 AND result2 : " + (result1 && result2)); // t && t
	}

}
