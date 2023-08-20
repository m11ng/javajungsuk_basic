class Ex4_8 {
	public static void main(String args[]) {
		
		for(int i=1; i<=10; i++) { // i의 값이 1씩 증가한다. 1 2 3 4 ... 10
			System.out.print(i + " " );
		}
		System.out.println();
		
		for(int i=10; i>=1; i--) { // i의 값이 1씩 감소한다. 10 9 ..... 2 1
			// 		  10>=1
			System.out.print(i + " " );
		}
		System.out.println();

		for(int i=1; i<=10; i=i+2) { // i의 값이 2씩 증가한다. 1 3 5 7 9
			System.out.print(i + " " );
		}
		System.out.println();
		
		for(int i=1; i<=10; i=i*2) { // i의 값이 2배씩 증가한다. 1 2 4 8 16
			System.out.print(i + " ");
		}
		System.out.println();

		for(int i=1, j=10; i<=5; i++) {
			 System.out.printf("%d \t %d", i, 11-i);
		}
		System.out.println();
		// i와 j가 같은 타입이여야 이와 같이 쓸 수 있다.

		
		int i, j;
		for(i=1, j=10; i<=10; i++, j--) {
			 System.out.println("i=" + i + " j=" + j);
		}
		System.out.println(i); 
		// i++이니까. 10까지 통과하고. 11되고 조건식이 거짓이 되고나서 for문을 빠져나온다.
		// for문 밖에서 i와 j를 쓸 경우가 있다면 이와 같이 한다.
		
		
//		int i=1;
//		for(; ;) { // for(;true;)와 같다. // 무한 반복문
//			System.out.println("i="+i);
//		}
//		System.out.println(i);
		// Unreachable code = 이 문장의 도달할 수 없다.
		// 조건식을 생략한 for문이 true로 간주되어 무한 반복문이 됨
		// 그래서 for문을 빠져나오지 못하고 위 문장은 실행되지 못함.
		
		
		
		
	}
}