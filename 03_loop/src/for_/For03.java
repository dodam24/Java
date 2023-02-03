package for_;

public class For03 {

	public static void main(String[] args) {
		int i, sum=0;
		double mul=1;
		
		//i는 1부터 10까지
		for(i=1; i<=10; i++) {
			sum += i;		//sum = sum + i
			//System.out.println(i + "\t" + sum );
	
			mul *= i;		//mul = mul + i
			System.out.println(i * sum);
		}
			System.out.println();
			
		
		/*
		i=1;
		sum = sum+1;	//1
		
		i=2;
		sum = sum+2;	//3
		
		i=3;
		sum = sum+1;	//6
		
		
		
		
		i=10;
		sum = sum+10;	//55
		*/
	}

}
