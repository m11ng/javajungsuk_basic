class A {
	public void method(I i) {
		i.method();
	}
}

interface I {
	public void method(); // 메세드 선언
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드"); // 메서드 구현
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {

		A a = new A();
		a.method(new B());
		a.method(new C());
	}

}
