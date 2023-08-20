class Product3 {
	
	int price;
	int bonusPoint;
	
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 제품의 10%를 포인트로.
		
	}
	
	Product3() {} // 기본 생성자.
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
		super(50); // 생성자 호출 ,자신의 클래스에서 선언된 변수는 자신의 생성자가 초기화를 책임지도록 작성하는 것이 좋다.
	}
	
	public String toString() { return "Audio"; }
	
}

class Buyer3 {
	
	int money = 1000;
	int bonusPoint = 0;
	
	Product3[] cart = new Product3[4];
	int i = 0; // Product 배열에 사용될 i
	
	void buy(Product3 p) {
		
		if(money < p.price) {
			System.out.println("잔액이 부족 해 물건을 살 수 없습니다.");
//			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + " 를 구입하셨습니다."); // p는 p.toString이랑 같다. 그럼 위에있는 메소드를 호출한게 되는거임.
	}
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0; // 구매한 물품의 가격 합계
		String itemList = ""; // 구입한 물품목록
	
	// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) {
				break; // 브레이크 문 아직 .. 공부가 덜되서 잘 모르겠음
			} // null이 아닌경우 아래로 내려가서 코드를 실행하는거지. 헷갈리지 말자!!!!
			sum += cart[i].price;
			 itemList += cart[i] + ", ";
			
		}
		System.out.println(sum + "만원 입니다.");
		System.out.println(itemList + " 입니다.");
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
