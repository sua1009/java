package ch05;

import java.util.Scanner;

public class ArrayEx {
	public void arrayEx1() {
		int[] intArr1; // �迭 ���� ���� 
		int[] intArr2 = null; // �迭 ���� �� null�� �ʱ�ȭ 
		int intArr3[] = {1, 2, 3, 4, 5}; // �迭 ����� ���ÿ� ������ �Է�
		int intArr4[] = new int [5]; //�迭�� ũ�⸦ 5�� �����ϰ� �����ʹ� ���Է�
		
		
		intArr1 = new int[3];
		intArr1[0]= 1;
		intArr1[1]= 2;
		intArr1[2]= 3;
		System.out.println("�迭 intArr1�� ���� : " + intArr1.length);
		
		intArr2 = new int[3];
		intArr2[0] = 10;
		intArr2[1] = 20;
		intArr2[2] = 30;
		System.out.println("�迭 intArr2�� ���� : " + intArr2.length);
		
		intArr3[4] = 500;
		System.out.println("�迭 intArr3�� index 4�� �� ��� : " + intArr3[4]);
		
		intArr4[0] = 1000;
		System.out.println("�迭 intArr4[0]�� �� : " + intArr4[0]);
		
	}
	
	public void arrayEx2() {
		System.out.println("\n------------arrayEx2------------\n");
		
		int score[] = { 80, 90, 75 };
		System.out.println("���� �迭 ���");
		System.out.println("score[0] : " + score[0] );
		System.out.println("score[1] : " + score[1] );
		System.out.println("score[2] : " + score[2] );
		
		System.out.println();
		for (int i = 0; i < score.length; i ++) {
			System.out.println("score[" +i +"] : " + score[i]);
		}
	}
	public void arrayEx3() {
//		���� 3) �迭(ũ�� 5)�� ����Ͽ� ������ ���հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���  
//		����� ���� �Է��� ���� ��� ���� 
		
//		int jumsu[] = {50, 60, 70, 80, 90};
		
		
//		���� ������ ������ �迭 ����
		int jumsu[] = new int[5];
		float total = 0;
		float avg = 0.0f;
		
		Scanner s = new Scanner(System.in);
		
//		������ ������ �ݺ���
		for (int a = 0; a <jumsu.length; a ++) {
			System.out.print((a+1)+"��° ������ �Է��ϼ���. >>>");
			jumsu[a] = s.nextInt();
		}
		
//		������ ����� �ݺ���
		for (int i = 0; i < jumsu.length; i ++) {
			
			total += jumsu[i];
		}
		avg = total/5;
		System.out.println("������ : " + total);
		System.out.println("����� : " + (float)avg);
		
		
		
		
		
		
	}
	
	
	
}
