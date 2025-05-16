package com.yedam.condition;

import java.util.Scanner;

public class IfExe {

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