import java.util.Scanner;

class Ex4_6 {
	public static void main(String[] args) { 
		System.out.print("현재 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();  // 화면을 통해 입력받은 숫자를 month에 저장

//		switch(month) {
//			case 3: case 4: case 5: {
//				System.out.println("봄");
//				break;
//			}
//			case 6: case 7: case 8: {
//				System.out.println("여름");
//				break;
//			}
//			case 9: case 10: case 11: {
//				System.out.println("가을");
//				break;
//			}
//			default: 
//				case 12: case 1: case 2: {
//					System.out.println("겨울");
//				}
//		}
//	
		
		
		switch(month) {
			case 3: 
			case 4: 
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6: case 7: case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			default: // 브레이크문은 없지만, 더이상 실행할 문장이 없으므로 switch문을 빠져 나간다.
	//		case 12:	case 1: case 2:
				System.out.println("현재의 계절은 겨울입니다.");
		}
		
	} // main의 끝
}