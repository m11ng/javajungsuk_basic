class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		// ���ڸ� ���ڷ� �ٲٱ�: -'0'
		System.out.println(str.charAt(0) - '0'); // ����3 // ���ڿ��� ���ڷ� �ٲٰ� �ٽ� ���ڷ� �ٲٴ� ��
		System.out.println('3' - '0' + 1); // ���� 4 
		System.out.println();
		
		// ���ڸ� ���ڷ� �ٲٱ� : +'0'
		System.out.println(3 + '0');   // ���� '3' => �ƽ�Ű�ڵ�� 51
		System.out.println();

		// ���� + ���ڴ� ���� �ٸ� �� => �ƽ�Ű �ڵ�.
		System.out.println('3' + 1);   // 51 + 1 = 52
		System.out.println();

		// ���ڸ� ���ڷ� �ٲٱ�
		System.out.println('3' - '0' + 1); // ���� 4
		System.out.println();
		
		// ���ڿ��� ���ڷ� �ٲٱ�
		System.out.println(Integer.parseInt("3") + 1); // ���ڿ��� ���ڷ� ĳ����
		System.out.println(Integer.parseInt(str) + 1); // ���ڿ��� ���ڷ� ĳ����
		System.out.println();
		
		// ��� ���ڿ�.
		System.out.println("3" + 1); // ���ڿ� 31
		
	}
}