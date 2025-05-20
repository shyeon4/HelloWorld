package com.yedam;

import com.yedam.member.Member;

public class CalculatorExe {
	public static void main(String[] args) {
		Calculator cal = new Calculator(); // 인스턴스 생성
		int num1 = 10;
		String str = "😛";
		String result = cal.printStar(num1, str); // 매개값
		System.out.println(result);
		
//		int sum = cal.add(num1, 10.5); // 정수만 선언해서 정수만 옴
		double sum = cal.add(num1, 10.5); 
//		System.out.println(sum);
		
		int[] numAry = { 10, 20, 30 };
		sum = cal.add(numAry);
		
		// Member[] 중에서 point가 큰 회원을 반환
		Member[] members = { new Member("user01", "홍길동", "1111", 1000)
				, new Member("user02", "고길동", "2222", 2000)
				, new Member("user03", "김길동", "5555", 5555)
				, new Member("user04", "최길동", "4444", 4000)
		};
		
		// 반환유형(Member), 매개변수(Member[])
		Member member = cal.getMaxPoint(members);
		member.showInfo();
		
		System.out.println("10");
		System.out.println(10);
		System.out.println(true);
	}
}
