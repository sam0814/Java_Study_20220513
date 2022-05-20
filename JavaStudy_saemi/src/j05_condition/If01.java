package j05_condition;

public class If01 {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("프로그램 시작");
		
		//if문
		if(num > 5) { //만약에 num 이 5보다 크면
			System.out.println("5보다 큽니다."); //sysout 출력
		}else if(num < 5){ //if문이 참이 아닐때 else(~아니면) if(만약에 ~라면)
			System.out.println("5보다 작습니다.");
		}else {
			System.out.println("5랑 같습니다.");
		}
		
		System.out.println("프로그램 종료");
	}

}
