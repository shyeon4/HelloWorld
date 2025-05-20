package com.yedam;

import com.yedam.member.Member;

/*
 * 메소드 연습
 * 1) 메소드의 선언
 * 2) 매개변수
 * 3) 반환유형
 */

public class Calculator {
	// 필드
	// 생성자
	// 메소드
	String printStar(int times, String shape) { // 매개변수(times)
		String str = "";
		for (int i = 1; i <= times; i++) {
//			System.out.println(shape);	
			str += shape + "\n";
		}
		return str;
	} // printStar
	
	// 메소드 오버로딩
	int add(int num1, int num2) { // int=정수만 가능함
		return num1 + num2;
	}
	
	double add(int str1, int str2, int str3) { // int=정수만 가능함
		return str1 + str2 + str3;
	}
	
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	// 정수 배열을 매개값으로 받는 add, 반환 유형은 double
	double add(int[] ary) {
		int sum = 0;
		for(int i =0; i < ary.length; i++) {
			sum += ary[i];
		}
		// int -> double 타입으로 자동 변환
		return sum;
	}
	
	// 배열에서 point가 제일 큰 사람를 찾아서 반환
	Member getMaxPoint(Member[] memberArray) {
		
		Member max = null; // 아이디이름연락처포인트
		int maxpoint = 0; // 포인트를 비교하기 위한 변수
		
		for (int i = 0; i < memberArray.length; i++) {
			Member temp = memberArray[i];
			if (maxpoint < temp.getPoint()) {
				maxpoint = temp.getPoint(); // 비교 용도
				max = temp; // max에 최대 포인트를 가진 회원의 정보를 저장
			}
		}
		return max;
		
	}
	

} // class
