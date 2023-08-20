class Ex3_11 {
	public static void main(String args[]) { 
		
		double pi = 3.141592; 
		
		// 소수점 4번째 자리에서 반올림하여, 3.142를 만들어 보자.
		
		System.out.println(pi); // 3.141592
		System.out.println(pi * 1000); // 3141.592
		System.out.println(Math.round(pi)); // 3
		System.out.println(Math.round(pi*1000)); // 3142
		System.out.println(Math.round(pi*1000)/1000); // 3
		System.out.println(Math.round(pi*1000)/1000.0); // 3.142
		System.out.println((double)Math.round(pi*1000)/1000); // 3.142
		
		
		// 3.141을 만들어 보자.
		System.out.println(pi * 1000); // 3141.592
		System.out.println((int)pi * 1000); // 3000 =>pi를 먼저 변환 후 계산되기 떄문에 
		System.out.println((int)(pi * 1000)); // 3141 => int니까 정수로 값손실
		System.out.println((int)(pi * 1000)/1000.0); // 3141 => int니까 정수로 값손실
		
		

	}
}