package com.yedam.condition;

public class LoopExe {

	// 가위1, 바위2, 보3
	// 1, 2, 3 <==> 가위1바위2보3종료4

	public static void main(String[] args) {
		// You lost, You win, Same
	
	}

	
	
	
	
	public static void test() {
		// while vs do.. while
		boolean run = false;

//		while (run) {
//			System.out.println(while문);
//			run = !run;
//		}

		do {
			System.out.println("while문");
			run = !run;
		} while (run);

		System.out.println("end of prog");
	}

}
