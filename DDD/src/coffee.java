import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int coffee = 10;
		for(coffee=10; ;) {
		System.out.println("���� ���� �Է��ϼ���.>");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
			
		if (money>300) {
			System.out.println("Ŀ�Ǹ� �ּ���. �Ž��� ����" + (money-300) + "�Դϴ�.");
			coffee=coffee-1;
			System.out.println("���� Ŀ���� ����"+coffee+"�Դϴ�.");
			
		}
		else if (money ==300) {
			System.out.println("Ŀ�Ǹ� �ּ���.");
			coffee = coffee -1;
			System.out.println("���� Ŀ���� ����"+coffee+"�Դϴ�.");
		}
		else if (money <300) {
			System.out.println("���� �����մϴ�.");
			System.out.println("���� Ŀ���� ����"+coffee+"�Դϴ�.");
		}
		if(coffee==0) {
			System.out.println("Ŀ�ǰ� �����ϴ� �ǸŸ� �����մϴ�.");
			break; 
		}
		}
		
		
		
	}

}
