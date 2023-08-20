import java.util.Scanner;

public class ScannerEx2 {

// 문장?일때 스캐너 => String으로 받아서 숫자로 캐스팅 할 수도 있음
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("아무 숫자나 입력하세요>");
		
		String result = scanner.nextLine();
		int result2 = Integer.parseInt(result);
		System.out.println(result2);
		
		
	}

}