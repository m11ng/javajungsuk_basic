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
		c.x = 10; // �θ����� ��ӹ��� ������ �ٷ� �ҷ� �� �� ����. ��? �θ𲨰� ������. ���� �Ȱ��� �����Ǿ� ����
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
