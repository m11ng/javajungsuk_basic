class MyPoint3 extends Object{
	int x;
	int y;
	
	public String toString() {
		return "x: " + x + ", y: " + y;  // �޴� �Ű������� ������ ���⼭ x,y�� iv
	}
	
	// �⺻ ������
	MyPoint3() {
		
	}
	
	// �Ű������� ������ �ִ� ������
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
 
public class OverrideTest  {

	public static void main(String[] args) {

		// �Ʒ��� ���̸� �����Ϸ���, �������� ������ ���� �ؾ���.
		// �����ڶ� ������ ���ؼ�
		// �޼ҵ��� �� �������� �ν��Ͻ������� �ʱ�ȭ �ϴ� ������ ��.
		
		MyPoint3 p1 = new MyPoint3();
		// p1�� �⺻�����ڸ� ����ϰ� �����ϱ�. x�� y �� ����Ϸ���, �ʱ�ȭ�� ����� ��
		p1.x = 3;
		p1.y = 5;
		
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1.toString());
		System.out.println(p1);
		// �� �ΰ��� ������ ���ٴ� �� ����ϱ�.
		// ���� ���������� ������ �Է��Ѱ���
		System.out.println("----------------1");
		
		
		MyPoint3 p2 = new MyPoint3(3,5);
		// p2�� �Ű������� ���� �޾Ƽ� x�� y�� �ʱ�ȭ ���ְ� �����ϱ� 
		// ���⼭ �ڵ带 �� ���ʿ䰡 ���°���
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println("----------------2");

		System.out.println(p2);
		System.out.println(p2.toString());
		System.out.println("----------------3");
		
		
		
	}

}
