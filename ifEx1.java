package ch04;

import java.util.Scanner;

public class ifEx1 {

	public static void main(String[] args) {
		
		Scanner old = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���.>>>");
		int age = old.nextInt();
		
		if(age >= 8 && age <=13 ) {
			System.out.println("�ʵ��б��� �ٴմϴ�.");
		}
		
		else if ( age >= 14 && age <= 16) {
			System.out.println("���б��� �ٴմϴ�.");
		}
		
		else if ( age >= 17 && age <=19 ) {
			System.out.println("����б��� �ٴմϴ�.");
		}
		
		else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
	}

}
