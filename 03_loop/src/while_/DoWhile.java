package while_;

public class DoWhile {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		int a = 0;
		do {
			a++;
			System.out.println(a + " ");
		}while(a<10);
		System.out.println();
		
		
		// A B C D E F ~~~ X Y Z
		// 1줄에 7개씩 출력하시오
		char ch = 'A';
		int count = 0;
		do {
			System.out.println(ch + " ");
			ch++;	//개수 - 1 2 3
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}while(ch<='Z');

	}

}
