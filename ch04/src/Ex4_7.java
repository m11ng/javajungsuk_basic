class Ex4_7 {
	public static void main(String args[]) {
		// 문제
		// -5~5 사이의 난수를 20개 출력하시오.
		
		// 개별값을 생각한다.
		// -5 -4 -3 -2 -1 0 1 2 3 4 5 => 11개!!!!
		
		int num = 0;
		// 난수를 담을 공간 하나를 만든다.
		
		
		
		for(int i=1; i<=20; i++) {
			num = (int)(Math.random() * 11)+ (-5);
			System.out.println(num);
		}
		
		
		
	}

}