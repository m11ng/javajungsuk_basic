class Ex4_8 {
	public static void main(String args[]) {
		
		for(int i=1; i<=10; i++) { // i�� ���� 1�� �����Ѵ�. 1 2 3 4 ... 10
			System.out.print(i + " " );
		}
		System.out.println();
		
		for(int i=10; i>=1; i--) { // i�� ���� 1�� �����Ѵ�. 10 9 ..... 2 1
			// 		  10>=1
			System.out.print(i + " " );
		}
		System.out.println();

		for(int i=1; i<=10; i=i+2) { // i�� ���� 2�� �����Ѵ�. 1 3 5 7 9
			System.out.print(i + " " );
		}
		System.out.println();
		
		for(int i=1; i<=10; i=i*2) { // i�� ���� 2�辿 �����Ѵ�. 1 2 4 8 16
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i=1, j=10; i<=5; i++) {
			 System.out.printf("%d \t %d", i, 11-i);
		}
		System.out.println();
		// i�� j�� ���� Ÿ���̿��� �̿� ���� �� �� �ִ�.

		
		int i, j;
		for(i=1, j=10; i<=10; i++, j--) {
			 System.out.println("i=" + i + " j=" + j);
		}
		System.out.println(i); 
		// i++�̴ϱ�. 10���� ����ϰ�. 11�ǰ� ���ǽ��� ������ �ǰ��� for���� �������´�.
		// for�� �ۿ��� i�� j�� �� ��찡 �ִٸ� �̿� ���� �Ѵ�.
		
		
//		int i=1;
//		for(; ;) { // for(;true;)�� ����. // ���� �ݺ���
//			System.out.println("i="+i);
//		}
//		System.out.println(i);
		// Unreachable code = �� ������ ������ �� ����.
		// ���ǽ��� ������ for���� true�� ���ֵǾ� ���� �ݺ����� ��
		// �׷��� for���� ���������� ���ϰ� �� ������ ������� ����.
		
		
		
		
	}
}