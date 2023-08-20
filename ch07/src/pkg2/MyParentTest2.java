package pkg2;

import pkg1.MyParent;
//  import문의 역할은
// 컴파일러에게 아래 소스파일에 사용된 클래스의 패키지에 대한 정보를 제공하는 것


class MyChild extends MyParent { // 상속받았으니까. 객체를 안만들어도 되지. 자식이 부모꺼 다 물려 받았으니까.
	
	public void printMemeber() {
//		System.out.println(prv); // 같은 클래스에서 사용할 수 있으니 에러 
//		System.out.println(dft); // 같은 패키지까지 사용 할 수 있으니 에러
		System.out.println(prt); // 같은 패키지 + 다른 패키지의 자손클래스까지 사용할 수 있으니 가능
		System.out.println(pub); // 접근 제한 없음
	}
	
}
public class MyParentTest2 {
	
	public static void main(String[] args) {

		MyParent p = new MyParent();
//		System.out.println(p.prv); // 같은 클래스에서만 사용 가능하기 때문에 오류가 생김
//		System.out.println(p.dft); // 같은 클래스 + 같은 패키지에서 사용 가능함
//		System.out.println(p.prt); // 같은 클래스 + 같은 패키지 + 다른 패키지의 자손클래스까지 접근 가능
		System.out.println(p.pub); // 접근에 대한 제한이 없음.
	}


	
	
	
}
