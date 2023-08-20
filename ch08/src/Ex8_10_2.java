import java.io.File;
import java.io.IOException;

class Ex8_10_2 {
	// ���� ���� ���� args���ٰ� ���� ���!!!!!! �ܺο��� ���� �ذ�.
	// test2.txt
	public static void main(String[] args) {
		//             ���θ޼����� �Ű����� : String[] args => args�� �迭 ����
		// �Ű������� �Ķ���Ͷ�� �Ѵ�. parameter = �Ű�����
		// String[] : �������� ���ڿ� �����Ͱ� ���� �������.
		
		
			File f = createFile(""); // ���⿡ ���� �̻��� �����ϱ�.
			System.out.println( f.getName()+"������ ���������� �����Ǿ����ϴ�."); // �Ʒ� ������ �����.
	}	// main�޼����� ��
	

	static File createFile(String fileName) {
		
		try {
			if (fileName==null || fileName.equals("")) // "" ���ڿ��̶� true�� �ǰ�
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");  // ���ܰ� �߻��ߴµ�
			
		} catch(Exception e) { // �װ� ���� ĳġ�� ó���ϰ�
			fileName = "�������.txt"; // �̸��� ����������� ó������.
			
		}

		// ĳġ ������ �������ϱ�
		File f = new File(fileName); // ���ϰ�ü�� �����ǰ� ���� ������ ��ܼ� 		

		try {
			f.createNewFile(); // ��¥ ������ ������ְ� // �� �޼��尡 ���ܸ� �߻���ų �� �־� Ʈ����ĳġ�� ����.
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		return f;		 // ����
	}
	
	

}	











