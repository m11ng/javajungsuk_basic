class Ex4_13 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		// 1�� �����ϴ� ���� ����� ���ؾ� 100 ����� ���ڸ� ���� �� ������ 
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
			++i;
			sum = sum + i;
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main�� ��
}