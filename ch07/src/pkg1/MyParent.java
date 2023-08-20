package pkg1;

public class MyParent {
	private 	int prv; // 같은 클래스
				int dft; // 같은 패키지
	protected 	int prt; // 같은 패키지 + 자손(다른 패키지)
	public		int pub; // 접근 제한 없음
	
	
	public void printMemeber() {
		System.out.println(prv); // 같은 클래스에 있으니까 모두 가능
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

class MyParentTest {

	public static void main(String[] args) {

		MyParent p = new MyParent();
//		System.out.println(p.prv); // 같은 클래스에서만 사용 가능하기 때문에 오류가 생김
		System.out.println(p.dft); // 같은 클래스 + 같은 패키지에서 사용 가능함
		System.out.println(p.prt); // 같은 클래스 + 같은 패키지 + 다른 패키지의 자손클래스까지 접근 가능
		System.out.println(p.pub); // 접근에 대한 제한이 없음.
		
		System.out.println();
	}
	
	// 하나의 소스파일에 퍼블릭은 1개만 있어야 한다.

}
