class Product {
	int price;			// 제품의 가격
	int bonusPoint;	// 제품구매 시 제공하는 보너스점수

	Product(int price) { // 매개변수가 있는 생성자
		this.price = price;
		bonusPoint = (int)(price/10.0);	// 보너스점수는 제품가격의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		super(100);		// Tv의 가격을 100만원으로 한다.
	}

	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Buyer {	// 고객, 물건을 사는 사람
	int money = 1000;	  // 소유금액
	int bonusPoint = 0; // 보너스점수

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;            // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품의 보너스 점수를 추가한다.
//		System.out.println(p.toString() + "을/를 구입하셨습니다.");
		System.out.println(p + "을/를 구입하셨습니다.");
		// p와 p.toString 같음
	}
}

class Ex7_8 {
	public static void main(String args[]) {
		Buyer b = new Buyer();

		
		Product p = new Tv1();
		b.buy(p);
		// 위 두줄이
		// b.buy(new Tv1()); 와 같은거임
		
		
		b.buy(new Tv1()); // 참조변수 없이 직접 넣을 수 있다. 대신 리모컨(참조변수가)이 없다. => 여기서는 리모컨가지고 사용할 일이 없기때문에 생성하고 바로 집어 넣어준거임.
		
		b.buy(new Computer()); 
		// ==> 메서드 호출!!! 메서드 안에 프린트 출력이 있으니까 출력이 2번 나오는거야.
		

		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
		
	}
}