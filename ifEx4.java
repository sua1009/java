package ch04;

public class ifEx4 {

	public static void main(String[] args) {
		
//		������� Math.random()*20�� �Է��ҽ� 0~ 19������ ���ڰ� ��µȴ�.
//		1~ 20������ ������ ���� ����Ϸ��� Math.random()*20 +1 �� �Է��Ѵ�.�Ǵ� Math.random()*21�� �Է��Ѵ�.   
		int score = (int)(Math.random()*20) + 81;
		System.out.println(score);
		
		String grade;
		
		if(score >=90) {
			if(score >95) {
				grade = "A+";
			}
			else {
			grade = "A";
			}
		}
		else {
			if (score >85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("����� ������ "+ score + "�̰�, �����" +grade +"�Դϴ�.");
		
	}

}
