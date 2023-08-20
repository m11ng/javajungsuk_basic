class MyPoint{

	int x;
	int y;
	
}
 
class Circle extends MyPoint {
	int r;
	
}

class Circle2 {
	MyPoint p = new MyPoint();
	int r;
}


public class InheritanceTest {

	public static void main(String[] args) {

		Circle c = new Circle();
		c.x = 10; // 부모한테 상속받은 변수를 바로 불러 올 수 있음. 왜? 부모꺼가 내꺼임. 변수 똑같이 생성되어 있음
		c.y = 10;
		c.r = 10;
		System.out.println(c.x + "," +  c.y + "," + c.r);
	
		Circle2 c2 = new Circle2();
		c2.p.x = 10;
		c2.p.y = 10;
		c2.r = 10;
		System.out.println(c2.p.x + "," +  c2.p.y + "," + c2.r);
		System.out.println(c.toString());
		System.out.println(c2.toString());
	
	}

}
