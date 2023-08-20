abstract class Unit2 {
	 int x, y;
	 abstract void move(int x, int y);
	 void stop() { System.out.println("����ϴ�.");}
}
	 
	 
interface Fightable {
	// �������̽��� ��� �޼���� public abstract�̱� ������ ��������.
	void move(int x, int y);
	void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable {
	// �������̵� ��Ģ : ���󺸴� ���� �����ڰ� ������ �ȵȴ�.

	public void move(int x, int y) {
		System.out.println("[" + x + ", " + y + "] �� �̵�");
	}
	
	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}
	
	Fightable getFightable() {
		Fighter f = new Fighter();
		return f;
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();
		Fightable f2 = f.getFightable();

		f.move(100, 200);
		f.attack(new Fighter());
		
	}

}
