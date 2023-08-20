package pkg2;

//위에 코드 심화 버전

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
	Point center;	// 원의 원점좌표
	int r;			// 반지름

	Circle() {		
		this(new Point(0, 0), 100); // Circle(Point center, int r)를 호출
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


