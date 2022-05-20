package j06_repetition;

public class While01 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		 
		while(i < 100) {//조건식 참 일때, 반복 참이 아닌 순간 반복을 끝낸다.
			
			result = result + i;
			i++; //조건 변화 수식
		}
			
		System.out.println(result);
			
//			i = i + 1;  // 0 = 0 + 1 => 1
//					    // 1 = 1 + 1 => 2
//						// ...
//			
//			i += 1; //1뿐만 아니라 2,3 증가 가능
//			i++;	//1씩 증가
//			++i;	//1씩 증가
			
			
		
	}

}
