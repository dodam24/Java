package for_;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원하는 단을 입력 : ");
		int dan = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
		System.out.println();
		
		/*
		System.out.println(dan + "*" + 1 + "=" + dan*1);
		System.out.println(dan + "*" + 2 + "=" + dan*2);
		System.out.println(dan + "*" + 3 + "=" + dan*3);
		System.out.println(dan + "*" + 4 + "=" + dan*4);
		System.out.println(dan + "*" + 5 + "=" + dan*5);
		System.out.println(dan + "*" + 6 + "=" + dan*6);
		System.out.println(dan + "*" + 7 + "=" + dan*7);
		System.out.println(dan + "*" + 8 + "=" + dan*8);
		System.out.println(dan + "*" + 9 + "=" + dan*9);
		*/
		
	}

}

/*
[문제] 구구단

원하는 단을 입력 : 2
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18
2*10=20
*/