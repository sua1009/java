package ch04;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		
//		���� 1) for ���� ����Ͽ� ����ڰ� �Է��� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ��� 
		
		int i;
		int j;
		
			Scanner s = new Scanner(System.in);
			System.out.println("���� �Է��ϼ��� . >>>");
			i = s.nextInt();
			
			System.out.println("============"+i + "�� ================");
			for (j = 1; j <= 9; j ++) {
				System.out.println(i +"*"+j +"="+i*j);
			}
//			����� �Է��� ���� ��ĳ�� Ŭ������ �޸𸮿��� ����
			s.close();
	}

}
