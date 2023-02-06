package array;

import java.util.Scanner;

public class Array03_ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		int[] ar;
		int sum = 0;
		
		System.out.print("배열 크기 입력 : ");
		size = scan.nextInt();
		
		ar = new int[size];		// 배열 생성
		
		for(int i=0; i<size; i++) {
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i] = scan.nextInt();
		
			sum += ar[i];
		}	// for문
		System.out.println();
		
		// 최댓값
		int max, min;	
		max = min = ar[0];		// 배열의 첫 번째 데이터를 초기값으로 가진다.
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
				
		for(int data : ar) {		// 25 13 57 출력 부분
			System.out.print(data + "	");
		}
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최댓값 = " + max);
		System.out.println("최솟값 = " + min);
	}
}

/*
[문제] 배열의 크기를 입력 받아서 배열을 생성한다.
데이터를 출력하고 합, 최댓값, 최솟값을 구하시오

[실행결과]
배열 크기 입력 : 3

ar[0] 입력 : 25 
ar[1] 입력 : 13
ar[2] 입력 : 57

25 13 57
합 = xxx
*/