package ch04;

import java.util.Scanner;

public class ifEx2 {

	public static void main(String[] args) {
		
		
		Scanner gen = new Scanner(System.in);
		System.out.println("성별을 입력하세요 ");
		char gender = gen.next().charAt(0);		
		if (gender == 'F' || gender =='f') {
			System.out.println("여성입니다.");
		}
		else if( gender == 'M' || gender == 'm'){
			System.out.println("남성입니다.");
		}
		
		else {
			System.out.println("타성별입니다.");
		}
	}

}
