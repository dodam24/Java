package while_;

public class DoWhile {

	public static void main(String[] args) {
		int a = 0;
		do {
			a++;
			System.out.println(a + " ");
		}while(a<10);
		System.out.println();
		
		char ch = 'A';
		int count = 0;
		do {
			System.out.println(ch + " ");
			ch++;
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}while(ch<='Z');

	}

}
