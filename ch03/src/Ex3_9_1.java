
public class Ex3_9_1 {

	public static void main(String[] args) {

		int a = 1_000_000;
		int b = 2_000_000;
		
		// 산술 변환
		
//		long c = a * b;
//		long c = -1454759936;
//		System.out.println(c); // -1454759936 이란 이상한 숫자가 나옴
//		값손실
		
		long c = (long)a * b; 
		System.out.println(c);
		// a 또는 b의 타입을 long으로 바꿔줘야함.
		
		// 왜냐?
		
		/*
		long c = (long)a * b;
		long c = (long)1000000 * 2000000;
		long c = (long)1000000L * 2000000L;
		long c = 2000000000000L;
		*/
		
		// 과정을 거치기 때문에
		
		
		
	}

}
