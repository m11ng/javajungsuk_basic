import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class Ex2_10 { 
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���.>");
		// 1. 
		String input = scanner.nextLine(); // �Է¹��� ���� ���ڿ��� ����
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		
		// 2.

		//int num1 = scanner.nextInt();
		System.out.println("�Է³��� : "+input);
		System.out.printf("num=%d%n", num);
//		System.out.printf("num=%d%n", num1);
		System.out.println("����");
	} 
}