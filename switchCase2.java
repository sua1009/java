package ch04;

import java.util.Scanner;
public class switchCase2 {

	public static void main(String[] args) {
//		String medal = "Gold";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� ������ ����� �Է����ּ��� . >>");
		String medal = sc.next();
		
		switch(medal) {
		case "Gold":
			System.out.println("�ݸ޴��Դϴ�.");
			break;
		case "Silver":
			System.out.println("���޴��Դϴ�.");
			break;
		case "Bronze":
			System.out.println("���޴��Դϴ�.");
			break;
		default:
			System.out.println("�޴��� �����ϴ�.");
			break;
		
		}
		
//		���� 1) ���� ���ڸ� 1~3 ���� ����Ͽ� 1������, 2�� ����, 3�� ���� �����ϰ� ����� �Է��� ���ؼ� 
//		��ǻ�Ϳ� ����, ����, ���� �ϴ� ���α׷��� �ۼ��ϼ��� 
//		���� ���� : Math.random() : 
//		����� �Է� : import java.util.Scanner;
//		
		int computer = (int)(Math.random()*3+1);
		
		
//		Scanner sc1 = new Scanner(System.in);
		System.out.println("���� ���� ��. >>>");
		int user2 = sc.nextInt();
		
		System.out.println("��ǻ�ʹ�"+computer);
		if (computer > user2 ) {
			System.out.println("��ǻ�Ͱ� �̰���ϴ�. ");
		}
		else if (computer < user2) {
			System.out.println(" ���� �̰���ϴ�. ! ��ȣ ! ");
		}
		else if (computer == user2) {
			System.out.println("�����ϴ�. �ٽ��ϼ���");
		}
		
		
		

		
//		���� ���ڸ� 0~9������ ���� 1���� �����ϰ� ����� �Է��� �ϳ� �޾Ƽ� ��ǻ�Ͱ� ������ ���ڿ� ���� ��� '�����.' �ٸ���� 
//		'�� ���� ��ȸ��...'�̶�� ������ ����ϴ� ���α׷��� �ۼ��ϼ��� 
	
		int computer1 = (int)(Math.random()*10);
		
//		Scanner user = new Scanner(System.in );
		System.out.println("�� ���ڴ�.>>>");
		int user1 = sc.nextInt();
		
		System.out.println("���� ���ڴ� " + computer1);
		if (computer1 == user1) {
			System.out.println("�����.");
		}
		else {
			System.out.println("�� ������ȸ�� ... ");
		}

	}

}
