class Ex3_11 {
	public static void main(String args[]) { 
		
		double pi = 3.141592; 
		
		// �Ҽ��� 4��° �ڸ����� �ݿø��Ͽ�, 3.142�� ����� ����.
		
		System.out.println(pi); // 3.141592
		System.out.println(pi * 1000); // 3141.592
		System.out.println(Math.round(pi)); // 3
		System.out.println(Math.round(pi*1000)); // 3142
		System.out.println(Math.round(pi*1000)/1000); // 3
		System.out.println(Math.round(pi*1000)/1000.0); // 3.142
		System.out.println((double)Math.round(pi*1000)/1000); // 3.142
		
		
		// 3.141�� ����� ����.
		System.out.println(pi * 1000); // 3141.592
		System.out.println((int)pi * 1000); // 3000 =>pi�� ���� ��ȯ �� ���Ǳ� ������ 
		System.out.println((int)(pi * 1000)); // 3141 => int�ϱ� ������ ���ս�
		System.out.println((int)(pi * 1000)/1000.0); // 3141 => int�ϱ� ������ ���ս�
		
		

	}
}