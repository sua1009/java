package ch05;

import java.util.Arrays;

public class ArrEx2 {
	public void TwoDimension() {
		System.out.println("----------다차원(2차원 이상) 배열 -----------");
		
//		배열의 첫번째 대괄호는 밖에 있는 배열을 뜻함
//		배열의 두번째 대괄호는 안에 있는 배열을 뜻함 
		int[][] arr = new int[][]{{1,2,3}, {4,5,6}};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
	}
	public void TwoDimension2() {
		System.out.println("------------twoDimention2---------");
	
		int[][] arr = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[1][2]);
	}
	
	public void TwoDimension3() {
		System.out.println("----------------twoDimension3------------");
//		문제 1 ) 2차원 배열을 선언과 동시에 1~25 가지의 숫자를 저장하는 2차원 배열을 생성하세요 
//		문제 2 ) 2차원 배열을 선언하고, 1~ 25 까지의 숫자를 나중에 입력하는 형태의 배열을 생성하세요 
//		데이터 추가 부분까지 입력
//		문제 3 ) 2차원 배열을 선언하고 1~25 까지의 숫자를 반복문을 통하여 입력하고 출력하는 프로그램을 작성하세요 
		
		int[][] arr = new int[][] {
			{1,2,3,4,5}, 
			{6,7,8,9,10}, 
			{11,12,13,14,15}, 
			{16,17,18,19,20}, 
			{21,22,23,24,25}
			};
			
			
		int[][] arr2 = new int[5][5];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[0][3] = 4;
		arr2[0][4] = 5;
		
		arr2[1][0] = 6;
		arr2[1][1] = 7;
		arr2[1][2] = 8;
		arr2[1][3] = 9;
		arr2[1][4] = 10;
		
		arr2[2][0] = 11;
		arr2[2][1] = 12;
		arr2[2][2] = 13;
		arr2[2][3] = 14;
		arr2[2][4] = 15;
		
		arr2[3][0] = 16;
		arr2[3][1] = 17;
		arr2[3][2] = 18;
		arr2[3][3] = 19;
		arr2[3][4] = 20;
		
		arr2[4][0] = 21;
		arr2[4][1] = 22;
		arr2[4][2] = 23;
		arr2[4][3] = 24;
		arr2[4][4] = 25;
		
		
		System.out.println("-------------문제 3---------------");
		int[][] arr3 = new int[5][5];
			
		int count = 1;
		for (int i = 0; i < arr3.length; i ++) {
			for (int j = 0; j < 5; j ++) {
				arr3[i][j]= count;
				count ++;
			}
		}
		
		for (int i = 0; i < arr3.length; i ++) {
			for (int j = 0; j < arr3[i].length; j ++) {
				System.out.println("arr3 ["+ i +"]["+j+"] =" + arr3[i][j]);
			}
			System.out.println();
		}
		
		
		System.out.println("-------------문제 4---------------");
		int sum = 0;
		
		for (int i = 0; i < arr3.length; i ++) {
			for (int j = 0; j < arr3[i].length; j ++) {
				sum += arr3[i][j];
			}
		}
		System.out.println("1~ 25까지의 합 : " +sum);

	}
	
	public void arrayCopy1() {
		System.out.println("-----------배열 복사 1------------");
		
		int[] arr1 = new int[] {1,2,3};
		int[] arr2 = null;
		
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		
		System.out.println("배열 arr2에 배열 arr1을 대입 :");
		arr2 = arr1;
		
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		
		System.out.println("배열 arr1[0]의 값 변경 ");
		arr1[0] = 100;
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		
		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
	
	}
	
	
	public void arrayOutput(int[] array, String name) {
		if (array != null){
				for (int i = 0; i < array.length; i ++) {
			System.out.println( name +"[" + i + "]" + array[i]);
				}
		}
		else {
			System.out.println(name + "배열이 비었습니다.");
		}
	}
	
	public void arrayCopy2() {
		System.out.println("\\n---------arrayCopy2-----------\n");
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = null;
		
		System.out.println("복사 전의 원본 배열");
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		System.out.println("for문을 통한 복사");
		
		arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i ++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열  arr1[0]의 값 변경");
		arr1[0] = 100;

		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr2[2]의 값 변경");
		arr2[2] = 3000;
		System.out.println("배열 arr1의 데이터 ");
		arrayOutput(arr1, "arr1");
		System.out.println("배열 arr2의 데이터 ");
		arrayOutput(arr2, "arr2");
	}
	
	public void arrayCopy3() {
		System.out.println("\n-----------arrayCopy3------------\n");
//		System.arraycompy() 메서드를 이용하여 배열을 복사 
//		System.arraycopy(원본, 복사 시작지점, 사본, 붙여넣을 위치 , 복사 갯수)
		
		int[] arr1 = new int[]{1,2,3,4,5};
		int[] arr2 = new int[10];
		
		System.out.println("복사전 원본 배열");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("복사 후 배열");
		System.arraycopy(arr1, 0, arr2, 0, 5);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr1[0]의 값 변경 ");
		arr1[0]= 100;
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		
		System.out.println("배열 arr2[8]의 값 변경 ");
		arr2[8] = 9000;
		
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
	}
	
	public void arrayCopy4() {
		System.out.println("\n-----------arrayCopy4------------\n");
//		Arrays 클래스 : 해당 배열에 여러가지 기능을 사용할 수 있도록 도와주는 클래스 
//		copyOf (원본, 복사할 길이) : 원본 배열의 0 index에서 지정한 길이만큼 데이터를 복사
//		copyOfRange(원본, 시작index, 끝index) :  원본 배열에서 지정한 시작 index부터 끝 index까지 데이터를 복사
		
		int[] arr1 = new int[] {1,2,3,4,5};
		int[] arr2 = new int[5];
		System.out.println("원본 배열");
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("Arrays.copyOf 복사 후 배열");
		arr2 = Arrays.copyOf(arr1, arr1.length);
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
		System.out.println("배열 arr1[0]의 값 변경 ");
		arr1[0]= 100;
		arrayOutput(arr1, "arr1");
		arrayOutput(arr2, "arr2");
		
	}
	
	public void adFor() {
		System.out.println( "----------------향상된 for 문--------------");
			
		int[] scores = new int[] { 95, 71, 84, 93, 87 };
			
		int total = 0;
		
		System.out.println("일반적인 for 문을 사용하여 총합 구하기");
		for (int i = 0; i < scores.length; i ++) {
			total += scores[i];
			System.out.println("total의 값 :"+ total);
		}
		
		total =0;
		System.out.println("향상된 for 문을 사용하여 총합 구하기");
		for (int value : scores) {
			total += value; 
			System.out.println("total의 값 : " + total);
		}
	}
}
