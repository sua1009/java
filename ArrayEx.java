package ch05;

import java.util.Scanner;

public class ArrayEx {
	public void arrayEx1() {
		int[] intArr1; // 배열 선언만 진행 
		int[] intArr2 = null; // 배열 선언 및 null로 초기화 
		int intArr3[] = {1, 2, 3, 4, 5}; // 배열 선언과 동시에 데이터 입력
		int intArr4[] = new int [5]; //배열의 크기를 5로 고정하고 데이터는 미입력
		
		
		intArr1 = new int[3];
		intArr1[0]= 1;
		intArr1[1]= 2;
		intArr1[2]= 3;
		System.out.println("배열 intArr1의 길이 : " + intArr1.length);
		
		intArr2 = new int[3];
		intArr2[0] = 10;
		intArr2[1] = 20;
		intArr2[2] = 30;
		System.out.println("배열 intArr2의 길이 : " + intArr2.length);
		
		intArr3[4] = 500;
		System.out.println("배열 intArr3의 index 4번 값 출력 : " + intArr3[4]);
		
		intArr4[0] = 1000;
		System.out.println("배열 intArr4[0]의 값 : " + intArr4[0]);
		
	}
	
	public void arrayEx2() {
		System.out.println("\n------------arrayEx2------------\n");
		
		int score[] = { 80, 90, 75 };
		System.out.println("직접 배열 출력");
		System.out.println("score[0] : " + score[0] );
		System.out.println("score[1] : " + score[1] );
		System.out.println("score[2] : " + score[2] );
		
		System.out.println();
		for (int i = 0; i < score.length; i ++) {
			System.out.println("score[" +i +"] : " + score[i]);
		}
	}
	public void arrayEx3() {
//		문제 3) 배열(크기 5)을 사용하여 점수를 총합과 평균을 구하는 프로그램을 작성하세요  
//		사용자 점수 입력은 원할 경우 구현 
		
//		int jumsu[] = {50, 60, 70, 80, 90};
		
		
//		실제 점수를 저장할 배열 선언
		int jumsu[] = new int[5];
		float total = 0;
		float avg = 0.0f;
		
		Scanner s = new Scanner(System.in);
		
//		점수를 저장할 반복문
		for (int a = 0; a <jumsu.length; a ++) {
			System.out.print((a+1)+"번째 점수를 입력하세요. >>>");
			jumsu[a] = s.nextInt();
		}
		
//		총합을 계산할 반복문
		for (int i = 0; i < jumsu.length; i ++) {
			
			total += jumsu[i];
		}
		avg = total/5;
		System.out.println("총점은 : " + total);
		System.out.println("평균은 : " + (float)avg);
		
		
		
		
		
		
	}
	
	
	
}
