
public class Ex3_9_1 {

	public static void main(String[] args) {

		int a = 1_000_000;
		int b = 2_000_000;
		
		// ��� ��ȯ
		
//		long c = a * b;
//		long c = -1454759936;
//		System.out.println(c); // -1454759936 �̶� �̻��� ���ڰ� ����
//		���ս�
		
		long c = (long)a * b; 
		System.out.println(c);
		// a �Ǵ� b�� Ÿ���� long���� �ٲ������.
		
		// �ֳ�?
		
		/*
		long c = (long)a * b;
		long c = (long)1000000 * 2000000;
		long c = (long)1000000L * 2000000L;
		long c = 2000000000000L;
		*/
		
		// ������ ��ġ�� ������
		
		
		
	}

}
