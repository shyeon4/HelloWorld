package com.yedam;

public class JSExe {
	public static void main(String[] args) {
		// 1~10 사이의 임의의 값 생성
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			int result = (int) (Math.random() * 10) + 1; // 1<= x < 11
			sum += result;
		}
		System.out.println("결과 : " + sum);

	} // end of main

	public static void test() {
		int sum = 0;
		// 1~ 10까지의 누적
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println("결과 : " + sum);
	}

} // end of class