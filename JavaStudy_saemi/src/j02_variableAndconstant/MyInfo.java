package j02_variableAndconstant;

public class MyInfo {

	public static void main(String[] args) {
		// 주석
		/*
		 * 메모, 필기
		 * 
		 * 1.문제
		 * name1, name2, name3
		 * age(나이)
		 * phone(연락처)
		 * address(주소)
		 * 
		 * 이름: 송새미
		 * 나이: 22
		 * 연락처: 010-0000-0000
		 * 주소: 부산시 북구
		 * 
		 */
		
		char name1 = '송'; //char 뒤에는 "" 아니고 '' / 문자가 하나만 올 수 있다.
		char name2 = '새';
		char name3 = '미';
		
		
		
		int age = 22; //정수 자료형 int
		
		String phone = "010-0000-1234"; //문자열 문자가 2개 이상 와야 할 땐 String을 써준다.
		String address = "부산시 북구";
		
		System.out.println("이름: " + name1 + name2 + name3); //변수명은 "" 안에 써주면 안된다.
		System.out.println("나이: " + age);
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		
		System.out.print("이름: ");
		System.out.println(name1 + name2 + name3);   //=>char의 기본형은 유니코드 그러므로 name 1, 2, 3 각각의 유니코드를 더해서 값을 출력해 버린다.
		System.out.println("" + name1 + name2 + name3);   //=> 유니코드가 아닌 변수를 출력 해주려면 앞에 ""을 붙여준다.
		
		
		System.out.println("세 수의 합: " + 10 + 20 + 30); // ""와 +가 만나면 문자열이 되버리기 때문에 출력값은 60이 아니라 102030이 출력된다.
		System.out.println("세 수의 합: " + (10 + 20 + 30)); // 60 값이 출력 되려면 우선 순위를 정해 줘야하기 때문에 소괄호를 써준다.

	}

}
