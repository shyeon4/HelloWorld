package com.yedam;

import java.util.Scanner;

public class JSExe {
	public static void main(String[] args) {
		// 깃 충돌로 변경
//		int num1 = 30;
//		int num2 = 30;
//		System.out.println(num1 == num2);

//		String str1 = new String("Hello");
//		String str2 = new String("Hello");
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str1.equals(str2));
		// 문자열을 비교할 때는 equals를 사용

		// "30" VS 30
//		String str3 = "30";
//		int num3 = 30;

//		System.out.println(str3.equals("" + num3));
//		int num4 = Integer.parseInt(str3); // 문자열 숫자
//		System.out.println(num3 == num4); // 30 VS "30"을 30

//		test2();
//
//		test3();

//		test4();
		
		test5();
	} // end of main

	public static void test5() {
		// printf("형식 문자열", 값1, 값2.....)
//		System.out.printf("%s %n\n", "문자", 30);
//		System.out.printf("%s %.1f\n", "테스트", 30.3);
		// In을 넣어야 엔터 쳐진 걸로 나옴, \n도 마찬가지 (112~113P)
		System.out.printf("%s %d %1f\n", "홍길동", 100, 23.9);
		System.out.printf("%s\n", "안녕하세요 이름은 조상현입니다");
		System.out.printf("%s %d%s\n", "나이는", 33, "세 입니다");
		System.out.printf("%s %.1f%s", "몸무게는", 72.5, "입니다" );
	} 
	// 다른 예시
//	String formatStr = "안녕하세요 %s입니다 \n";
//	formatStr += "나이는 %d세입니다 \n";
//	formatStr += "몸무게는 %.1f입니다 \n";
//	System.out.printf(formatStr, "이창호", 20, 67.8);
	
	public static void test4() {
		Scanner scn = new Scanner(System.in);
		String str = "친구 목록은 ";
		boolean isFirst = true;
		while (true) {
			System.out.println("친구 이름 입력 종료할려면 quit>>");
			String msg = scn.nextLine();
			if (msg.equals("quit")) { // equals 로 비교
				str += " 입니다";
				break;
			}
			System.out.println("입력한 값은" + msg);
			if (isFirst) {
				str += msg;
				isFirst = false;
			} else {
				str += ", " + msg;
			}
		}
		System.out.println(str);
		// System.out.println("end of prog.");
	} // end of test4

	public static void test3() {
		// 사용자의 입력 값을 읽어들이기
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("학생의 점수를 입력>>");
			String value = scn.nextLine(); // 입력 값을 문자열 형태로 반환
			int score = Integer.parseInt(value);
			// System.out.println("입력 값은" + value);
			sum += score;
		}
		double avg = sum / 3.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("평균 : " + avg);
	} // end of test3

	public static void test2() {
		int sum = 0;
		for (int i = 1; i <= 7; i++) {
			int result = (int) (Math.random() * 71) + 30;
			sum += result;
			System.out.println(result);
		}
		double avg = sum / 7.0;
		avg = Math.round(avg * 100) / 100.0;
		System.out.println("평균 : " + avg);
	} // end of test2

	public static void test() {
		int sum = 0;
		// 1 ~ 10까지의 누적
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과 : " + sum);
	} // end of test

} // end of class
