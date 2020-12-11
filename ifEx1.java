package ch04;

import java.util.Scanner;

public class ifEx1 {

	public static void main(String[] args) {
		
		Scanner old = new Scanner(System.in);
		System.out.println("나이를 입력하세요.>>>");
		int age = old.nextInt();
		
		if(age >= 8 && age <=13 ) {
			System.out.println("초등학교에 다닙니다.");
		}
		
		else if ( age >= 14 && age <= 16) {
			System.out.println("중학교에 다닙니다.");
		}
		
		else if ( age >= 17 && age <=19 ) {
			System.out.println("고등학교에 다닙니다.");
		}
		
		else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
