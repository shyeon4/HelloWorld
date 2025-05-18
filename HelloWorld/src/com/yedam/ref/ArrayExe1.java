package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe1 {
	
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생 수 2.점수 입력 3.점수 리스트 4.분석 5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택하세요");
		
		int selectNo = Integer.parseInt(scanner.nextLine());
		
		if(selectNo == 1) {
			System.out.println(studentNum = 3);
		} else if(selectNo == 2) {
			// 작성 위치
		} else if(selectNo == 3) {
			// 작성 위치
		} else if(selectNo == 4) {
			// 작성 위치
		} else if(selectNo == 5) {
			run = false;
		} // while
		
	System.out.println("프로그램 종료");
	
	} // main

	
} // class


	
//		// Math.random 활용해서 10점부터 100점 사이의 점수를 생성
//		// 위에서 생성한 학생 10명의 점수와 함께 평균과 최고 점수ㅇ 구하기
//		// scoreAry 변수명
//		
//		int[] scoreAry = new int[10];
//		int sum = 0;
//		int max = 0;
//		double avg = 0;
//		
//		for(int i = 0; i < 10; i++) {
//			scoreAry[i] = (int)(Math.random() * 91) + 10;
//			System.out.printf("학생들 점수는 %d\n", scoreAry[i]);
//			sum += scoreAry[i];
//			if(max < scoreAry[i]) {
//				max = scoreAry[i];
//			}
//			
//		}
//		avg = 1.0 * sum / 10;
//		System.out.printf("평균은 %.1f, 최고 점수는 %d", avg, max );
//		// f가 소수점 있는 거고 s가 문자? d=정수
	
		
	
	
	public static void test2() {
		// int 배열 (intAry) : 10, 17, 22, 31, 55, 24
		int[] intAry = {10, 17, 22, 31, 55, 24};
		
		int temp = 0;
		// 정렬
		for(int j = 0; j < intAry.length -1; j++) {
			for(int i = 0; i < intAry.length -1; i++) {
				// 큰 값 기준으로 위치 변경
				if (intAry[i] > intAry[i + 1]) { 
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;			
				} // if
			} // for
		} // for
	
		// 출력
		for(int i = 0; i < intAry.length; i++) {
			System.out.printf(" i: %d, 값: %d\n", i, intAry[i]);
		} 
		// 1(17)이 0(10)보다 크니까 0으로 이동함
		// temp는 값이 바뀜
		
		
		// 최고 값 구하기
		int max = 0;
		for(int i = 0; i < intAry.length; i++) {
			// max와 배열 요소를 비교하면서 큰 값은 max에 저장
			if(max < intAry[i]) {
				max = intAry[i];
			}
		}
		System.out.printf("맥스는 %d\n", max);
		
		
		// 합
		int sum = 0;
		int cnt = 0; // 횟수를 저장
//		for(int i = 0; i < intAry.length; i += 2) {
		for(int i = 0; i < intAry.length; i++) {
			if(intAry[i] % 2 == 0) {
			sum += intAry[i];
			cnt++; // 회수를 누적
			System.out.printf("sum: %d, i:%d, 값: %d\n", sum, i, intAry[i]);
			}
		}
		double avg = 1.0 * sum / cnt;
		System.out.printf("평균은 %.1f", avg);

	} // end of main


	
	// 집에서 다시 해보기 (별 만들기)
//	public static void test() {
//		int sum = 0;
//		
//		for(int m = 0; m <= 5; m++) {
//			System.out.print("*");
//			for (int n = 0; n <= m; n++) {
//				System.out.println("*");
//			}
//		}
//	
//
//	} // end of test
	
} // end of class
