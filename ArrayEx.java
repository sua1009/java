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
		
		
//		�迭�� �̸� ���� 
		int[] arr1;
//		�ʿ�ÿ� ��� �����͸� �ѹ��� �Է��Ͽ� ����ϱ� 
		arr1 = new int[] {1, 2, 3, 4, 5};
		
//		�� �迭�� ���� �����ϰ� �ǿ�ÿ� ��� �����͸� �ѹ��� �Է��� ��� �ݵ��  newŰ���带 ����ϴ� ����� ����ؾ� ��
//		arr1 = {1,2,3,4,5}; �̷��� ��� �Ұ� 
		System.out.println("�迭 arr1�� ũ�� : " + arr1.length);
		
		for (int i = 0; i < arr1.length; i ++ ) {
			System.out.println("arr1["+ i +"]" + arr1[i]);
		}
		
	}
	
	public void arrEx3() {
//		�迭�� ���ð� ���ÿ� �����͸� �Է��Ͽ� ����ϱ� 1
		int[]arr1 = new int[] {1,2,3,4,5};
		
//		�迭�� ���ð� ���ÿ� �����͸� �Է��Ͽ� ����ϱ� 2
//		���� ����� ���ÿ� ������ �Է½ÿ��� new �������� 
//		int[] arr1= {1,2,3,4,5};
		
		System.out.println("�迭 arr1�� ũ�� : "+ arr1.length);
		
		for (int i = 0; i < arr1.length; i ++) {
			System.out.println("arr1["+ i + "]" + arr1[i]);
		}
	}
	
	public void arrEx4() {
		System.out.println(" -----------------ex4 -----------------");
		
//		�迭�� �̸� �����ϰ� �ʿ�ÿ� �迭�� ũ�⸸ ���� 
		int[] arr1;
		arr1 = new int[5];
		arr1[0] =1;
		arr1[1] =2;
		arr1[2] =3;
		arr1[3] =4;
		arr1[4] =5;
		
		int [] arr2 = null;
		arr2 = new int[5];
		arr2[0] =1;
		arr2[1] =2;
		arr2[2] =3;
		arr2[3] =4;
		arr2[4] =5;
		
//		���� ���� ����ϴ� ���� , �迭�� ����� new Ű���带 ����ϰ�, �迭�� �� ũ�⸦ �����ϴ� ��� 
//		�����ʹ� �ʿ��� ��쿡 ���� �Է��ϴ� ��� 
		int[] arr3 = new int[5];
		arr3[0] =1;
		arr3[1] =2;
		arr3[2] =3;
		arr3[3] =4;
		arr3[4] =5;
		
		System.out.println("arr1 �� ũ�� : " + arr1.length);
		
		for ( int i =0; i < arr1.length; i ++ ) {
			System.out.println("arr1[" + i + "]"+ arr1[i]);
		}
		
		System.out.println("\narr2 �� ũ�� : " + arr2.length);
		
		for ( int i =0; i < arr2.length; i ++ ) {
			System.out.println("arr2[" + i + "]"+ arr2[i]);
		}
		
		System.out.println("\narr3 �� ũ�� : " + arr3.length);
		
		for ( int i =0; i < arr3.length; i ++ ) {
			System.out.println("arr3[" + i + "]"+ arr3[i]);
		}		
	}
	public void arrEx5() {
		System.out.println("---------------arrEx5-------------");
		
//		char�� ���� 1���� �����ϱ� ���� ������ Ÿ�� 
//		char �迭 ���� �� ũ�� ���� '\u0000'�� �⺻�� 
		char[] alphabets = new char[26];
		char ch = 'A';
		
//		char �迭�� ������ �Է� 
		for (int i = 0; i < alphabets.length; i ++ ) {
			alphabets[i] = ch;
			ch++; // char Ÿ���� ����Ÿ�� �̸鼭 ���ڸ� �����ϴ� ������ Ÿ���̱� ������ ��� ������ ������ 
		}
		for (int i = 0; i < alphabets.length; i ++) {
			System.out.println(alphabets[i] + " : " + (int)alphabets[i]);
		}
	}
}
