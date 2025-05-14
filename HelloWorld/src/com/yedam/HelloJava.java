package com.yedam;

public class HelloJava {
	public static void main(String[] args) {
		// int(정수), double(실수), boolean(참거짓)
		int num1 = 10; // 변수를 선언하면서 초기화한다???
		double num2 = 20; // 실수인데 정수가 담김, 작은 값이라서? 자동형변환(promotion) 
		
		num1 = (int) num2; // 강제형변환(casting);
		
		int num3 = 100;
		double num4 = 200;
		double result = (double)num3 + num4;
		System.out.println("결과는 " + result);
		
		// 20 + 30 = 50
		// "결과는 " 데이터 타입이 먼저 있으면 2030이 나오는데 ()를 넣어서 먼저 하면 계산됨(자동형변환)
		System.out.println("결과는 " + (20 + 30));
	}

}

// 정렬 기능 컨트롤쉬프트F
