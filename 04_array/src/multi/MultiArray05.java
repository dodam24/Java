package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		//name, subjectCnt, subject, jumsu 선언
		String name, subject;
		int subjectCnt, jumsu;
		
		int[][] ar = new int[2][];
		ar[0] = new int[5];
		ar[1] = new int[6];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수 : ");
		int cnt = scan.nextInt(); 
		
		
		for(int i=0; i<cnt; i++) {
			System.out.print("이름입력 : ");
				name = scan.next();
			System.out.print("과목수 입력 : ");
				subjectCnt = scan.nextInt();
		
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
					subject = scan.next();
				System.out.print("점수 입력 : ");
					jumsu = scan.nextInt();
				
			}
			
			
		}
		
		
		
		
		

	}
}

/* 
[문제] //과목수가 다르므로 가변 길이 사용
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력

[실행결과]
인원수 : 2 (cnt)

이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어     영어   총점     평균
홍길동    95     100    xxx    xx.xx

이름     국어  	영어   과학    총점      평균
이기자    95   	100    90    xxx      xx.xx

*/