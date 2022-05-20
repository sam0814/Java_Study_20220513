package j05_condition;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 29;
		char c = 'c';
		String str = "송새미2";
		
		 switch(num / 10) { //case에서 찾고자 하는 값을 소괄호 안에 입력
		 	case 1 :
		 		System.out.println("case 1");
		 		break; //실행을 끝내고 싶을때
		 	case 2 :
		 		System.out.println("case 2");
		 		break;
		 	case 3 :
		 		System.out.println("case 3");
		 		break;
		 	default : 
		 		System.out.println("찾을 수 없음");
		 }
		 
		 switch(c) {
			 case 'a' :
				 System.out.println("case a");
				 break;
			 case 'b' :
				 System.out.println("case b");
				 break;
			 case 'c' :
				 System.out.println("case c");
				 break;
			 default : 
			 		System.out.println("찾을 수 없음");
		}
		 
		 switch(str) {
			 case "송새미" :
				 System.out.println("case 송새미");
				 break;
			 case "송새미2" :
				 System.out.println("case 송새미2");
				 break;
			 case "송새미3" :
				 System.out.println("case 송새미3");
				break;
			 default : 
			 		System.out.println("찾을 수 없음");
			 }
	}

}
