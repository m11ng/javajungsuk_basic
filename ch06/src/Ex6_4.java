class Ex6_4 {
	public static void main(String args[]) {
		
		MyMath mm = new MyMath();
		long result1 = mm.add(5, 3); // 자동형변환
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5, 3);

		 mm.printGugudan(3);
		// String result6 = mm.printGugudan(3);
		// result6 에 담을 수 없는 이유가 정확히 뭔지 모르겠음
		// 값이 배열? 이라서 그런건가.
		// 값이 하나의 값만 저장될 수 없는 형태여서 그런건가.
		
		
		System.out.println("add(5, 3) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("max(5, 3) = " + result5);
	}
 }

 class MyMath {
	 /*
	 void printGugudan(int dan) {
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		 }
		
	 }
	 */
	 
	 int printGugudan(int dan) {
		 int result;
			 
			 
			 //System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		 return dan;
		 
	 }
	 
	 
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
	
	long max(long a, long b) {
		long result = a > b ? a : b;
		return result;
	}
	
	
	
 }
