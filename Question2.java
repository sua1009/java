package ch04;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {

//		���� 1 ) ���ѷ����� ����Ͽ� ȭ�� UI�� �Ź� ��µ� �� �ֵ��� �ϰ� ������� �Է¿� ���ؼ� ���α׷��� ����Ǵ� ����� ������
//		�ִ� ������ ��� ���α׷��� �ۼ��ϼ��� 
//		1. ���� ���� �Է� 
//		2. ����� �ܼ� �Է� 
//		3. nextLine() : ����Ű�� �Էµɶ����� �Էµ� �����͸� ���ڿ��� �Է¹��� 
//		4. ���ڿ� �� : ���ڿ�.equals("���� ���ڿ�")
		
		Scanner s = new Scanner(System.in);
		
//		for (;;) {
//			System.out.println("�������� ����Ͻðڽ��ϱ�? ");
//			String q1 = s.next();
//			if (q1.equals("yes")) {
//				System.out.println("���� �Է��ϼ���. >>>");
//				int dan = s.nextInt();
//				for (int i = 1; i <=9; i ++ ) {
//					System.out.println( dan + "*" + i +"=" + dan*i);
//				}
//			}
//			else if (q1.equals("no")) {
//				System.out.println("�����մϴ�.");
//				break;
//				}
//		}	
		
			System.out.println("������ ������α׷� �Դϴ�. ");
			String exit = "";
		while (true) {
//			equals() : ������ ���ڿ��� ��� true ���, �ٸ� ��� false ��� 
			
				System.out.println("���� �Է��ϼ���. >>>");
				int dan = s.nextInt();
				for (int i = 1; i <=9; i ++ ) {
					System.out.println( dan + "*" + i +"=" + dan*i);
				}
				
				System.out.println("�������� ����Ͻðڽ��ϱ�?(yes /no ) ");
				String q2 = s.next();
			
			if (q2.equals("no")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		
		
	}

}
