import java.io.File;
import java.io.IOException;

class Ex8_10_2 {
	// 쌤이 시작 전에 args에다가 값을 줬어!!!!!! 외부에서 값을 준거.
	// test2.txt
	public static void main(String[] args) {
		//             메인메서드의 매개변수 : String[] args => args의 배열 생성
		// 매개변수를 파라미터라고 한다. parameter = 매개변수
		// String[] : 연속적인 문자열 데이터가 들어가는 저장공간.
		
		
			File f = createFile(""); // 여기에 담긴게 이상이 없으니까.
			System.out.println( f.getName()+"파일이 성공적으로 생성되었습니다."); // 아래 문장이 수행됨.
	}	// main메서드의 끝
	

	static File createFile(String fileName) {
		
		try {
			if (fileName==null || fileName.equals("")) // "" 빈문자열이라서 true가 되고
				throw new Exception("파일 이름이 유효하지 않습니다.");  // 예외가 발생했는데
			
		} catch(Exception e) { // 그걸 여기 캐치가 처리하고
			fileName = "제목없음.txt"; // 이름을 제목없음으로 처리해줌.
			
		}

		// 캐치 문장이 끝났으니까
		File f = new File(fileName); // 파일객체가 생성되고 참조 변수에 담겨서 		

		try {
			f.createNewFile(); // 진짜 파일을 만들어주고 // 이 메서드가 예외를 발생시킬 수 있어 트라이캐치문 감쌈.
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return f;		 // 리턴
	}
	
	

}	











