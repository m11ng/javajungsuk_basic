class Ex4_13_2 {
	public static void main(String[] args) {

		// ���Ѱ��� ���� �������
		int sum = 1;
		
		// ������ų ����
		int i = 1;
		
		while(sum <=100) { // sum�� 100���� �۰ų� ���������� true !
//			sum += ++i;
			System.out.println("i:" + i + ", sum:" + sum);
			++i; // 1
			sum = sum + i; // 1
//			i++;
		}
		

		
	} // main�� ��
}