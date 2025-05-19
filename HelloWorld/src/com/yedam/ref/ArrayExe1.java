package com.yedam.ref;

import java.util.Scanner;

public class ArrayExe1 {

	static Student[] scores = null;
	public static void main(String[] args) {
		boolean run = true; // 반복문 실행, 종료
		int studentNum = 0; // 학생 수

//		int[] scores = null; // 학생 점수

		Scanner scanner = new Scanner(System.in);
		init(); // 초기 데이터 생성

		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.학생 수   2.점수 입력   3.점수 리스트   4.분석   5.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택하세요");

			int selectNo = Integer.parseInt(scanner.nextLine()); // 선택한 값이 실행됨
			// 배열의 선언(학생 수) 없이 선택할 경우 NullPointer 예외
			if (selectNo == 2 || selectNo == 3 || selectNo == 4) {
				if (scores == null) {
					System.out.println("학생 수를 지정하세요");
					continue;
				} // 학생 수를 안 정할 경우 돌아가기
			}
			if (selectNo == 1) { // 학생 수
				System.out.println("학생 수를 입력하세요");
				studentNum = Integer.parseInt(scanner.nextLine());

//				scores = new int[studentNum]; // 배열의 크기(학생 수)를 지정함
				scores = new Student[studentNum];

				
				
				
				
			} else if (selectNo == 2) { // 학생 점수
				for (int i = 0; i < scores.length; i++) { // 배열의 크기(학생 수)만큼 반복

//					System.out.printf("scores[%d]> \n", i);
					// 학생 이름
					System.out.printf("scores[%d] 이름>> \n", i);
					String name = scanner.nextLine();

//					scores[i] = Integer.parseInt(scanner.nextLine()); // 바뀐 값이 배열(점수)에 저장됨
					// 학생 점수
					System.out.printf("scores[%d] 점수>> \n", i);
					int score = Integer.parseInt(scanner.nextLine());
					System.out.println(); // 줄 바꿈
					// ※ Double.parseDouble("175.6"); 문자를 실수 타입으로 전환

					System.out.printf("scores[%d] 키>> \n", i);
					double height = Double.parseDouble(scanner.nextLine());

					System.out.printf("scores[%d] 성별>> \n", i);
					String gender = scanner.nextLine();
					Gender gen = Gender.MALE;
					if(gender.equals("남") || gender.equals("남자")) {
							gen = Gender.MALE;
					} else if(gender.equals("여") || gender.equals("여자")) {
							gen = Gender.FEMALE;
					}

					// 인스턴스 생성
					Student student = new Student();
					student.studentName = name;
					student.score = score;
					student.height = height;
					student.gender = gen;
					scores[i] = student; // 배열에 저장
				}
				
				
				
				

			} else if (selectNo == 3) { // 목록
				// 배열의 합이 0이면 점수 입력하도록 하기
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i].score; // 점수 누적
				}
				// 점수 입력하도록 메시지 출력
				if (sum == 0) {
					System.out.println("점수를 입력하세요");
					continue;
				}

				System.out.print("검색 조건을 입력하세요 ex)'남' 또는 '여'");
				String keyword = scanner.nextLine(); // 남, 여, 엔터
				Gender gen = Gender.MALE; // 초기화
				if(keyword.equals("남") || keyword.equals("남자")) {
					gen = Gender.MALE;
				} else if(keyword.equals("여") || keyword.equals("여자")) {
					gen = Gender.FEMALE;
				}

				// 이름, 점수 출력
				for (int i = 0; i < scores.length; i++) {
					if (keyword.equals("") || gen == scores[i].gender) {
						System.out.printf("이름 : %s, 점수 : %d \n", scores[i].studentName, scores[i].score);
					}
				}

				
				
				
				
			} else if (selectNo == 4) { // 최고 점수와 평균
				int max = 0, sum = 0; // 최고 점수와 합계
				double avg = 0; // 평균

				Student maxStd = new Student(); // 1. maxStd에 이름이랑 점수를 저장할 인스턴스 생성

				for (int i = 0; i < scores.length; i++) {
					sum += scores[i].score; // scores에서 나온 점수를 sum에 누적
					if (max < scores[i].score) { // scores의 점수가 max보다 크면
						max = scores[i].score; // max의 점수를 scores로 변경

						maxStd.score = scores[i].score; // 2. 점수랑
						maxStd.studentName = scores[i].studentName; // 3. 이름을 인스턴스?에 저장
						maxStd.height = scores[i].height;
						maxStd.gender = scores[i].gender;

					}
				}
				avg = 1.0 * sum / scores.length; // 1.0은 정수? 서벌???
				System.out.printf("학생 이름은 %s 최고 점수는 %d 키는 %.1f 성별은 %s 평균 점수는 %.2f\n", maxStd.studentName, maxStd.score,
						maxStd.height, maxStd.gender, avg);

				
				
				
				
			} else if (selectNo == 5) { // 종료
				run = false;
			}

		} // while
		System.out.println("프로그램 종료");

	} // main

	
	
	public static void init() {
		Student s1 = new Student(); // 인스턴스 생성
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student(); // 인스턴스 생성
		s2.studentName = "김민규";
		s2.score = 85;
		s2.height = 185.4;
		s2.gender = Gender.MALE;
		
		Student s3 = new Student(); // 인스턴스 생성
		s3.studentName = "김민선";
		s3.score = 90;
		s3.height = 168.4;
		s3.gender = Gender.FEMALE;
	
		// 초기 데이터
		scores = new Student[] { s1, s2, s3 };
	}
	
	
	
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
		int[] intAry = { 10, 17, 22, 31, 55, 24 };

		int temp = 0;
		// 정렬
		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				// 큰 값 기준으로 위치 변경
				if (intAry[i] > intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				} // if
			} // for
		} // for

		// 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf(" i: %d, 값: %d\n", i, intAry[i]);
		}
		// 1(17)이 0(10)보다 크니까 0으로 이동함
		// temp는 값이 바뀜

		// 최고 값 구하기
		int max = 0;
		for (int i = 0; i < intAry.length; i++) {
			// max와 배열 요소를 비교하면서 큰 값은 max에 저장
			if (max < intAry[i]) {
				max = intAry[i];
			}
		}
		System.out.printf("맥스는 %d\n", max);

		// 합
		int sum = 0;
		int cnt = 0; // 횟수를 저장
//		for(int i = 0; i < intAry.length; i += 2) {
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
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
