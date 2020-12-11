package ch04;

import java.util.Scanner;

public class breakEx {

	public static void main(String[] args) {
		
		System.out.println("-----------일반적인 break 사용---------");
		Scanner s = new Scanner(System.in);
		
		System.out.println("출력을 멈출 단을 입력하세요. >>>");
		int dan = s.nextInt();
		for (int i = 2; i < 10 ; i ++) {
			System.out.println("---------"+i+"단 출력 -----");
			for (int j = 1; j <10; j ++) {
				if( dan == i ) {
				break;
				}
				System.out.println(i +"x"+j +"="+i*j);
			}
		}
		
		
		
		
		System.out.println("-----------Label을 활용한  break 사용---------");
		
		System.out.println("출력을 멈출 단을 입력하세요. >>>");
		dan = s.nextInt();
		label:for (int i = 2; i < 10 ; i ++) {
			System.out.println("---------"+i+"단 출력 -----");
			for (int j = 1; j <10; j ++) {
				if( dan == i ) {
				break label;
				}
				System.out.println(i +"x"+j +"="+i*j);
			}
		}
		
		
	}

}
