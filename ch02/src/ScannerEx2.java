import java.util.Scanner;

public class ScannerEx2 {

// ����?�϶� ��ĳ�� => String���� �޾Ƽ� ���ڷ� ĳ���� �� ���� ����
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ƹ� ���ڳ� �Է��ϼ���>");
		
		String result = scanner.nextLine();
		int result2 = Integer.parseInt(result);
		System.out.println(result2);
		
		
	}

}