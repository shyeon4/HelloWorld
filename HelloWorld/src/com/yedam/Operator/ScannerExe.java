package com.yedam.Operator;

import java.util.Scanner;
// 컨트롤쉬프트o

public class ScannerExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int balance = 0; // 계좌의 금액
		while(true) {
			System.out.println("1.입금 2.출금 3.잔액 4.종료");
			int menu = Integer.parseInt(scn.nextLine()); // Integer.parseInt("30"); 뭔 소리야
			if(menu == 1) {
				System.out.println("입금액을 입력하세요");
				// 입금 기능 구현
				int deposit = Integer.parseInt(scn.nextLine());
				if(balance < 100000) {
					System.out.println("10만 원을 초과했습니다");
					return;
				} else
					balance += deposit;
					System.out.println("입금 완료");
					
			} else if (menu == 2) {
				System.out.println("출금액을 입력하세요");
				// 출금 기능 구현
				int withdraw = Integer.parseInt(scn.nextLine());
				if(balance - withdraw >= 0) {
				balance -= withdraw;
				System.out.println("출금 완료");
				} else
					System.out.println("잔액이 부족합니다");
				
			} else if (menu == 3) {
				System.out.println("남은 잔액 :" + balance);
				
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			} else {
				System.out.println("1~ 4번 중에 선택하세요");
			}
		} // end of while
		System.out.println("end of prog");
		
	} // end of main

} // end of class