class Ex4_13_2 {
	public static void main(String[] args) {

		// 더한값을 담을 저장공간
		int sum = 1;
		
		// 증가시킬 변수
		int i = 1;
		
		while(sum <=100) { // sum이 100보다 작거나 같을때까지 true !
//			sum += ++i;
			System.out.println("i:" + i + ", sum:" + sum);
			++i; // 1
			sum = sum + i; // 1
//			i++;
		}
		

		
	} // main의 끝
}