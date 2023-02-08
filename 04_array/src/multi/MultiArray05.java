package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		//총점, 평균, 이름, 과목수, 과목명, 점수
		String name, subject;
		int sum, jumsu, subjectCnt;
		double avg;
		
		int[][] ar = new int[2][];
		ar[0] = new int[5];
		ar[1] = new int[6];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("인원수 : ");
		int cnt = scan.nextInt(); 
		
		for(int i=0; i<ar.length; i++) {
		ar[0][0] = 
		ar[0][1] = 95;
		ar[0][2] = 100;
		ar[0][3] = 
		ar[0][4] =
		
		ar[1][0] =
		ar[1][1] = 95;
		ar[1][2] = 100;
		ar[1][3] = 90;
		ar[1][4] =
		ar[1][5] =
		
		//int sum = [0][1] + [0][2] + [0][3] - 홍길동
		//		    [1][1] + [1][2] + [1][3] - 이기자
		for(int i=0; i<ar.length; i++) { // 0,1 [2]
			for(int j=0; j<ar[i].length; j++) { //0~4, 0~5 -> [5],[6]
				System.out.println("ar[" + i + "][" + j + "] = " + ar[i][j]);
				}
			System.out.println();
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
홍길동    95     100    xxx     xx.xx

이름     국어  	영어   과학    총점      평균
이기자   95   	100   90     xxx      xx.xx

*/