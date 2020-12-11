package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class random_test {

	public static void main(String[] args) {
//		로또번호 출력하기 
		
		int lotto[] = new int [6];
		
		for (int i = 0; i < lotto.length; i ++) {
			lotto[i] = (int)(Math.random()*45+1);
			for(int j = 0; j < i; j ++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.print("로또 번호는 ");
		for (int i = 0; i <lotto.length;i++) {
			System.out.print("["+ lotto[i] + "]");
		}
		System.out.println("입니다.");
		
		
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("---------------");
		int cnt =1;
		int comnum = (int)(Math.random()*100+1);
		
		for(cnt = 1;cnt <= 20; cnt ++) {
			System.out.println(" 사용자 숫자를 입력하세요. >>> ");
			int usernum = s.nextInt();
			
			if (comnum == usernum) {
				System.out.println("드디어 맞추셨네요!!");
				System.out.println(cnt +"번 만에 성공하셨습니다.");
				break;
			}
			else if (comnum > usernum) {
				System.out.println("더 큰 숫자를 입력하세요.");
			}
			
			else if (comnum < usernum ) {
				System.out.println("작은 숫자를 입력하세요.");
			}
			if (cnt ==20) {
				System.out.println("20번이 초과했습니다. 다시 도전하세요.");
			}
		}
		
	}

}
