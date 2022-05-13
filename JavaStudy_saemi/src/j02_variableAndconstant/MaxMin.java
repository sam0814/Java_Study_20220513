package j02_variableAndconstant;

public class MaxMin {

	public static void main(String[] args) {
		
		//상수: 항상 변하지 않는 값
		final int MAX_NUMBER; 	
		MAX_NUMBER = 100;				//마지막으로 들어간 값 상수를 뜻한다. 상수 라는 것을 표시하기 위해 단어 모두 대문자를 사용해 표기한다.
		final int MIN_NUMBER;			//상수 값은 두 단어를 언더바를 사용해서 표기한다.
		MIN_NUMBER = 0;					//변수명은 단어의 첫 시작은 무조건 소문자로 시작해야 한다
										//두 단어 이상 변수명으로 사용 할 땐 첫 단어의 첫번째 단어를 소문자를 쓰고 두번째 단어의 첫 시작은 대문자로 표기
		
		final String PATH = "C: \\junil\\saemi\\java_workspace"; //경로는 바뀌면 안되기 때문에 변하지 않는 값 상수를 사용
		
		final double PI = 3.14; // 원주율은 변하지 않는 값이기 때문에 상수를 사용
		
		System.out.println("최댓값: " + MAX_NUMBER);
		System.out.println("최소값: " + MIN_NUMBER);
		
		// 리터럴값: 입력해 주는 값 (이미 정해져 있는 값)
		
		
	}

}
