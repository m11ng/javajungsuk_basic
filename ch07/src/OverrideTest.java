class MyPoint3 extends Object{
	int x;
	int y;
	
	public String toString() {
		return "x: " + x + ", y: " + y;  // 받는 매개변수가 없으니 여기서 x,y는 iv
	}
	
	// 기본 생성자
	MyPoint3() {
		
	}
	
	// 매개변수를 가지고 있는 생성자
	MyPoint3(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
 
public class OverrideTest  {

	public static void main(String[] args) {

		// 아래의 차이를 이해하려면, 생성자의 역할을 이해 해야해.
		// 생성자란 간단히 말해서
		// 메소드의 한 종류이자 인스턴스변수를 초기화 하는 역할을 해.
		
		MyPoint3 p1 = new MyPoint3();
		// p1은 기본생성자를 사용하고 있으니까. x와 y 를 사용하려면, 초기화를 해줘야 해
		p1.x = 3;
		p1.y = 5;
		
		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println(p1.toString());
		System.out.println(p1);
		// 위 두개의 문장이 같다는 거 기억하기.
		// 점점 간단해지는 문장을 입력한거임
		System.out.println("----------------1");
		
		
		MyPoint3 p2 = new MyPoint3(3,5);
		// p2는 매개변수로 값을 받아서 x와 y를 초기화 해주고 있으니까 
		// 여기서 코드를 더 쓸필요가 없는거지
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println("----------------2");

		System.out.println(p2);
		System.out.println(p2.toString());
		System.out.println("----------------3");
		
		
		
	}

}
