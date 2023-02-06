package multi_;

public class MultiFor03 {

	public static void main(String[] args) {
		int dan, i;
		
		for(i=1; i<=9; i++) {
			for(dan=2; dan<=9; dan++) {
				System.out.print(dan + " * " + i + " = " + dan * i + "\t");
			}	// for dan
			System.out.println();
		}	// for i

	}

}

/*
[문제] 2단 ~ 9단

2 * 1 = 2	3 * 1 = 3	4 * 1 = 4	5 * 1 = 5	6 * 1 = 6	7 * 1 = 7	8 * 1 = 8	9 * 1 = 9	
2 * 2 = 4	3 * 2 = 6	4 * 2 = 8	5 * 2 = 10	6 * 2 = 12	7 * 2 = 14	8 * 2 = 16	9 * 2 = 18	
2 * 3 = 6	3 * 3 = 9	4 * 3 = 12	5 * 3 = 15	6 * 3 = 18	7 * 3 = 21	8 * 3 = 24	9 * 3 = 27	
.
.
.
*/