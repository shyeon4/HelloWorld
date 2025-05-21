package com.yedam.ref;
// 실행 클래스
public class CalculatorExe {
	public static void main(String[] args) {
		int a = 20, b = 30;
	
	
	// sum의 기능 활용
	Calculator c1 = new Calculator();
	c1.sum(a, b);
	
	Calculator.sum(a, b);
	printStar();
	
	// static이 없으면 인스턴스를 만들어야 실행? 됨 
//	CalculatorExe ce = new CalculatorExe();
//	ce.printStar();
	}
	
	static void printStar() {
		System.out.println("*");
	}
}
