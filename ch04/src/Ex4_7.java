class Ex4_7 {
	public static void main(String args[]) {
		// ����
		// -5~5 ������ ������ 20�� ����Ͻÿ�.
		
		// �������� �����Ѵ�.
		// -5 -4 -3 -2 -1 0 1 2 3 4 5 => 11��!!!!
		
		int num = 0;
		// ������ ���� ���� �ϳ��� �����.
		
		
		
		for(int i=1; i<=20; i++) {
			num = (int)(Math.random() * 11)+ (-5);
			System.out.println(num);
		}
		
		
		
	}

}