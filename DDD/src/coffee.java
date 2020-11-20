import java.util.Scanner;
public class coffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int coffee = 10;
		for(coffee=10; ;) {
		System.out.println("받은 돈을 입력하세요.>");
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();
			
		if (money>300) {
			System.out.println("커피를 주세요. 거스름 돈은" + (money-300) + "입니다.");
			coffee=coffee-1;
			System.out.println("남은 커피의 양은"+coffee+"입니다.");
			
		}
		else if (money ==300) {
			System.out.println("커피를 주세요.");
			coffee = coffee -1;
			System.out.println("남은 커피의 양은"+coffee+"입니다.");
		}
		else if (money <300) {
			System.out.println("돈이 부족합니다.");
			System.out.println("남은 커피의 양은"+coffee+"입니다.");
		}
		if(coffee==0) {
			System.out.println("커피가 없습니다 판매를 종료합니다.");
			break; 
		}
		}
		
		
		
	}

}
