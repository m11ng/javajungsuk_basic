
public class Ex8_Practice {

	public static void main(String[] args) {

		String ss = new String("hello");
		System.out.println(ss);
		
		String sss = new String();
		sss = "hello";
		System.out.println(sss);
		
		// 이건 스트링이라서 되는건가?
		
		
		// String을 제외한 다른 타입들은 그럼
		// 생성할때 값을 넣을 수 밖에 없는건가?
		Exception ee = new Exception("예외 발생 시킴");
		
		Exception eee = new Exception();
		
		
	}

}
