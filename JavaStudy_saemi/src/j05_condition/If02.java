package j05_condition;

public class If02 {

	public static void main(String[] args) {
		int score = 85;
		
		if(score == 100) {
			System.out.println("만점 입니다.");
		}else if(score > 89) {
				System.out.println("90점 이상입니다.");
			}else if(score > 79) {
					System.out.println("80점 이상입니다.");
				}else {
					System.out.println("...");
				}
			
		
	}

}
