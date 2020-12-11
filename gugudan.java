import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		//구구단 출력하기 
		
		int i;
		int j;
		
		for (i = 2; i <=9; ) {
			Scanner dan = new Scanner(System.in);
			System.out.println("단을 입력하세요. >>>");
			i = dan.nextInt();
			for (j = 1; j <=9; j ++) {
				System.out.println(i + "*"+ j +"=" + i*j);
			}
			
		}

	}

}
