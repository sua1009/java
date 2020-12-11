package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		
//		문제 1) for 문을 사용하여 사용자가 입력한 숫자의 구구단을 출력하는 프로그램을 작성하세요 
		
		int i;
		int j;
		
			Scanner s = new Scanner(System.in);
			System.out.println("단을 입력하세요 . >>>");
			i = s.nextInt();
			
			System.out.println("============"+i + "단 ================");
			for (j = 1; j <= 9; j ++) {
				System.out.println(i +"*"+j +"="+i*j);
			}
//			사용자 입력을 위한 스캐너 클래스를 메모리에서 해제
			s.close();
	}

}
