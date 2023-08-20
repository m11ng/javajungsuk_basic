class AAA {

	int i = 100;
	BBB b = new BBB();

	class BBB {
		
		void method() {
			AAA a = new AAA();
			System.out.println(a.i);
		}
		
}

	
}

class CCC {
	
//	BBB b = new BBB();
	
	
}


public class InnerTest {

	public static void main(String[] args) {
		
//		BBB b = new BBB();
		// AAA클래스 안으로 들어 갔기 때문에 AAA클래스의 멤버처럼 다뤄지고,
		// AAA클래스 객체를 생성한 후 에 접근 할 수 있음
		

	}

}
