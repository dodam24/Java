package multi_;

public class MultiFor04 {

	public static void main(String[] args) {
		int dan, i;
		for(int w=2; w<=8; w+=3) {
			
			for(i=1; i<=9; i++) {
				for(dan=w; dan<=w+2; dan++) {
					if(dan != 10) System.out.println(dan + "*" + i + "=" + dan*i + "\t");
				}	// for i
				System.out.println();
			}	// for dan
			System.out.println();
		}	// for w

	}

}
