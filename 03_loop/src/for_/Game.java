package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("insert coin : ");
		int coin = scan.nextInt();
		

		for(int i=1; i<=coin/300; i--) {
			
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력 : ");
			int user = scan.nextInt();
		
			int com = (int)(Math.random() * (3 - 1 + 1) + 1);	// 컴퓨터 난수 발생
			
					// do while문 사용해서 1,2,3만 입력 받도록 설정
		
			if(user == 1) {		// 첫 번째 게임
				if(com == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("나: 가위");
					System.out.println("You Draw!!");
				}
				if(com == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("나: 가위");
					System.out.println("You Lose!!");
				}
				if(com == 3) {
					System.out.println("컴퓨터: 보자기");
					System.out.println("나: 가위");
					System.out.println("You Win!!");
				}
				
			}
		
			if(user == 2) {		// 두 번째 게임
				if(com == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("나: 바위");
					System.out.println("You Win!!");
				}
				if(com == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("나: 바위");
					System.out.println("You Draw!!");
				}
				if(com == 3) {
					System.out.println("컴퓨터: 보자기");
					System.out.println("나: 바위");
					System.out.println("You Lose!!");
				}
				
			}
		
			if(user == 3) {		// 세 번째 게임
				if(com == 1) {
					System.out.println("컴퓨터: 가위");
					System.out.println("나: 보자기");
					System.out.println("You Lose!!");
				}
				if(com == 2) {
					System.out.println("컴퓨터: 바위");
					System.out.println("나: 보자기");
					System.out.println("You Win!!");
				}
				if(com == 3) {
					System.out.println("컴퓨터: 보자기");
					System.out.println("나: 보자기");
					System.out.println("You Draw!!");
				}
				
			}
			System.out.println("게임이 종료되었습니다.");	// 또는 "한 번 더 하시겠습니까?"
		}
		
	}
}



/*
[문제] 가위, 바위, 보 게임
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 컴퓨터(com)는 1 ~ 3까지 난수로 나온다.
- 1게임당 300원으로 한다.


[실행결과]
insert coin : 1000

가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user)

컴퓨터: 바위	나: 보자기
You win!!

가위(1), 바위(2), 보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!

가위(1), 바위(2) ,보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!

*/