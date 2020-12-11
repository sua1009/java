package ch04;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num ;
			num ++;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다. ");
		
		
		int dan = 0;
		Scanner sc = new Scanner(System.in); 
		System.out.println("단을 입력하세요. >>> ");
		dan = sc.nextInt();
		
		int count = 1;
		while (count <10) {
			System.out.println(dan + "*" + count + "="+ dan *count);
			count ++;
		}
		
		
		
//		이중 for 문을 이용한 구구단 출력하기 
		System.out.println();
		System.out.println("-----------구구단 출력-----------");
		
		int i ;
		int j;
		
		for(i = 2; i <= 9; i ++ ) {
			for (j = 1; j <=9; j ++ ) {
				System.out.println(i +"*" +j +"=" + i *j);
			}
			System.out.println("---------------");
		}
	}

}
