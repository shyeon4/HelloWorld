package com.yedam.condition;

import java.util.Scanner;

public class IfExe {
	public static void main(String[] args) {
	    	int answer = (int) (Math.random()*100) +1;
	        int input = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("1과 100 사이의 정수를 입력하세요.");
	        System.out.println(" (정답 : " + answer + ")"); //정답 미리 알고 싶을 때 사용
	        do {
	        	input = sc.nextInt(); //최초로 한 번 실행
	            if (input > answer) {
	            	System.out.println("더 작은 수로 입력하세요.");
	            } else if (input < answer) {
	            	System.out.println("더 큰 수로 입력하세요.");
	            }
			} while (input != answer);
	        	System.out.println("정답입니다.");
	            sc.close();
		}
	}
}

		
		
		
		
		
	public static void test() {
		int score = 85;

		// if
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {		
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else {
//			System.out.println("불합격");
//		}
//	}

		// switch
		score = score / 10;
		switch (score) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("불합격");
		}
		
	}
}