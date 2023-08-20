import java.io.*;

class Ex8_10 {
	// ���� ���� ���� args���ٰ� ���� ���!!!!!! �ܺο��� ���� �ذ�.
	// test2.txt
	public static void main(String[] args) {
		//             ���θ޼����� �Ű����� : String[] args => args�� �迭 ����
		// �Ű������� �Ķ���Ͷ�� �Ѵ�. parameter = �Ű�����
		// String[] : �������� ���ڿ� �����Ͱ� ���� �������.
		
		
		try {
//			File f = createFile(args[0]);
//			File f = createFile("test2.txt"); // �� ���� �ڵ�
			File f = createFile("");
			System.out.println( f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" 2.�ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}	// main�޼����� ��
	

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("1. �����̸��� ��ȿ���� �ʽ��ϴ�.");
		
		File f = new File(fileName);		//  FileŬ������ ��ü�� �����.
     	// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		f.createNewFile();
		return f;		// ������ ��ü�� ������ ��ȯ�Ѵ�.
	}	// createFile�޼����� ��
}	// Ŭ������ ��











