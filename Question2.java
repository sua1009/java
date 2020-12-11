package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		문제 1 ) 무한루프를 사용하여 화면 UI가 매번 출력될 수 있도록 하고 사용자의 입력에 의해서 프로그램이 종료되는 기능을 가지고
//		있는 구구단 출력 프로그램을 작성하세요 
//		1. 종료 여부 입력 
//		2. 출력할 단수 입력 
//		3. nextLine() : 엔터키가 입력될때까지 입력된 데이터를 문자열로 입력받음 
//		4. 문자열 비교 : 문자열.equals("비교할 문자열")
		
		Scanner s = new Scanner(System.in);
		
//		for (;;) {
//			System.out.println("구구단을 출력하시겠습니까? ");
//			String q1 = s.next();
//			if (q1.equals("yes")) {
//				System.out.println("단을 입력하세요. >>>");
//				int dan = s.nextInt();
//				for (int i = 1; i <=9; i ++ ) {
//					System.out.println( dan + "*" + i +"=" + dan*i);
//				}
//			}
//			else if (q1.equals("no")) {
//				System.out.println("종료합니다.");
//				break;
//				}
//		}	
		
			System.out.println("구구단 출력프로그램 입니다. ");
			String exit = "";
		while (true) {
//			equals() : 동일한 문자열일 경우 true 출력, 다를 경우 false 출력 
			
				System.out.println("단을 입력하세요. >>>");
				int dan = s.nextInt();
				for (int i = 1; i <=9; i ++ ) {
					System.out.println( dan + "*" + i +"=" + dan*i);
				}
				
				System.out.println("구구단을 출력하시겠습니까?(yes /no ) ");
				String q2 = s.next();
			
			if (q2.equals("no")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		
	}

}
