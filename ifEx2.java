package ch04;

import java.util.Scanner;

public class ifEx2 {

	public static void main(String[] args) {
		
		
		Scanner gen = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� ");
		char gender = gen.next().charAt(0);		
		if (gender == 'F' || gender =='f') {
			System.out.println("�����Դϴ�.");
		}
		else if( gender == 'M' || gender == 'm'){
			System.out.println("�����Դϴ�.");
		}
		
		else {
			System.out.println("Ÿ�����Դϴ�.");
		}
	}

}
