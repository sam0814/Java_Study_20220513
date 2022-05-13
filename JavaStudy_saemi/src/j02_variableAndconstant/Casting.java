package j02_variableAndconstant;
/*
 * 형 변환 => 자료형을 변환
 * 업캐스팅 : 문자 < 정수 < 실수 
 * 			  값이 작은 범위에서 큰 범위로의 형 변환
 * 			  묵시적 형 변환(형 변환 타입 생략 가능)
 * 다운캐스팅: 실수 < 정수 < 문자
 * 			   값이 큰 범위에서 작은 범위로의 형 변환
 * 			   명시적 형 변환(형 변환 타입 생략 불가능
 */
public class Casting {

	public static void main(String[] args) {
		// 업캐스팅 : 문자 < 정수 < 실수
		char a = 'A';
		int b = a; //문자 A는 정수 자료형이 아니지만 정수가 문자보다 크기 때문에 문제 없이 출력 가능
		System.out.println(b); //아스키코드 값 65가 출력
		double c = b; //실수 자료형 65.0 출력
		System.out.println(c);
		int d = (int)c;	 // (int)를 사용해 정수 자료형을 형 변환 대신 소수점 단위는 출력 되지 않는다.
		System.out.println(d);
		char e = (char) d;
		System.out.println(e);
		
		//다운캐스팅: 실수 < 정수 < 문자

	}

}
