class Ex4_13 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		// 1씩 증가하는 값을 몇까지 더해야 100 가까운 숫자를 구할 수 있을까 
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
			++i;
			sum = sum + i;
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	} // main의 끝
}