class Ex4_7_2 {
	public static void main(String args[]) {
    
        // 난수를 담을 공간을 선언한다.
        int num = 0; 

        // 난수의 범위와 개별값을 파악한다.
        // 1 2 3 4 5 6 7 8 9 10 => 개별값의 개수 : 10개

        // 문제를 쪼개는 연습.
        // 메서드의 개별값을 곱한다//정수로 만든다//범위를 정한다
        System.out.println(Math.random() * 10);            // 아직 실수, 0.0~9.0 범위
        System.out.println( (int)(Math.random() * 10) );   // 정수, 0~9 범위
        System.out.println( (int)(Math.random() * 10) + 1);// 정수, 1~10 범위

        // 반복문으로 난수 20개 출력
        for(int i=1; i<=20; i++) {
            num = (int)(Math.random()*10)+1;
            System.out.println(num);
        }
    }
}