package j01_firstLesson;

//클래스 생성시 단어의 첫 글자는 무조건 대문자
public class HelloJava { 

	//여기서 System.out.print 하면 오류
					   //main은 함수
					   //프로그램은 main에서부터 순서대로 실행
	public static void main(String[] args) {
		//sysout 같은 명령문은 main안에 기입해야 실행 된다
		System.out.print("Hello, Java"); //출력
		System.out.println("Hello, Java"); //ln은 line을 의미 System.out.println 하면 바꿈을 해준다.
		System.out.print(10 + 5);
		System.out.println();
		//System.out.print에서 ln을 붙여주지 않으면 바로 옆에 붙어서 출력 된다(줄바꿈 X)
		
		int age = 29; //int 자료형 변수명 age 공간 안에 29 숫자를 넣음
		
		
		//double age = 10.4 => 위에서 한번 선언한 변수명 다시 재선언 할 수 없음
		
		
		System.out.print("이름: ");   // 줄바꿈이 없는 상태
		System.out.println("송새미"); // 송새미 다음에 줄바꿈을 해줌
		System.out.print("직업: "); 
		System.out.println("수강생");
		System.out.print("나이: ");
		System.out.println(age); //숫자는 ""안에 적지 않는다. //변수명 age를 대입
		
		age= 30; //age 변수 안에 값 재 선언
		
		System.out.print("이름: "); 
		System.out.println("송새미");
		System.out.print("직업: "); 
		System.out.println("수강생");
		System.out.print("나이: ");
		System.out.println(age); // 위에 재 선언 해줬기 때문에 29가 아닌 30이 출력
		
		age = age + 1; // = 뒤에 부터 age와 1을 더한 값을 = 앞에 있는 age 값에 넣어줌
					   // =은 같다는 뜻이 아니라 대입 연산자를 뜻함 => 같다는 표현은 == 두개를 써준다.
		

		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
		System.out.println(age);
	}

}
