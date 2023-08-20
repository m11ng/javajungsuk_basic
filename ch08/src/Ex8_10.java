import java.io.*;

class Ex8_10 {
	// 쌤이 시작 전에 args에다가 값을 줬어!!!!!! 외부에서 값을 준거.
	// test2.txt
	public static void main(String[] args) {
		//             메인메서드의 매개변수 : String[] args => args의 배열 생성
		// 매개변수를 파라미터라고 한다. parameter = 매개변수
		// String[] : 연속적인 문자열 데이터가 들어가는 저장공간.
		
		
		try {
//			File f = createFile(args[0]);
//			File f = createFile("test2.txt"); // 와 같은 코드
			File f = createFile("");
			System.out.println( f.getName()+"파일이 성공적으로 생성되었습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" 2.다시 입력해 주시기 바랍니다.");
		}
	}	// main메서드의 끝
	

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("1. 파일이름이 유효하지 않습니다.");
		
		File f = new File(fileName);		//  File클래스의 객체를 만든다.
     	// File객체의 createNewFile메서드를 이용해서 실제 파일을 생성한다.
		f.createNewFile();
		return f;		// 생성된 객체의 참조를 반환한다.
	}	// createFile메서드의 끝
}	// 클래스의 끝











