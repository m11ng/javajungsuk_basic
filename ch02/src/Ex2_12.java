class Ex2_12 {
	public static void main(String args[]) {
		String str = "3";

		// 문자를 숫자로 바꾸기: -'0'
		System.out.println(str.charAt(0) - '0'); // 숫자3 // 문자열을 문자로 바꾸고 다시 숫자로 바꾸는 거
		System.out.println('3' - '0' + 1); // 숫자 4 
		System.out.println();
		
		// 숫자를 문자로 바꾸기 : +'0'
		System.out.println(3 + '0');   // 문자 '3' => 아스키코드로 51
		System.out.println();

		// 문자 + 숫자는 완전 다른 값 => 아스키 코드.
		System.out.println('3' + 1);   // 51 + 1 = 52
		System.out.println();

		// 문자를 숫자로 바꾸기
		System.out.println('3' - '0' + 1); // 숫자 4
		System.out.println();
		
		// 문자열을 숫자로 바꾸기
		System.out.println(Integer.parseInt("3") + 1); // 문자열을 숫자로 캐스팅
		System.out.println(Integer.parseInt(str) + 1); // 문자열을 숫자로 캐스팅
		System.out.println();
		
		// 결과 문자열.
		System.out.println("3" + 1); // 문자열 31
		
	}
}