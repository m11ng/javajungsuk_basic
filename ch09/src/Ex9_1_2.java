
public class Ex9_1_2 {

	public static void main(String[] args) {
		
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		
		if(v1.equals(v2)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
			
		}
		// �� ������ �� ���ٰ� ���� �� �ִ� �޼��带 ����� ����.
		

	}

}

class Value2 {
	
	int value;
	
	Value2(int value) {
		this.value = value;
	}
	
	// �����ڸ� ���ؼ� value �ʱ�ȭ
	
	
	
	public boolean equals(Object obj) { 
		
		// objectŸ���̱� ������ �ٵ�� �� �� �־�. �׷��� �� instanceof ����� ��
		
		// ����ȯ
		// ��?
		// object Ÿ�Կ��� value��� iv�� �����ϱ�. 
		// ����ȯ �ؼ� ���� ����� ���� �񱳰� ����.
		
//		if(obj instanceof Value2) {
//			
////			Value2 v = (Value2)obj;
////			return  this.value == v.value;
//			
//			return this.value == ((Value2)obj).value;
//		}
//
//		else {
//			return false;
//		}
		
		
		if(!(obj instanceof Value2)) return false;
		
//		Value2 v = (Value2)obj;
//		return this.value == v.value;
		
		// ���� �� ������ �Ʒ��� ���� �ѹ������� ���� �� �ִ�.
		
		return this.value == ((Value2)obj).value;
		
		
		
		
	}
	
	
	
}
