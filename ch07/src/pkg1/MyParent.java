package pkg1;

public class MyParent {
	private 	int prv; // ���� Ŭ����
				int dft; // ���� ��Ű��
	protected 	int prt; // ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public		int pub; // ���� ���� ����
	
	
	public void printMemeber() {
		System.out.println(prv); // ���� Ŭ������ �����ϱ� ��� ����
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {

		MyParent p = new MyParent();
//		System.out.println(p.prv); // ���� Ŭ���������� ��� �����ϱ� ������ ������ ����
		System.out.println(p.dft); // ���� Ŭ���� + ���� ��Ű������ ��� ������
		System.out.println(p.prt); // ���� Ŭ���� + ���� ��Ű�� + �ٸ� ��Ű���� �ڼ�Ŭ�������� ���� ����
		System.out.println(p.pub); // ���ٿ� ���� ������ ����.
		
		System.out.println();
	}
	
	// �ϳ��� �ҽ����Ͽ� �ۺ��� 1���� �־�� �Ѵ�.

}
