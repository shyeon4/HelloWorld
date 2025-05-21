package com.yedam.Operator;

public class OperatorExe {

	public static void main(String[] args) {
		test4();
	}
	
	public static void test5() {
		String pass = "";
		int score = (int) (Math.random() * 100);
//		if(score > 60) {
//			pass = "합격";
//		} else {
//			pass = "불합격";
//		}
		
//		pass = (score >= 60) ? "합격" : "불합격";
//		System.out.println(score);
//		System.out.println(pass);
		
//		pass = (score >= 80) ? "우수" : ((score > 60) ? "합격" : "불합격");
		pass = (score >= 60) ? (score > 80) ? "우수" : "합격" : "불합격";
		System.out.printf("%d점은 %s입니다", score, pass);
	} 
	
	
	// "월" 정보를 입력하면 "공란"이 몇 개인지 반환하는 메소드 = getSpace()
	public static int getSpace(int month) {
		int space = 0;
		if(month == 3) {
			space = 6; 
		} else if(month == 4) {
			space = 2;
		} else if(month == 5) {
			space = 4;
		} else if(month == 7) {
			space = 2;
		}
		return space;
	} // end of getSpace
	
	
	
	// "월" 정보를 입력하면 "말일"을 알려주는 메소드 = getLastDate()
	public static int getLastDate(int month) {
		int lastDate = 31;
		switch(month) {
		case 2:
			lastDate = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
		}
		return lastDate; // 케이스에 없는 월은 31일, 2월는 28일, 있는 건 30일
	} // end of getLastDate

	
	
	// 연습5 
	public static void test4() {
	int mon = 7; // 월 정보를 입력
	// 요일
	System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	int space = getSpace(mon);
	int lastDate = getLastDate(mon);
	
	// 빈 공간
	for(int s = 1; s <= space; s++) {
		System.out.printf("%4s", " ");
	}
	
	// 날짜 출력
	for(int day = 1; day <= 31; day++) {
		System.out.printf("%4d", day); // %3d = __1
		if((day + space) % 7 == 0) { 
		System.out.println(); // 7일마다 엔터
			}
		}
	}

	
	
	// 연습4
	public static void test3() {
		boolean isTrue = true;
		for(int i=1; i<=10; i++) {
			if(isTrue) {
				System.out.printf("i의 값은 %d\n",i);
			}
			isTrue = !isTrue; 
			// 토글(on을 off로 ↔ off를 on으로)
			// 1=ON, 2=OFF..라서 홀수만 나옴
		}
	}

	
	
	// 연습3
	public static void test2() {
		int num1 = 10;
		int num2 = 20;
		
		int result = ++num1 + num2++;
		System.out.printf("num1 => %d, num2 => %d, result => %d", num1, num2, result);
		// ++num1은 result 계산 전이고 num2++는 계산 후 
		
		boolean isTrue = true;
		if(!isTrue) {
			System.out.println("참ㅊㅋ");
		}
		// !가 붙어서 false
		
		// == 부정은 !=
		// > 부정은 <=
		// >= 부정은 <
		result = 30;
		if(!(result != 30)) {
			System.out.println("\nresult는 30보다 작거나 같다");
		}
		
		if(!(--num1 > 10 || num2 < 20)) {
			System.out.printf("num1 => %d, num2 => %d", num1, num2);
		}
	}

	
	
	// 연습2 byte, short, int, long, char (정수)
	public static void test1() {
		byte num1 = 127;
		byte num2 = 4;
		byte sum = (byte) (num1 + num2);
		// 정수 연산의 기본은 int
		// 한도 byte를 넘어서면 줄어듬
		System.out.println(sum);
		
		long num3 = 1000000000000000000L;
		long num4 = 100L;
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}

	
	
	// 연습1 증가, 감소 연산자 (++, --)
	public static void test() {
		byte num1 = -128;
		num1 = 127;
		num1++;
		System.out.println(num1);
		
		char ch1 = 'A'; // =65
		ch1 = 66;
		ch1 = '가';	
		ch1 = 'A';
		ch1 = 0x29D7;
		for(int i=1; i<30; i++) {
			System.out.println(ch1++);
		}
	}

}
