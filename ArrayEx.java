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
		
		
//		배열을 미리 선언 
		int[] arr1;
//		필요시에 모든 데이터를 한버에 입력하여 사용하기 
		arr1 = new int[] {1, 2, 3, 4, 5};
		
//		빈 배열을 먼저 선언하고 피요시에 모든 데이터를 한번에 입력할 경우 반드시  new키워드를 사용하는 방식을 사용해야 함
//		arr1 = {1,2,3,4,5}; 이렇게 사용 불가 
		System.out.println("배열 arr1의 크기 : " + arr1.length);
		
		for (int i = 0; i < arr1.length; i ++ ) {
			System.out.println("arr1["+ i +"]" + arr1[i]);
		}
		
	}
	
	public void arrEx3() {
//		배열을 선택과 동시에 데이터를 입력하여 사용하기 1
		int[]arr1 = new int[] {1,2,3,4,5};
		
//		배열을 선택과 동시에 데이터를 입력하여 사용하기 2
//		변수 선언과 동시에 데이터 입력시에만 new 생략가능 
//		int[] arr1= {1,2,3,4,5};
		
		System.out.println("배열 arr1의 크기 : "+ arr1.length);
		
		for (int i = 0; i < arr1.length; i ++) {
			System.out.println("arr1["+ i + "]" + arr1[i]);
		}
	}
	
	public void arrEx4() {
		System.out.println(" -----------------ex4 -----------------");
		
//		배열을 미리 선언하고 필요시에 배열의 크기만 설정 
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
		
//		가장 많이 사용하는 형태 , 배열을 선언시 new 키워드를 사용하고, 배열의 총 크기를 설정하는 방식 
//		데이터는 필요할 경우에 따로 입력하는 방식 
		int[] arr3 = new int[5];
		arr3[0] =1;
		arr3[1] =2;
		arr3[2] =3;
		arr3[3] =4;
		arr3[4] =5;
		
		System.out.println("arr1 의 크기 : " + arr1.length);
		
		for ( int i =0; i < arr1.length; i ++ ) {
			System.out.println("arr1[" + i + "]"+ arr1[i]);
		}
		
		System.out.println("\narr2 의 크기 : " + arr2.length);
		
		for ( int i =0; i < arr2.length; i ++ ) {
			System.out.println("arr2[" + i + "]"+ arr2[i]);
		}
		
		System.out.println("\narr3 의 크기 : " + arr3.length);
		
		for ( int i =0; i < arr3.length; i ++ ) {
			System.out.println("arr3[" + i + "]"+ arr3[i]);
		}		
	}
	public void arrEx5() {
		System.out.println("---------------arrEx5-------------");
		
//		char은 문자 1개를 저장하기 위한 데이터 타입 
//		char 배열 선언 및 크기 설정 '\u0000'가 기본값 
		char[] alphabets = new char[26];
		char ch = 'A';
		
//		char 배열에 데이터 입력 
		for (int i = 0; i < alphabets.length; i ++ ) {
			alphabets[i] = ch;
			ch++; // char 타입은 정수타입 이면서 문자를 저장하는 데이터 타입이기 때문에 산술 연산이 가능함 
		}
		for (int i = 0; i < alphabets.length; i ++) {
			System.out.println(alphabets[i] + " : " + (int)alphabets[i]);
		}
	}
}
