class Product3 {
	
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // ��ǰ�� 10%�� ����Ʈ��.
		
	}
	
	Product3() {} // �⺻ ������.
}


class Tv3 extends Product3 {
	
	Tv3() { super(100); }
	
	public String toString() {
		return "Tv";
	}
	
}

class Computer3 extends Product3 {
	
	Computer3() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio3 extends Product3 {
	
	Audio3() { 
		super(50); // ������ ȣ�� ,�ڽ��� Ŭ�������� ����� ������ �ڽ��� �����ڰ� �ʱ�ȭ�� å�������� �ۼ��ϴ� ���� ����.
	}
	
	public String toString() { return "Audio"; }
	
}

class Buyer3 {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product3[] cart = new Product3[4];
	int i = 0; // Product �迭�� ���� i
	
	void buy(Product3 p) {
		
		if(money < p.price) {
			System.out.println("�ܾ��� ���� �� ������ �� �� �����ϴ�.");
//			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + " �� �����ϼ̽��ϴ�."); // p�� p.toString�̶� ����. �׷� �����ִ� �޼ҵ带 ȣ���Ѱ� �Ǵ°���.
	}
	
	void summary() { // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
		int sum = 0; // ������ ��ǰ�� ���� �հ�
		String itemList = ""; // ������ ��ǰ���
	
	// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break; // �극��ũ �� ���� .. ���ΰ� ���Ǽ� �� �𸣰���
			} // null�� �ƴѰ�� �Ʒ��� �������� �ڵ带 �����ϴ°���. �򰥸��� ����!!!!
			sum += cart[i].price;
			 itemList += cart[i] + ", ";
			
		}
		System.out.println(sum + "���� �Դϴ�.");
		System.out.println(itemList + " �Դϴ�.");
		System.out.println(cart[0]);
	
	}
	
	
	 
	
}



public class Ex7_9_1 {

	public static void main(String[] args) {

		Buyer3 b = new Buyer3();
		

//		Product3 p = new Product3();
//		b.buy(p);
		b.buy(new Tv3());
		b.buy(new Audio3());
		b.buy(new Computer3());
		
		b.summary();
	
	}

}
