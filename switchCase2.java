package ch04;

import java.util.Scanner;
public class switchCase2 {

	public static void main(String[] args) {
//		String medal = "Gold";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("메달의 색상을 영어로 입력해주세요 . >>");
		String medal = sc.next();
		
		switch(medal) {
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
			break;
		case "Bronze":
			System.out.println("동메달입니다.");
			break;
		default:
			System.out.println("메달이 없습니다.");
			break;
		
		}
		
//		문제 1) 랜덤 숫자를 1~3 까지 출력하여 1은가위, 2는 바위, 3은 보로 설정하고 사용자 입력을 통해서 
//		컴퓨터와 가위, 바위, 보를 하는 프로그램을 작성하세요 
//		랜덤 숫자 : Math.random() : 
//		사용자 입력 : import java.util.Scanner;
//		
		int computer = (int)(Math.random()*3+1);
		
		
//		Scanner sc1 = new Scanner(System.in);
		System.out.println("가위 바위 보. >>>");
		int user2 = sc.nextInt();
		
		System.out.println("컴퓨터는"+computer);
		if (computer > user2 ) {
			System.out.println("컴퓨터가 이겼습니다. ");
		}
		else if (computer < user2) {
			System.out.println(" 내가 이겼습니다. ! 야호 ! ");
		}
		else if (computer == user2) {
			System.out.println("비겼습니다. 다시하세요");
		}
		
		
		

		
//		랜덤 숫자를 0~9까지의 숫자 1개를 생성하고 사용자 입력을 하나 받아서 컴퓨터가 저장한 숫자와 같을 경우 '맞췄다.' 다를경우 
//		'꽝 다음 기회를...'이라는 문장을 출력하는 프로그램을 작성하세요 
	
		int computer1 = (int)(Math.random()*10);
		
//		Scanner user = new Scanner(System.in );
		System.out.println("내 숫자는.>>>");
		int user1 = sc.nextInt();
		
		System.out.println("랜덤 숫자는 " + computer1);
		if (computer1 == user1) {
			System.out.println("맟췄다.");
		}
		else {
			System.out.println("꽝 다음기회에 ... ");
		}

	}

}
