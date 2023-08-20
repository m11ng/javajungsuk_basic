class Ex6_3 {
	public static void main(String args[]) {
		System.out.println("Card.width = " + Card.width); // 100
		System.out.println("Card.height = " + Card.height); // 250

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")"); // heart 7 100 250
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")"); // spade 4 100 250
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		Card.width = 50;
		Card.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")"); // Heart 7 50 80
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")"); // Spade 4 50 80
	} 
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}