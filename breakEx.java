package ch04;

import java.util.Scanner;

public class breakEx {

	public static void main(String[] args) {
		
		System.out.println("-----------�Ϲ����� break ���---------");
		Scanner s = new Scanner(System.in);
		
		System.out.println("����� ���� ���� �Է��ϼ���. >>>");
		int dan = s.nextInt();
		for (int i = 2; i < 10 ; i ++) {
			System.out.println("---------"+i+"�� ��� -----");
			for (int j = 1; j <10; j ++) {
				if( dan == i ) {
				break;
				}
				System.out.println(i +"x"+j +"="+i*j);
			}
		}
		
		
		
		
		System.out.println("-----------Label�� Ȱ����  break ���---------");
		
		System.out.println("����� ���� ���� �Է��ϼ���. >>>");
		dan = s.nextInt();
		label:for (int i = 2; i < 10 ; i ++) {
			System.out.println("---------"+i+"�� ��� -----");
			for (int j = 1; j <10; j ++) {
				if( dan == i ) {
				break label;
				}
				System.out.println(i +"x"+j +"="+i*j);
			}
		}
		
		
	}

}
