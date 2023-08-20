import java.util.Objects;

class Card {
	String kind;
	int number;

	Card() {
		this("SPADE", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	// �ڲ� ��Դ� �κ� ��� ��Ű�� ����!!!!!!!!!!
	// ��ȯ���� void�� �ƴ� ����!!!!!!!!!!!!!!
	// return���� ������!!!!!!!!!!!!
	
	public String toString() {
		return "kind: " + kind + ", number: " + number;
		
	}
	
	public boolean equals(Object obj) { // �������̵��� ����ΰ� ��ġ�ؾ� �Ѵ�.
		if(obj instanceof Card) {
			return this.kind.equals(((Card)obj).kind) &&  this.number == ((Card)obj).number;
		}
		else {
			return false;
		}
		
	}
	
	// equals()�� �������̵��ϸ� hashCode()�� �������̵� �ؾ��Ѵ�.
	// �ش� �޼ҵ带 �ּ�ó�� ���� �ĸ� �� �غ���.
	public int hashCode() {
		return Objects.hash(kind, number);
	}
}

class Ex9_4 {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println();
		
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		System.out.println();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}