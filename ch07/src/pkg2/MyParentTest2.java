package pkg2;

import pkg1.MyParent;
//  import���� ������
// �����Ϸ����� �Ʒ� �ҽ����Ͽ� ���� Ŭ������ ��Ű���� ���� ������ �����ϴ� ��


class MyChild extends MyParent { // ��ӹ޾����ϱ�. ��ü�� �ȸ��� ����. �ڽ��� �θ� �� ���� �޾����ϱ�.
	
	public void printMemeber() {
//		System.out.println(prv); // ���� Ŭ�������� ����� �� ������ ���� 
//		System.out.println(dft); // ���� ��Ű������ ��� �� �� ������ ����
		System.out.println(prt); // ���� ��Ű�� + �ٸ� ��Ű���� �ڼ�Ŭ�������� ����� �� ������ ����
		System.out.println(pub); // ���� ���� ����
	}
	
}
public class MyParentTest2 {
	
	public static void main(String[] args) {

		MyParent p = new MyParent();
//		System.out.println(p.prv); // ���� Ŭ���������� ��� �����ϱ� ������ ������ ����
//		System.out.println(p.dft); // ���� Ŭ���� + ���� ��Ű������ ��� ������
//		System.out.println(p.prt); // ���� Ŭ���� + ���� ��Ű�� + �ٸ� ��Ű���� �ڼ�Ŭ�������� ���� ����
		System.out.println(p.pub); // ���ٿ� ���� ������ ����.
	}


	
	
	
}
