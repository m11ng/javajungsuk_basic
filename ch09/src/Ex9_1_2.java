
public class Ex9_1_2 {

	public static void main(String[] args) {
		
		Value2 v1 = new Value2(10);
		Value2 v2 = new Value2(10);
		
		if(v1.equals(v2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
			
		}
		// 를 비교했을 떄 같다고 나올 수 있는 메서드를 만들어 보자.
		

	}

}

class Value2 {
	
	int value;
	
	Value2(int value) {
		this.value = value;
	}
	
	// 생성자를 통해서 value 초기화
	
	
	
	public boolean equals(Object obj) { 
		
		// object타입이기 때문에 다들어 올 수 있어. 그래서 꼭 instanceof 해줘야 함
		
		// 형변환
		// 왜?
		// object 타입에는 value라는 iv가 없으니까. 
		// 형변환 해서 쓰게 해줘야 값이 비교가 되지.
		
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
		
		// 위에 두 문장을 아래와 같이 한문장으로 줄일 수 있다.
		
		return this.value == ((Value2)obj).value;
		
		
		
		
	}
	
	
	
}
