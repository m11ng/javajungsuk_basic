package pkg2;

//���� �ڵ� ��ȭ ����

class Point {
	int x;
	int y;

	Point () {
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

class Circle {
	Point center;	// ���� ������ǥ
	int r;			// ������

	Circle() {		
		this(new Point(0, 0), 100); // Circle(Point center, int r)�� ȣ��
	}

	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
}

class EX {
		public static void main(String[] args) {

			Circle c = new Circle(new Point(150, 150), 50);
		
			System.out.println(c.center.x);
			System.out.println(c.center.y);
			System.out.println(c.r);



		}
}


