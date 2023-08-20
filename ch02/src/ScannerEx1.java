import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {

		System.out.print("정수를 입력하세요 =>");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력된 정수는 " + num + " 입니다");
	}

}
