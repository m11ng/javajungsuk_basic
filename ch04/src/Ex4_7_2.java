class Ex4_7_2 {
	public static void main(String args[]) {
    
        // ������ ���� ������ �����Ѵ�.
        int num = 0; 

        // ������ ������ �������� �ľ��Ѵ�.
        // 1 2 3 4 5 6 7 8 9 10 => �������� ���� : 10��

        // ������ �ɰ��� ����.
        // �޼����� �������� ���Ѵ�//������ �����//������ ���Ѵ�
        System.out.println(Math.random() * 10);            // ���� �Ǽ�, 0.0~9.0 ����
        System.out.println( (int)(Math.random() * 10) );   // ����, 0~9 ����
        System.out.println( (int)(Math.random() * 10) + 1);// ����, 1~10 ����

        // �ݺ������� ���� 20�� ���
        for(int i=1; i<=20; i++) {
            num = (int)(Math.random()*10)+1;
            System.out.println(num);
        }
    }
}