package ch04;

import java.util.Arrays;
import java.util.Scanner;

public class random_test {

	public static void main(String[] args) {
//		�ζǹ�ȣ ����ϱ� 
		
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
		System.out.print("�ζ� ��ȣ�� ");
		for (int i = 0; i <lotto.length;i++) {
			System.out.print("["+ lotto[i] + "]");
		}
		System.out.println("�Դϴ�.");
		
		
		
		
		
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("---------------");
		int cnt =1;
		int comnum = (int)(Math.random()*100+1);
		
		for(cnt = 1;cnt <= 20; cnt ++) {
			System.out.println(" ����� ���ڸ� �Է��ϼ���. >>> ");
			int usernum = s.nextInt();
			
			if (comnum == usernum) {
				System.out.println("���� ���߼̳׿�!!");
				System.out.println(cnt +"�� ���� �����ϼ̽��ϴ�.");
				break;
			}
			else if (comnum > usernum) {
				System.out.println("�� ū ���ڸ� �Է��ϼ���.");
			}
			
			else if (comnum < usernum ) {
				System.out.println("���� ���ڸ� �Է��ϼ���.");
			}
			if (cnt ==20) {
				System.out.println("20���� �ʰ��߽��ϴ�. �ٽ� �����ϼ���.");
			}
		}
		
	}

}
