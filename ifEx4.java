package ch04;

public class ifEx4 {

	public static void main(String[] args) {
		
//		예를들어 Math.random()*20을 입력할시 0~ 19까지의 숫자가 출력된다.
//		1~ 20까지의 랜덤한 수를 출력하려면 Math.random()*20 +1 을 입력한다.또는 Math.random()*21을 입력한다.   
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
		
		System.out.println("당신의 학점은 "+ score + "이고, 등급은" +grade +"입니다.");
		
	}

}
