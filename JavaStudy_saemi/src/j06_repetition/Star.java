package j06_repetition;

public class Star {

	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 
		 *     *
		 *    **
		 *   *** 
		 *  ****
		 * *****
		 * 
		 * 
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 *     
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 */
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//숙제부분
		//i는 행 반복 인덱스
		for(int i = 0; i < 5; i++) {
			//j는 열 반복 인덱스
			for(int j = 0; j < 5; j++) {
				//더 높은 행으로 갈수록 *이 하나씩 늘어나야 하고
				//빈칸은 하나씩 줄어들어야한다.
				if(j < 5 -(i + 1)) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
//				if(j > 3 - i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i > j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
//		i = 0, j = 0 -> space
//		i = 0, j = 1 -> space
//		i = 0, j = 2 -> space
//		i = 0, j = 3 -> space
//		i = 0, j = 4 -> star
		for(int i = 0; i < 5; i++) {
			int max =  (9 / 2)+ i + 1;
			for(int j = 0; j < max; j++) {
				if(j < (9 / 2) - i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
