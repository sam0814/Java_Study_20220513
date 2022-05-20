package j05_condition;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int x = 0;
			int y = 0;
			
			System.out.print("X 좌표를 입력하세요: ");
			x = scanner.nextInt();
			System.out.print("Y 좌표를 입력하세요: ");
			y = scanner.nextInt();
			
			if((x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0 ) 
					&& (x != 0 || y != 0)) {
				System.out.println("계산 할 수 없는 좌표 입니다.");
			}else if(x > 0 && y > 0) {
					System.out.println("1사 분면 입니다.");
			}else if(x < 0 && y > 0) {
					System.out.println("2사 분면 입니다.");
			}else if(x < 0 && y < 0) {
					System.out.println("3사 분면 입니다.");
			}else if(x > 0 && y < 0){
					System.out.println("4사 분면 입니다.");
			}else {
					System.out.println("원점 입니다.");
				}
			
			String result = (x > 1000 || y > 1000 || x < -1000 || y < -1000 || x == 0 || y == 0 ) 
					&& (x != 0 || y != 0) ? "계산 불가"
							: x > 0 && y > 0 ? "1사 분면 입니다."
									:x < 0 && y > 0 ? "2사 분면 입니다."
											:x < 0 && y < 0 ? "3사 분면 입니다."
													: x > 0 && y < 0 ? "4사 분면 입니다." : "원점";
			System.out.println(result);
															
	}
}
