package ch04;

public class SwitchCase {

	public static void main(String[] args) {
		
		int ranking = (int)(Math.random()*5 +1);
		char medalColor;
		
		switch(ranking) {
		case 1 : medalColor = 'G';
				break;
		case 2 : medalColor = 'S';
				break;
		case 3 : medalColor = 'B';
				break;
		default:
				 medalColor = 'A';
		}
		
		System.out.println(ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}

}
