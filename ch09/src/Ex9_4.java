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
	
	// 자꾸 까먹는 부분 상기 시키고 가자!!!!!!!!!!
	// 반환값이 void가 아닐 때는!!!!!!!!!!!!!!
	// return문이 들어가야지!!!!!!!!!!!!
	
	public String toString() {
		return "kind: " + kind + ", number: " + number;
		
	}
	
	public boolean equals(Object obj) { // 오버라이딩은 선언부가 일치해야 한다.
		if(obj instanceof Card) {
			return this.kind.equals(((Card)obj).kind) &&  this.number == ((Card)obj).number;
		}
		else {
			return false;
		}
		
	}
	
	// equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
	// 해당 메소드를 주석처리 전과 후를 비교 해보자.
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