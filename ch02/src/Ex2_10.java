import java.util.Scanner;    // Scanner를 사용하기 위해 추가

class Ex2_10 { 
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		// 1. 
		String input = scanner.nextLine(); // 입력받은 값을 문자열에 저장
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		// 2.

		//int num1 = scanner.nextInt();
		System.out.println("입력내용 : "+input);
		System.out.printf("num=%d%n", num);
//		System.out.printf("num=%d%n", num1);
		System.out.println("하하");
	} 
}